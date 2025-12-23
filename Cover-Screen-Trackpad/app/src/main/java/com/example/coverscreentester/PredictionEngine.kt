
package com.example.coverscreentester

import android.content.Context
import android.graphics.PointF
import java.util.ArrayList
import java.util.Locale
import kotlin.math.hypot
import kotlin.math.ln

/**
 * Handles predictive text and swipe-to-type decoding.
 * Uses a Trie structure for prefix matching and a weighted list for swipe analysis.
 */
class PredictionEngine {

    companion object {
        val instance = PredictionEngine()
    }

    class TrieNode {
        val children = HashMap<Char, TrieNode>()
        var isEndOfWord = false
        var word: String? = null
        var rank: Int = Int.MAX_VALUE // 0 = Most Frequent
    }

    private val root = TrieNode()
    // We keep a flat list for swipe path iteration
    private val wordList = ArrayList<String>()

    init {
        // Load defaults immediately so we have basic words before file I/O completes
        loadDefaults()
    }

    private fun loadDefaults() {
        val commonWords = listOf(
            "the", "be", "to", "of", "and", "a", "in", "that", "have", "i",
            "it", "for", "not", "on", "with", "he", "as", "you", "do", "at",
            "this", "but", "his", "by", "from", "they", "we", "say", "her",
            "she", "or", "an", "will", "my", "one", "all", "would", "there",
            "their", "what", "so", "up", "out", "if", "about", "who", "get",
            "which", "go", "me", "swipe", "keyboard", "trackpad", "android"
        )
        // Insert with arbitrary ranks (0 to N)
        for ((index, word) in commonWords.withIndex()) {
            insert(word, index)
        }
    }

    /**
     * Loads the weighted dictionary from assets asynchronously.
     * The file is expected to be sorted by frequency (most common first).
     */
// =================================================================================
    // FUNCTION: loadDictionary
    // SUMMARY: Loads the weighted dictionary from assets asynchronously with enhanced
    //          logging for debugging. The file should be at assets/dictionary.txt and
    //          sorted by frequency (most common words first). Falls back to defaults
    //          if loading fails.
    // =================================================================================
    fun loadDictionary(context: Context) {
        Thread {
            try {
                val start = System.currentTimeMillis()
                
                // Log available assets for debugging
                try {
                    val assetList = context.assets.list("") ?: emptyArray()
                    android.util.Log.d("DroidOS_Prediction", "Available assets: ${assetList.joinToString(", ")}")
                    if (!assetList.contains("dictionary.txt")) {
                        android.util.Log.e("DroidOS_Prediction", "dictionary.txt NOT FOUND in assets! Make sure to rebuild APK after adding the file.")
                        return@Thread
                    }
                } catch (e: Exception) {
                    android.util.Log.e("DroidOS_Prediction", "Failed to list assets", e)
                }
                
                // Temporary structures to avoid clearing the active dictionary during a swipe/type
                val newRoot = TrieNode()
                val newWordList = ArrayList<String>()
                var lineCount = 0

                context.assets.open("dictionary.txt").bufferedReader().useLines { lines ->
                    lines.forEachIndexed { index, line ->
                        val word = line.trim()
                        if (word.isNotEmpty() && word.all { it.isLetter() }) {
                            val lower = word.lowercase(Locale.ROOT)
                            newWordList.add(lower)
                            lineCount++
                            
                            // Insert into temp Trie
                            var current = newRoot
                            for (char in lower) {
                                current = current.children.computeIfAbsent(char) { TrieNode() }
                            }
                            current.isEndOfWord = true
                            current.word = lower
                            // Store rank (Line Number = Frequency Rank)
                            if (index < current.rank) current.rank = index
                        }
                    }
                }

                if (newWordList.isEmpty()) {
                    android.util.Log.e("DroidOS_Prediction", "Dictionary file was empty or had no valid words!")
                    return@Thread
                }

                // Atomic swap
                synchronized(this) {
                    wordList.clear()
                    wordList.addAll(newWordList)
                    root.children.clear()
                    root.children.putAll(newRoot.children)
                }
                
                android.util.Log.d("DroidOS_Prediction", "Dictionary loaded SUCCESS: $lineCount words in ${System.currentTimeMillis() - start}ms")
                android.util.Log.d("DroidOS_Prediction", "Sample words: ${newWordList.take(10).joinToString(", ")}")
                
            } catch (e: java.io.FileNotFoundException) {
                android.util.Log.e("DroidOS_Prediction", "dictionary.txt not found in assets! Rebuild APK after adding assets/dictionary.txt", e)
            } catch (e: Exception) {
                android.util.Log.e("DroidOS_Prediction", "Failed to load dictionary", e)
            }
        }.start()
    }
    // =================================================================================
    // END BLOCK: loadDictionary
    // =================================================================================

    fun insert(word: String, rank: Int = Int.MAX_VALUE) {
        val lower = word.lowercase(Locale.ROOT)
        synchronized(this) {
            if (!wordList.contains(lower)) wordList.add(lower)
            
            var current = root
            for (char in lower) {
                current = current.children.computeIfAbsent(char) { TrieNode() }
            }
            current.isEndOfWord = true
            current.word = lower
            if (rank < current.rank) current.rank = rank
        }
    }

    /**
     * Returns a list of suggested words for the given prefix, sorted by popularity.
     */
    fun getSuggestions(prefix: String, maxResults: Int = 3): List<String> {
        if (prefix.isEmpty()) return emptyList()
        val cleanPrefix = prefix.lowercase(Locale.ROOT)
        
        var current = root
        for (char in cleanPrefix) {
            current = current.children[char] ?: return emptyList()
        }

        // Collect all candidates in the subtree
        val candidates = ArrayList<Pair<String, Int>>()
        collectCandidates(current, candidates)

        // Sort by Rank (Low number = High frequency), then by length
        candidates.sortWith(compareBy<Pair<String, Int>> { it.second }.thenBy { it.first.length })

        return candidates.take(maxResults).map { it.first }
    }

    private fun collectCandidates(node: TrieNode, results: MutableList<Pair<String, Int>>) {
        if (node.isEndOfWord) {
            node.word?.let { results.add(it to node.rank) }
        }
        for (child in node.children.values) {
            collectCandidates(child, results)
        }
    }

    // --- SWIPE DECODER LOGIC ---
    fun decodeSwipe(swipePath: List<PointF>, keyMap: Map<String, PointF>): List<String> {
        if (swipePath.size < 5) return emptyList()

        val startPt = swipePath.first()
        val endPt = swipePath.last()
        
        // 1. Identify vague Start/End letters (Radius 150px)
        val startKeys = findKeysNear(startPt, keyMap)
        val endKeys = findKeysNear(endPt, keyMap)

        if (startKeys.isEmpty() || endKeys.isEmpty()) return emptyList()

        // 2. Filter dictionary: Word must start/end with keys near the swipe endpoints
        val candidates = wordList.filter { word ->
            if (word.isEmpty()) return@filter false
            val first = word.first().toString()
            val last = word.last().toString()
            startKeys.contains(first) && endKeys.contains(last)
        }

        if (candidates.isEmpty()) return emptyList()

        // 3. Score Candidates
        // Score = Path Distance + Rank Penalty
        // Rank Penalty helps prefer "the" over "thy" when path is ambiguous.
        val scored = candidates.map { word ->
            val pathScore = calculatePathScore(word, swipePath, keyMap)
            
            // Lookup rank efficiently from Trie
            val rank = getWordRank(word)
            // Logarithmic penalty: Common words (Rank 0-100) get almost 0 penalty.
            // Rare words (Rank 9000) get a higher score penalty.
            val rankPenalty = ln((rank + 1).toDouble()).toFloat() * 15f 
            
            val totalScore = pathScore + rankPenalty
            Triple(word, totalScore, rank)
        }

        // Return top 3 matches with lowest score
        return scored.sortedBy { it.second }.take(3).map { it.first }
    }
    
    private fun getWordRank(word: String): Int {
        var current = root
        for (char in word) {
            current = current.children[char] ?: return Int.MAX_VALUE
        }
        return if (current.isEndOfWord) current.rank else Int.MAX_VALUE
    }

    private fun findKeysNear(pt: PointF, keyMap: Map<String, PointF>, threshold: Float = 150f): List<String> {
        val keys = ArrayList<String>()
        for ((key, pos) in keyMap) {
            if (hypot(pt.x - pos.x, pt.y - pos.y) < threshold) {
                keys.add(key.lowercase())
            }
        }
        return keys
    }

    private fun calculatePathScore(word: String, path: List<PointF>, keyMap: Map<String, PointF>): Float {
        var totalDist = 0f
        var pathIndex = 0
        
        for (char in word) {
            val keyPos = keyMap[char.toString().uppercase()] ?: keyMap[char.toString()] ?: continue
            var localMin = Float.MAX_VALUE
            var bestIndex = pathIndex
            
            // Search forward in the path for the closest point to this letter key
            for (i in pathIndex until path.size) {
                val dist = hypot(path[i].x - keyPos.x, path[i].y - keyPos.y)
                if (dist < localMin) {
                    localMin = dist
                    bestIndex = i
                }
            }
            
            // If the key is wildly far from the path, punish it heavily
            if (localMin > 300f) totalDist += 500f
            
            totalDist += localMin
            pathIndex = bestIndex // Enforce chronological order
        }
        
        // Normalize score by word length to be fair to long words
        return totalDist / word.length
    }
}
