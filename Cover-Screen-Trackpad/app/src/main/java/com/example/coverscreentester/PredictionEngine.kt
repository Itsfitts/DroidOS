
package com.example.coverscreentester

import android.content.Context
import android.graphics.PointF
import java.util.ArrayList
import java.util.Locale
import kotlin.math.hypot
import kotlin.math.sqrt
import kotlin.math.max
import kotlin.math.min
import kotlin.math.ln
import kotlin.math.abs

// =================================================================================
// DATA CLASS: TimedPoint
// SUMMARY: A point with timestamp for dwell time analysis in swipe gestures.
//          Allows the prediction engine to detect when users linger on keys
//          to disambiguate similar words like "for" vs "four".
// =================================================================================
data class TimedPoint(
    val x: Float,
    val y: Float,
    val timestamp: Long  // System.currentTimeMillis() when this point was captured
) {
    fun toPointF(): android.graphics.PointF = android.graphics.PointF(x, y)
}
// =================================================================================
// END BLOCK: TimedPoint data class
// =================================================================================

/**
 * =================================================================================
 * CLASS: PredictionEngine
 * SUMMARY: Handles predictive text suggestions and swipe-to-type gesture decoding.
 *          Implements a SHARK2-inspired dual-channel algorithm with:
 *          1. Uniform path sampling (N points)
 *          2. Template generation for dictionary words
 *          3. Shape channel (scale-normalized pattern matching)
 *          4. Location channel (absolute position matching)
 *          5. Integration scoring with word frequency weighting
 *          
 * Based on: SHARK2 algorithm by Kristensson & Zhai (2004)
 * Reference: http://pokristensson.com/pubs/KristenssonZhaiUIST2004.pdf
 * =================================================================================
 */
class PredictionEngine {

    companion object {
        val instance = PredictionEngine()

        // Tuning Parameters
        private const val SAMPLE_POINTS = 64
        private const val NORMALIZATION_SIZE = 100f
        private const val SEARCH_RADIUS = 70f
        
        // Weights: 
        // Shape: 0.25 -> kept low to allow messy sizing
        // Location: 0.85 -> high trust in key hits
        // Direction: 0.5 -> kept low
        // Turn: 1.5 -> SIGNIFICANTLY INCREASED (was 0.9). Sharp corners are now king.
        // Dwell: 0.6 -> Weight for keys where user lingered longer
        private const val SHAPE_WEIGHT = 0.25f
        private const val DWELL_TIME_WEIGHT = 0.6f  // NEW: Weight for time-based key scoring
        private const val DWELL_THRESHOLD_MS = 80L  // Minimum ms to count as "lingering" on a key
        private const val LOCATION_WEIGHT = 0.85f
        private const val DIRECTION_WEIGHT = 0.5f   
        private const val TURN_WEIGHT = 1.5f        
        
        // Files
        private const val USER_STATS_FILE = "user_stats.json"
        private const val BLOCKED_DICT_FILE = "blocked_words.txt"
        private const val USER_DICT_FILE = "user_words.txt"
        private const val MIN_WORD_LENGTH = 2
    }

    // =================================================================================
    // END BLOCK: TUNING PARAMETERS
    // =================================================================================






    // ... (TrieNode class remains the same) ...

    // UPDATE: Add directionVectors to cache the flow of the word
    data class WordTemplate(
        val word: String,
        val rank: Int,
        val rawPoints: List<PointF>,
        var sampledPoints: List<PointF>? = null,
        var normalizedPoints: List<PointF>? = null,
        var directionVectors: List<PointF>? = null // NEW FIELD
    )




    // =================================================================================
    // DATA STRUCTURES
    // =================================================================================
    
    class TrieNode {
        val children = HashMap<Char, TrieNode>()
        var isEndOfWord = false
        var word: String? = null
        var rank: Int = Int.MAX_VALUE // 0 = Most Frequent
    }

    private val root = TrieNode()
    private val wordList = ArrayList<String>()



// --- USER STATS ---
    private val USER_STATS_FILE = "user_stats.json"
    private val userFrequencyMap = HashMap<String, Int>()
    
    // =================================================================================
    // OPTIMIZATION: Pre-indexed word lookup by first and last letter
    // SUMMARY: Instead of filtering all 10k words, we lookup by first letter then
    //          filter by last letter. This reduces candidate pool by ~96% immediately.
    // =================================================================================
    private val wordsByFirstLetter = HashMap<Char, ArrayList<String>>()
    private val wordsByFirstLastLetter = HashMap<String, ArrayList<String>>()
    // =================================================================================
    // END BLOCK: Pre-indexed word lookup
    // =================================================================================
    
    // Template cache - maps word to its template (lazy-computed per keyboard layout)
    private val templateCache = HashMap<String, WordTemplate>()
    private var lastKeyMapHash = 0  // Track if keyboard layout changed

    // --- CUSTOM DICTIONARY STORAGE ---
    private val blockedWords = java.util.HashSet<String>()
    private val customWords = java.util.HashSet<String>()
    // =================================================================================
    // CUSTOM WORD DISPLAY FORMS
    // SUMMARY: Maps lowercase lookup key to the display form with proper capitalization.
    //          E.g., "droidos" -> "DroidOS", "iphone" -> "iPhone"
    //          This allows swiping "droidos" to output "DroidOS".
    // =================================================================================
    private val customWordDisplayForms = HashMap<String, String>()
    // =================================================================================
    // END BLOCK: Custom word display forms
    // =================================================================================
    // Cache for the top 1000 words to make "Hail Mary" pass instant
    private val commonWordsCache = ArrayList<String>()
    // Throttle template failure logging
    private var lastTemplateMissLog = 0L
    
    // =================================================================================
    // END DATA STRUCTURES
    // =================================================================================



    init {
        loadDefaults()
    }



    private fun loadDefaults() {
        val commonWords = listOf(
            "the", "be", "to", "of", "and", "a", "in", "that", "have", "i",
            "it", "for", "not", "on", "with", "he", "as", "you", "do", "at",
            "this", "but", "his", "by", "from", "they", "we", "say", "her",
            "she", "or", "an", "will", "my", "one", "all", "would", "there",
            "their", "what", "so", "up", "out", "if", "about", "who", "get",
            "which", "go", "me", "when", "make", "can", "like", "time", "no",
            "just", "him", "know", "take", "people", "into", "year", "your",
            "good", "some", "could", "them", "see", "other", "than", "then",
            "now", "look", "only", "come", "its", "over", "think", "also",
            "back", "after", "use", "two", "how", "our", "work", "first",
            "well", "way", "even", "new", "want", "because", "any", "these",
            "give", "day", "most", "us", "is", "was", "are", "been", "has",
            "more", "or", "had", "did", "said", "each", "she", "may", "find",
            "long", "down", "did", "get", "made", "live", "back", "little",
            "only", "round", "man", "year", "came", "show", "every", "good",
            "great", "help", "through", "much", "before", "line", "right", 
            "too", "old", "mean", "same", "tell", "boy", "follow", "very",
            "just", "why", "ask", "went", "men", "read", "need", "land",
            "here", "home", "big", "high", "such", "again", "turn", "hand",
            "play", "small", "end", "put", "while", "next", "sound", "below",
            // Common mobile/tech words
            "swipe", "keyboard", "trackpad", "android", "phone", "text", "type",
            "hello", "yes", "no", "ok", "okay", "thanks", "please", "sorry",
            "love", "like", "cool", "nice", "awesome", "great", "good", "bad"
        )
        for ((index, word) in commonWords.withIndex()) {
            insert(word, index)
        }
    }


// =================================================================================
    // USER STATS & PRIORITY LOGIC
    // =================================================================================
    
    private fun loadUserStats(context: Context) {
        try {
            val file = java.io.File(context.filesDir, USER_STATS_FILE)
            if (file.exists()) {
                val content = file.readText()
                // Simple parsing: "word":count
                content.replace("{", "").replace("}", "").split(",").forEach {
                    val parts = it.split(":")
                    if (parts.size == 2) {
                        val w = parts[0].trim().replace("\"", "")
                        val c = parts[1].trim().toIntOrNull() ?: 0
                        userFrequencyMap[w] = c
                    }
                }
                android.util.Log.d("DroidOS_Prediction", "Loaded stats for ${userFrequencyMap.size} words")
            }
        } catch (e: Exception) {
            android.util.Log.e("DroidOS_Prediction", "Failed to load user stats", e)
        }
    }

    private fun saveUserStats(context: Context) {
        Thread {
            try {
                val sb = StringBuilder("{")
                synchronized(userFrequencyMap) {
                    var first = true
                    for ((k, v) in userFrequencyMap) {
                        if (!first) sb.append(",")
                        sb.append("\"$k\":$v")
                        first = false
                    }
                }
                sb.append("}")
                val file = java.io.File(context.filesDir, USER_STATS_FILE)
                file.writeText(sb.toString())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.start()
    }

    /**
     * Call this when the user clicks a word in the suggestion bar.
     * Boosts the word's priority for future predictions.
     */

/**
     * Call this when the user clicks a word in the suggestion bar.
     * Boosts the word's priority for future predictions.
     * NOTE: This no longer auto-learns new words. Use learnWord() for that.
     */
    fun recordSelection(context: Context, word: String) {
        if (word.isBlank()) return
        val clean = word.lowercase(Locale.ROOT)
        
        synchronized(userFrequencyMap) {
            val count = userFrequencyMap.getOrDefault(clean, 0)
            userFrequencyMap[clean] = count + 1
        }
        
        // FIX: Removed auto-learning. Typos won't be added automatically.
        // The UI must call learnWord() explicitly when the user selects a "New Word".
        // if (!hasWord(clean)) {
        //    learnWord(context, clean)
        // }
        
        saveUserStats(context)
    }


    fun loadDictionary(context: Context) {
        Thread {
            try {
                loadUserStats(context)
                val start = System.currentTimeMillis()
                val newRoot = TrieNode()
                val newWordList = ArrayList<String>()
                val newBlocked = java.util.HashSet<String>()
                val newCustom = java.util.HashSet<String>()
                var lineCount = 0


                val newWordsByFirstLetter = HashMap<Char, ArrayList<String>>()
                val newWordsByFirstLastLetter = HashMap<String, ArrayList<String>>()
                // FIX: Declare here so it is accessible in the commit block
                val newDisplayForms = HashMap<String, String>()


                // =================================================================================
                // LOAD CUSTOM LISTS (User & Blocked)
                // SUMMARY: Loads user's custom words and blocked words from persistent storage.
                // =================================================================================
                try {
                    val blockFile = java.io.File(context.filesDir, BLOCKED_DICT_FILE)
                    if (blockFile.exists()) {
                        val blockedLines = blockFile.readLines().map { it.trim().lowercase(java.util.Locale.ROOT) }.filter { it.isNotEmpty() }
                        newBlocked.addAll(blockedLines)
                        android.util.Log.d("DroidOS_Prediction", "LOAD: Blocked words file found, ${blockedLines.size} words")
                    } else {
                        android.util.Log.d("DroidOS_Prediction", "LOAD: No blocked words file exists yet")
                    }

                    val userFile = java.io.File(context.filesDir, USER_DICT_FILE)
                    if (userFile.exists()) {
                        val userLines = userFile.readLines().map { it.trim() }.filter { it.isNotEmpty() }
                        
                        // FILTER: Check each user word against garbage filter on load
                        // Also build display forms map
                        for (originalForm in userLines) {
                            val lookupForm = originalForm.lowercase(java.util.Locale.ROOT)
                            val trieKey = lookupForm.replace("'", "")
                            
                            if (!looksLikeGarbage(trieKey)) {
                                newCustom.add(lookupForm)
                                // Store display form mapping
                                newDisplayForms[lookupForm] = originalForm
                                newDisplayForms[trieKey] = originalForm
                            } else {
                                android.util.Log.d("DroidOS_Prediction", "Pruned garbage from user dict: $originalForm")
                            }
                        }
                        android.util.Log.d("DroidOS_Prediction", "LOAD: User words file found, ${newCustom.size} valid words")
                    } else {
                        android.util.Log.d("DroidOS_Prediction", "LOAD: No user words file exists yet")
                    }
                } catch (e: Exception) {
                    android.util.Log.e("DroidOS_Prediction", "Failed to load user lists", e)
                }

                // 2. Load Main Dictionary (Assets) - Filtering Blocked words
                try {
                    context.assets.open("dictionary.txt").bufferedReader().useLines { lines ->
                        lines.forEachIndexed { index, line ->
                            val word = line.trim().lowercase(java.util.Locale.ROOT)
                            // SKIP if blocked
                            if (!newBlocked.contains(word) && word.isNotEmpty() && word.all { it.isLetter() } && word.length >= MIN_WORD_LENGTH) {
                                newWordList.add(word)
                                lineCount++

                                var current = newRoot
                                for (char in word) {
                                    current = current.children.computeIfAbsent(char) { TrieNode() }
                                }
                                current.isEndOfWord = true
                                current.word = word
                                if (index < current.rank) current.rank = index

                                if (word.length >= 2) {
                                    val firstChar = word.first()
                                    newWordsByFirstLetter.getOrPut(firstChar) { ArrayList() }.add(word)
                                    val key = "${word.first()}${word.last()}"
                                    newWordsByFirstLastLetter.getOrPut(key) { ArrayList() }.add(word)
                                }
                            }
                        }
                    }
                } catch (e: Exception) {
                    android.util.Log.e("DroidOS_Prediction", "Dictionary asset load failed: ${e.message}")
                }

                // 3. Merge Custom Words
                for (word in newCustom) {
                    if (!newWordList.contains(word)) {
                        newWordList.add(word)
                        var current = newRoot
                        for (char in word) {
                            current = current.children.computeIfAbsent(char) { TrieNode() }
                        }
                        current.isEndOfWord = true
                        current.word = word
                        current.rank = 0 // High priority

                        if (word.length >= 2) {
                            val firstChar = word.first()
                            newWordsByFirstLetter.getOrPut(firstChar) { ArrayList() }.add(word)
                            val key = "${word.first()}${word.last()}"
                            newWordsByFirstLastLetter.getOrPut(key) { ArrayList() }.add(word)
                        }
                    }
                }

                // 4. Merge Hardcoded Defaults
                val existingDefaults = synchronized(this) { ArrayList(wordList) }
                for (defaultWord in existingDefaults) {
                    val lower = defaultWord.lowercase(java.util.Locale.ROOT)
                    if (!newBlocked.contains(lower) && !newWordList.contains(lower)) {
                        newWordList.add(lower)
                        var current = newRoot
                        for (char in lower) {
                            current = current.children.computeIfAbsent(char) { TrieNode() }
                        }
                        current.isEndOfWord = true
                        current.word = lower
                        if (current.rank > 100) current.rank = 50
                    }
                }

                // 5. Commit Changes
                synchronized(this) {
                    wordList.clear()
                    wordList.addAll(newWordList)
                    root.children.clear()
                    root.children.putAll(newRoot.children)

                    wordsByFirstLetter.clear()
                    wordsByFirstLetter.putAll(newWordsByFirstLetter)
                    wordsByFirstLastLetter.clear()
                    wordsByFirstLastLetter.putAll(newWordsByFirstLastLetter)

                    blockedWords.clear()
                    blockedWords.addAll(newBlocked)
                    customWords.clear()
                    customWords.addAll(newCustom)
                    
                    // Load display forms
                    customWordDisplayForms.clear()
                    customWordDisplayForms.putAll(newDisplayForms)
                    customWords.addAll(newCustom)

                    templateCache.clear()

                    // Populate Common Words Cache (Top 1000)
                    commonWordsCache.clear()
                    commonWordsCache.addAll(
                        wordList.sortedBy { getWordRank(it) }.take(1000)
                    )
                }
                // =================================================================================
                // OPTIMIZATION: Pre-warm template cache for common words
                // SUMMARY: Pre-compute templates for top 500 words to eliminate lag on first swipe.
                //          This runs in background so doesn't block UI.
                // =================================================================================
                // Note: Templates require keyMap which we don't have here.
                // Templates will be created on first use, but the word indexes are ready.
                // =================================================================================
                android.util.Log.d("DroidOS_Prediction", "Dictionary Loaded: $lineCount asset + ${newCustom.size} user words + ${newBlocked.size} blocked. Common Cache: ${commonWordsCache.size}")

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.start()
    }




// =================================================================================
    // FUNCTION: learnWord
    // SUMMARY: Learns a new word and saves to user_words.txt
    //          
    // SMART CAPITALIZATION:
    //   - If at sentence start: strip first-letter cap, keep internal caps
    //     E.g., "DroidOS" at start → stored as "droidOS" 
    //   - If mid-sentence: keep all caps as typed
    //     E.g., "DroidOS" mid-sentence → stored as "DroidOS"
    //   - When suggesting, always use the stored display form
    //
    // @param isSentenceStart: true if word was typed at beginning of sentence
    // =================================================================================
    fun learnWord(context: Context, word: String, isSentenceStart: Boolean = false) {
        if (word.length < 2) return

        val originalWord = word.trim()
        
        // =======================================================================
        // SMART CAPITALIZATION
        // If at sentence start, the first letter being capital is automatic,
        // so we should store without that automatic cap to get the "true" form.
        // E.g., User types "DroidOS" at start → they want "droidOS" normally
        // But if typed mid-sentence as "DroidOS" → they want "DroidOS" always
        // =======================================================================
        val displayForm = if (isSentenceStart && originalWord.isNotEmpty() && originalWord[0].isUpperCase()) {
            // Strip the automatic sentence-start capitalization
            originalWord[0].lowercaseChar() + originalWord.substring(1)
        } else {
            // Keep as-is (mid-sentence or already lowercase)
            originalWord
        }
        // =======================================================================
        // END BLOCK: Smart capitalization
        // =======================================================================
        
        val lookupWord = displayForm.lowercase(java.util.Locale.ROOT)
        val trieKey = lookupWord.replace("'", "")  // For trie lookup

        // Don't learn garbage
        if (looksLikeGarbage(trieKey)) {
             android.util.Log.d("DroidOS_Prediction", "Ignored garbage input: $originalWord")
             return
        }

        // Don't relearn if already known (but allow updating display form)
        val alreadyKnown = hasWord(trieKey) || hasWord(lookupWord)
        
        Thread {
            try {
                synchronized(this) {
                    customWords.add(lookupWord)
                    blockedWords.remove(lookupWord)
                    blockedWords.remove(trieKey)
                    
                    // Store the display form for this word
                    customWordDisplayForms[lookupWord] = displayForm
                    customWordDisplayForms[trieKey] = displayForm
                    
                    // Insert base form (without apostrophe) for swipe matching
                    if (!alreadyKnown) {
                        insert(trieKey, 0)
                        
                        // Also insert with apostrophe if present
                        if (lookupWord.contains("'")) {
                            insert(lookupWord, 0)
                        }
                    }

                    // FIX: File I/O moved INSIDE synchronized block to prevent race conditions
                    val file = java.io.File(context.filesDir, USER_DICT_FILE)
                    
                    // If already known, we need to update the file (remove old, add new)
                    if (alreadyKnown) {
                        val existingLines = if (file.exists()) file.readLines() else emptyList()
                        val updatedLines = existingLines.filter { 
                            it.trim().lowercase(java.util.Locale.ROOT).replace("'", "") != trieKey 
                        } + displayForm
                        file.writeText(updatedLines.joinToString("\n") + "\n")
                        android.util.Log.d("DroidOS_Prediction", "Updated word: '$displayForm' (was in dict, updated display form)")
                    } else {
                        file.appendText("$displayForm\n")
                        android.util.Log.d("DroidOS_Prediction", "Learned word: '$displayForm' (lookup: '$trieKey', sentenceStart=$isSentenceStart)")
                    }

                    // Safe to call here (it uses synchronized data)
                    saveSetToFile(context, BLOCKED_DICT_FILE, blockedWords)
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.start()
    }
    // =================================================================================
    // END BLOCK: learnWord with smart capitalization
    // =================================================================================

// =================================================================================
    // FUNCTION: getDisplayForm
    // SUMMARY: Returns the proper display form for a custom word.
    //          E.g., "droidos" -> "DroidOS", "iphone" -> "iPhone"
    //          Returns the input unchanged if not a custom word.
    // =================================================================================
    fun getDisplayForm(word: String): String {
        val lookup = word.lowercase(java.util.Locale.ROOT)
        val lookupNoApostrophe = lookup.replace("'", "")
        
        return customWordDisplayForms[lookup] 
            ?: customWordDisplayForms[lookupNoApostrophe]
            ?: word
    }
    // =================================================================================
    // END BLOCK: getDisplayForm
    // =================================================================================

    // =================================================================================
    // FUNCTION: saveSetToFile
    // SUMMARY: Saves a set of words to a file in the app's private storage.
    // =================================================================================
    private fun saveSetToFile(context: Context, filename: String, data: Set<String>) {
        try {
            val file = java.io.File(context.filesDir, filename)
            // FIX: Append newline to prevent next write from merging with last word (e.g. can'twon't)
            val content = data.filter { it.isNotEmpty() }.joinToString("\n") + "\n"
            file.writeText(content)
            android.util.Log.d("DroidOS_Prediction", "SAVEFILE: Wrote ${data.size} items to $filename")
        } catch (e: Exception) {
            android.util.Log.e("DroidOS_Prediction", "SAVEFILE FAILED: $filename - ${e.message}", e)
        }
    }
    // =================================================================================
    // END BLOCK: saveSetToFile
    // =================================================================================

    // =================================================================================
    // FILTER: GARBAGE DETECTION
    // Rule: Must have at least one vowel/y OR be in the whitelist.
    // =================================================================================
    private val VALID_VOWELLESS = setOf(
        "hmm", "shh", "psst", "brr", "pfft", "nth", "src", "jpg", "png", "gif",
        "txt", "xml", "pdf", "css", "html", "tv", "pc", "ok", "id", "cv", "ad", "ex", "vs", "mr", "dr", "ms"
    )

    // =================================================================================
    // FUNCTION: looksLikeGarbage
    // SUMMARY: Filters random letter combinations. Must have vowel or be whitelisted.
    // UPDATED: Strips apostrophes before checking (don't -> dont has vowel)
    // =================================================================================
    private fun looksLikeGarbage(word: String): Boolean {
        val checkWord = word.replace("'", "")
        if (checkWord.length > 1) {
            val hasVowel = checkWord.any { "aeiouyAEIOUY".contains(it) }
            if (!hasVowel) {
                if (VALID_VOWELLESS.contains(checkWord.lowercase(java.util.Locale.ROOT))) return false
                return true
            }
        }
        return false
    }
    // =================================================================================
    // END BLOCK: looksLikeGarbage
    // =================================================================================

    fun hasWord(word: String): Boolean {
        return wordList.contains(word.lowercase(Locale.ROOT))
    }

    // =================================================================================
    // FUNCTION: isWordBlocked
    // SUMMARY: Checks if a word is in the blocked list.
    // =================================================================================
    fun isWordBlocked(word: String): Boolean {
        return blockedWords.contains(word.lowercase(Locale.ROOT))
    }
// =================================================================================
    // END BLOCK: isWordBlocked
    // =================================================================================

    // =================================================================================
    // FUNCTION: isCustomWord
    // SUMMARY: Checks if a word is in the user's custom dictionary.
    //          Used to style user-added words differently (italic) in prediction bar.
    // =================================================================================
    fun isCustomWord(word: String): Boolean {
        val lower = word.lowercase(Locale.ROOT)
        val withoutApostrophe = lower.replace("'", "")
        return customWords.contains(lower) || customWords.contains(withoutApostrophe)
    }
    // =================================================================================
    // END BLOCK: isCustomWord
    // =================================================================================    // =================================================================================
    // FUNCTION: insert
    // SUMMARY: Inserts a word into the Trie and the first/last letter index.
    // =================================================================================
    fun insert(word: String, rank: Int) {
        val lower = word.lowercase(Locale.ROOT)
        if (lower.length < 2) return  // Skip single-letter words
        
        var node = root
        for (c in lower) {
            node = node.children.getOrPut(c) { TrieNode() }
        }
        node.isEndOfWord = true
        node.word = lower
        node.rank = rank
        
        // OPTIMIZATION: Add to first-letter index
        val firstChar = lower.first()
        wordsByFirstLetter.getOrPut(firstChar) { ArrayList() }.add(lower)
        
        // OPTIMIZATION: Add to first+last letter index for fast lookup
        val key = "${lower.first()}${lower.last()}"
        wordsByFirstLastLetter.getOrPut(key) { ArrayList() }.add(lower)
    }
    // =================================================================================
    // END BLOCK: insert
    // =================================================================================

    /**
     * Returns a list of suggested words for the given prefix, sorted by popularity.
     */
    // =================================================================================
    // FUNCTION: getSuggestions
    // SUMMARY: Returns suggested words for a given prefix, sorted by popularity.
    //          Filters out blocked words to prevent them from appearing in suggestions.

// =================================================================================
    // FUNCTION: getSuggestions (Updated for Priority Sort)
    // =================================================================================


    fun getSuggestions(prefix: String, maxResults: Int = 3): List<String> {
        if (prefix.isEmpty()) return emptyList()
        val cleanPrefix = prefix.lowercase(java.util.Locale.ROOT)

        var current = root
        for (char in cleanPrefix) {
            current = current.children[char] ?: return emptyList()
        }

        val candidates = ArrayList<Pair<String, Int>>()
        collectCandidates(current, candidates)
        
        val sortedCandidates = candidates.sortedWith(Comparator { a, b ->
            val wordA = a.first
            val wordB = b.first
            
            val countA = userFrequencyMap[wordA] ?: 0
            val countB = userFrequencyMap[wordB] ?: 0
            
            if (countA != countB) return@Comparator countB - countA
            val rankA = a.second
            val rankB = b.second
            if (rankA != rankB) return@Comparator rankA - rankB
            wordA.length - wordB.length
        })

        return sortedCandidates
            .filter { !blockedWords.contains(it.first.lowercase(java.util.Locale.ROOT)) }
            .distinctBy { it.first }
            .take(maxResults)
            .map { it.first }
    }



    // =================================================================================
    // FUNCTION: collectCandidates
    // SUMMARY: Recursively collects word candidates from trie nodes.
    //          Skips blocked words during traversal for efficiency.
    // =================================================================================
    private fun collectCandidates(node: TrieNode, results: MutableList<Pair<String, Int>>) {
        if (node.isEndOfWord) {
            node.word?.let { word ->
                // Skip blocked words
                if (!blockedWords.contains(word)) {
                    results.add(word to node.rank)
                }
            }
        }
        for (child in node.children.values) {
            collectCandidates(child, results)
        }
    }
    // =================================================================================
    // END BLOCK: collectCandidates
    // =================================================================================

    // =================================================================================
    // SHARK2-INSPIRED SWIPE DECODER LOGIC
    // =================================================================================
    
    /**
     * Main entry point for decoding a swipe gesture into word candidates.
     * Implements SHARK2-style dual-channel matching with:
     * 1. Path sampling to uniform N points
     * 2. Candidate pruning by start/end keys
     * 3. Shape channel scoring (normalized patterns)
     * 4. Location channel scoring (absolute positions)  
     * 5. Integration with frequency weighting
     */
    // =================================================================================
    // FUNCTION: decodeSwipe (Adaptive Length + Robust Neighbors)
    // =================================================================================
// =================================================================================
    // FUNCTION: decodeSwipe (v6 - Turn-Aware Scoring)
    // SUMMARY: Based on original working version with:
    //          - NEW turn detection for shortcut, android, circle
    //          - Conservative dwell for as/ass, to/too
    //          - Original candidate collection and length filtering
    // =================================================================================
    fun decodeSwipe(swipePath: List<PointF>, keyMap: Map<String, PointF>): List<String> {
        if (swipePath.size < 3 || keyMap.isEmpty()) return emptyList()
        if (wordList.isEmpty()) {
            loadDefaults()
            return emptyList()
        }

        val keyMapHash = keyMap.hashCode()
        if (keyMapHash != lastKeyMapHash) {
            templateCache.clear()
            lastKeyMapHash = keyMapHash
        }

        val inputLength = getPathLength(swipePath)
        if (inputLength < 10f) return emptyList()

        // =======================================================================
        // DWELL DETECTION (Conservative - for to/too, as/ass)
        // =======================================================================
        var dwellScore = 0f
        if (swipePath.size > 12) {
            val tailSize = maxOf(12, swipePath.size / 4)
            val tailStart = maxOf(0, swipePath.size - tailSize)
            val tail = swipePath.subList(tailStart, swipePath.size)
            
            var tailLength = 0f
            for (i in 1 until tail.size) {
                tailLength += hypot(tail[i].x - tail[i-1].x, tail[i].y - tail[i-1].y)
            }
            
            val avgMovementPerPoint = tailLength / tail.size
            dwellScore = when {
                avgMovementPerPoint < 2f -> 1.0f
                avgMovementPerPoint < 4f -> 0.6f
                avgMovementPerPoint < 7f -> 0.2f
                else -> 0f
            }
        }
        val isDwellingAtEnd = dwellScore >= 0.6f
        // =======================================================================
        // END DWELL DETECTION
        // =======================================================================

        val sampledInput = samplePath(swipePath, SAMPLE_POINTS)
        val normalizedInput = normalizePath(sampledInput)
        val inputDirections = calculateDirectionVectors(sampledInput)

        // NEW: Calculate turn points for input
        val inputTurns = detectTurns(inputDirections)

        // NEW: Extract sequence of keys the path passes through
        // This is CRITICAL for distinguishing "awake" vs "awesome"

        val pathKeys = extractPathKeys(sampledInput, keyMap, 8)

        val startPoint = sampledInput.first()
        val endPoint = sampledInput.last()

        // FIX: Define startKey and endKey (Missing in previous build)
        val startKey = findClosestKey(startPoint, keyMap)
        val endKey = findClosestKey(endPoint, keyMap)
        
// =======================================================================
        // CANDIDATE COLLECTION (Enhanced with Path Key Matching)
        // SUMMARY: Collects candidates using:
        //          1. Start/End neighbor search (original)
        //          2. PREFIX INJECTION (original)  
        //          3. PATH KEY INJECTION - NEW: Add words containing detected path keys
        //             This ensures "awake" is included when path shows a→w→...
        //          4. User History (original)
        // =======================================================================
        val candidates = HashSet<String>()
        
        // 1. Neighbor Search (original)
        val nearbyStart = findNearbyKeys(startPoint, keyMap, 80f)
        val nearbyEnd = findNearbyKeys(endPoint, keyMap, 80f)
        
        for (s in nearbyStart) {
            for (e in nearbyEnd) {
                wordsByFirstLastLetter["${s}${e}"]?.let { candidates.addAll(it) }
            }
        }
        
        // 2. PREFIX INJECTION (original)
        if (startKey != null) {
            wordsByFirstLetter[startKey.first()]?.let { words ->
                candidates.addAll(words.sortedByDescending { userFrequencyMap[it] ?: 0 }.take(25))
            }
        }

                // 3. PATH KEY INJECTION (Enhanced)

                // If path shows specific intermediate keys, add words that contain those keys.

                // We increased limits (30->150) to ensure "awake" isn't pushed out by common words.

                if (pathKeys.size >= 2) {

                    val secondKey = pathKeys.getOrNull(1)?.firstOrNull()?.lowercaseChar()

                    if (secondKey != null && startKey != null) {

                        wordsByFirstLetter[startKey.first()]?.let { words ->

                            val matchingWords = words.filter { word ->

                                word.length >= 2 && word.drop(1).contains(secondKey)

                            }.sortedByDescending { userFrequencyMap[it] ?: 0 }.take(150) // Increased from 30

                            candidates.addAll(matchingWords)

                        }

                    }

        

                    // Also check third key if present

                    val thirdKey = pathKeys.getOrNull(2)?.firstOrNull()?.lowercaseChar()

                    if (thirdKey != null && startKey != null && thirdKey != secondKey) {

                        wordsByFirstLetter[startKey.first()]?.let { words ->

                            val matchingWords = words.filter { word ->

                                word.length >= 3 && word.drop(1).contains(thirdKey)

                            }.sortedByDescending { userFrequencyMap[it] ?: 0 }.take(150) // Increased from 20

                            candidates.addAll(matchingWords)

                        }

                    }

                    

                    // 3.5 STRICT SEQUENCE MATCH (New)

                    // If we have a complex path (e.g. a->w->a->e), specifically look for words

                    // that contain ALL these keys in relative order.

                    if (pathKeys.size >= 3 && startKey != null) {

                        wordsByFirstLetter[startKey.first()]?.let { words ->

                            // Get all intermediate keys (excluding start)

                            val requiredKeys = pathKeys.drop(1).map { it.firstOrNull()?.lowercaseChar() }.filterNotNull()

                            

                            val strictMatches = words.filter { word ->

                                var lastIdx = 0

                                var matches = true

                                for (rk in requiredKeys) {

                                    val idx = word.indexOf(rk, lastIdx)

                                    if (idx == -1) { 

                                        matches = false; break 

                                    }

                                    lastIdx = idx + 1

                                }

                                matches

                            }.take(50) // Force include these specific matches

                            

                            if (strictMatches.isNotEmpty()) {

                                candidates.addAll(strictMatches)

                                android.util.Log.d("DroidOS_PathKeys", "Strict Match found: ${strictMatches.take(5)}")

                            }

                        }

                    }

                }

        

                // 4. User History (original)

                synchronized(userFrequencyMap) {

                    candidates.addAll(userFrequencyMap.entries

                        .sortedByDescending { it.value }

                        .take(30) // Increased from 15

                        .map { it.key })

                }

        

                // Debug: Log total candidates

                android.util.Log.d("DroidOS_PathKeys", "Total candidates: ${candidates.size}")

        

                // =======================================================================

                // END CANDIDATE COLLECTION

                // =======================================================================

        

                // --- SCORING ---

                val scored = candidates

                    .filter { !isWordBlocked(it) && it.length >= MIN_WORD_LENGTH }

                    .sortedWith(compareByDescending<String> { userFrequencyMap[it] ?: 0 }.thenBy { getWordRank(it) })

                    .take(400) // Increased from 150 to prevent dropping valid low-frequency words

                    .mapNotNull { word ->
                val template = getOrCreateTemplate(word, keyMap) ?: return@mapNotNull null
                
                // --- ADAPTIVE LENGTH FILTER (Original) ---
                val tLen = getPathLength(template.rawPoints)
                val ratio = tLen / inputLength
                
                val maxRatio = if (inputLength < 150f) 1.5f else 5.0f
                if (ratio > maxRatio || ratio < 0.4f) return@mapNotNull null

                if (template.sampledPoints == null) {
                    template.sampledPoints = samplePath(template.rawPoints, SAMPLE_POINTS)
                    template.normalizedPoints = normalizePath(template.sampledPoints!!)
                    template.directionVectors = calculateDirectionVectors(template.sampledPoints!!)
                }
                
                val shapeScore = calculateShapeScore(normalizedInput, template.normalizedPoints!!)
                val locScore = calculateLocationScore(sampledInput, template.sampledPoints!!)
                val dirScore = calculateDirectionScore(inputDirections, template.directionVectors!!)

                // NEW: Turn matching score
                val templateTurns = detectTurns(template.directionVectors!!)
                val turnScore = calculateTurnScore(inputTurns, templateTurns)

                // NEW: Path key matching score - penalizes words where path doesn't match
                // This distinguishes "awake" (path goes through w) from "awesome" (path would need s)
                val pathKeyScore = calculatePathKeyScore(pathKeys, word)

                val integrationScore = (shapeScore * SHAPE_WEIGHT) +
                                       (locScore * LOCATION_WEIGHT) +
                                       (dirScore * DIRECTION_WEIGHT) +
                                       (turnScore * TURN_WEIGHT) +
                                       (pathKeyScore * 0.8f)  // NEW: Path key matching weight
                

                // --- BOOSTS (Original) ---
                val rank = template.rank
                val freqBonus = 1.0f / (1.0f + 0.15f * ln((rank + 1).toFloat()))
                
                // CHANGED: Reset user history boost to neutral (1.0f). 
                // This stops user-added words (like "texting") from overriding better geometric matches (like "testing").
                var userBoost = 1.0f
                
                // DOUBLE LETTER BOOST (Conservative - only 3+ letter words)
                val hasEndDouble = word.length >= 3 && 
                    word.last().lowercaseChar() == word[word.length - 2].lowercaseChar()
                
                if (hasEndDouble && isDwellingAtEnd) {
                    userBoost *= (1.10f + dwellScore * 0.15f)
                }
                
                // EXACT KEY MATCH BONUS
                if (startKey != null && word.startsWith(startKey, ignoreCase = true)) userBoost *= 1.15f
                if (endKey != null && word.endsWith(endKey, ignoreCase = true)) userBoost *= 1.15f
                
                // LONG WORD BONUS
                if (word.length >= 6) userBoost *= 1.15f



                val finalScore = (integrationScore * (1.0f - 0.5f * freqBonus)) / userBoost
                Pair(word, finalScore)
            }
        
        // FIX: Apply getDisplayForm to ensure capitalized words (e.g. Katsuya) are returned correctly
        val results = scored.sortedBy { it.second }.distinctBy { it.first }.take(3).map { it.first }
        return results.map { getDisplayForm(it) }
    }

    // =================================================================================
    // END BLOCK: Boost Calculation (and decodeSwipe)
    // =================================================================================

    // =================================================================================
    // FUNCTION: decodeSwipeTimed (Time-Weighted Swipe Decoding)
    // SUMMARY: Enhanced version of decodeSwipe that uses timestamp data to detect
    //          when users linger on specific keys. This allows disambiguation of
    //          similar words like "for" vs "four" - lingering on "u" boosts "four".
    //          
    // HOW IT WORKS:
    //   1. Converts TimedPoints to regular path for geometric analysis
    //   2. Calculates dwell time on each key the path crosses
    //   3. Keys with longer dwell times get boosted in scoring
    //   4. Final score combines geometric + frequency + dwell time weights
    // =================================================================================
    fun decodeSwipeTimed(timedPath: List<TimedPoint>, keyMap: Map<String, PointF>): List<String> {
        if (timedPath.size < 3 || keyMap.isEmpty()) return emptyList()
        
        // Convert to regular PointF path for existing geometric analysis
        val swipePath = timedPath.map { it.toPointF() }
        
        // Calculate dwell times per key
        val keyDwellTimes = calculateKeyDwellTimes(timedPath, keyMap)
        
        // Debug log dwell times
        if (keyDwellTimes.isNotEmpty()) {
            val dwellDebug = keyDwellTimes.entries
                .filter { it.value > DWELL_THRESHOLD_MS }
                .sortedByDescending { it.value }
                .take(5)
                .joinToString(", ") { "${it.key}:${it.value}ms" }
            if (dwellDebug.isNotEmpty()) {
                android.util.Log.d("DroidOS_Dwell", "Key dwell times: $dwellDebug")
            }
        }
        
        // Run normal decoding with dwell boost
        return decodeSwipeWithDwell(swipePath, keyMap, keyDwellTimes)
    }
    // =================================================================================
    // END BLOCK: decodeSwipeTimed
    // =================================================================================

    // =================================================================================
    // FUNCTION: calculateKeyDwellTimes
    // SUMMARY: Analyzes a timed swipe path to calculate how long the user spent
    //          near each key. Returns a map of key -> total milliseconds.
    //          Used to boost keys where user intentionally lingered.
    // =================================================================================
    private fun calculateKeyDwellTimes(
        timedPath: List<TimedPoint>, 
        keyMap: Map<String, PointF>
    ): Map<String, Long> {
        val dwellTimes = HashMap<String, Long>()
        if (timedPath.size < 2) return dwellTimes
        
        val KEY_PROXIMITY_RADIUS = 50f  // Pixels - consider "on key" if within this radius
        
        for (i in 1 until timedPath.size) {
            val prev = timedPath[i - 1]
            val curr = timedPath[i]
            val timeDelta = curr.timestamp - prev.timestamp
            
            // Skip if timestamp jump is too large (likely a pause/resume)
            if (timeDelta > 500) continue
            
            // Find which key this point is closest to
            val point = PointF(curr.x, curr.y)
            var closestKey: String? = null
            var closestDist = Float.MAX_VALUE
            
            for ((key, center) in keyMap) {
                val dist = hypot(point.x - center.x, point.y - center.y)
                if (dist < closestDist && dist < KEY_PROXIMITY_RADIUS) {
                    closestDist = dist
                    closestKey = key
                }
            }
            
            // Add time spent near this key
            if (closestKey != null) {
                dwellTimes[closestKey] = (dwellTimes[closestKey] ?: 0L) + timeDelta
            }
        }
        
        return dwellTimes
    }
    // =================================================================================
    // END BLOCK: calculateKeyDwellTimes
    // =================================================================================

    // =================================================================================
    // FUNCTION: decodeSwipeWithDwell
    // SUMMARY: Modified version of decodeSwipe that incorporates dwell time scoring.
    //          Words containing keys with high dwell times get boosted.
    //          This is the core logic that makes "lingering on U" select "four" over "for".
    // =================================================================================
    private fun decodeSwipeWithDwell(
        swipePath: List<PointF>, 
        keyMap: Map<String, PointF>,
        keyDwellTimes: Map<String, Long>
    ): List<String> {
        if (swipePath.size < 3 || keyMap.isEmpty()) return emptyList()
        if (wordList.isEmpty()) {
            loadDefaults()
            return emptyList()
        }

        val keyMapHash = keyMap.hashCode()
        if (keyMapHash != lastKeyMapHash) {
            templateCache.clear()
            lastKeyMapHash = keyMapHash
        }

        val inputLength = getPathLength(swipePath)
        if (inputLength < 10f) return emptyList()

        // =======================================================================
        // DWELL DETECTION (Conservative - for to/too, as/ass)
        // =======================================================================
        var dwellScore = 0f
        if (swipePath.size > 12) {
            val tailSize = maxOf(12, swipePath.size / 4)
            val tailStart = maxOf(0, swipePath.size - tailSize)
            val tail = swipePath.subList(tailStart, swipePath.size)
            
            var tailLength = 0f
            for (i in 1 until tail.size) {
                tailLength += hypot(tail[i].x - tail[i-1].x, tail[i].y - tail[i-1].y)
            }
            
            val avgMovementPerPoint = tailLength / tail.size
            dwellScore = when {
                avgMovementPerPoint < 2f -> 1.0f
                avgMovementPerPoint < 4f -> 0.6f
                avgMovementPerPoint < 7f -> 0.2f
                else -> 0f
            }
        }
        val isDwellingAtEnd = dwellScore >= 0.6f
        // =======================================================================
        // END DWELL DETECTION
        // =======================================================================

        val sampledInput = samplePath(swipePath, SAMPLE_POINTS)
        val normalizedInput = normalizePath(sampledInput)
        val inputDirections = calculateDirectionVectors(sampledInput)

        val inputTurns = detectTurns(inputDirections)
        val pathKeys = extractPathKeys(sampledInput, keyMap, 8)

        val startPoint = sampledInput.first()
        val endPoint = sampledInput.last()
        val startKey = findClosestKey(startPoint, keyMap)
        val endKey = findClosestKey(endPoint, keyMap)
        
        // =======================================================================
        // CANDIDATE COLLECTION (same as original)
        // =======================================================================
        val candidates = HashSet<String>()
        
        val nearbyStart = findNearbyKeys(startPoint, keyMap, 80f)
        val nearbyEnd = findNearbyKeys(endPoint, keyMap, 80f)
        
        for (s in nearbyStart) {
            for (e in nearbyEnd) {
                wordsByFirstLastLetter["${s}${e}"]?.let { candidates.addAll(it) }
            }
        }
        
        if (startKey != null) {
            wordsByFirstLetter[startKey.first()]?.let { words ->
                candidates.addAll(words.sortedByDescending { userFrequencyMap[it] ?: 0 }.take(25))
            }
        }

        if (pathKeys.size >= 2) {
            val secondKey = pathKeys.getOrNull(1)?.firstOrNull()?.lowercaseChar()
            if (secondKey != null && startKey != null) {
                wordsByFirstLetter[startKey.first()]?.let { words ->
                    val matchingWords = words.filter { word ->
                        word.length >= 2 && word.drop(1).contains(secondKey)
                    }.sortedByDescending { userFrequencyMap[it] ?: 0 }.take(150)
                    candidates.addAll(matchingWords)
                }
            }
            
            val thirdKey = pathKeys.getOrNull(2)?.firstOrNull()?.lowercaseChar()
            if (thirdKey != null && startKey != null && thirdKey != secondKey) {
                wordsByFirstLetter[startKey.first()]?.let { words ->
                    val matchingWords = words.filter { word ->
                        word.length >= 3 && word.drop(1).contains(thirdKey)
                    }.sortedByDescending { userFrequencyMap[it] ?: 0 }.take(150)
                    candidates.addAll(matchingWords)
                }
            }
            
            if (pathKeys.size >= 3 && startKey != null) {
                wordsByFirstLetter[startKey.first()]?.let { words ->
                    val requiredKeys = pathKeys.drop(1).map { it.firstOrNull()?.lowercaseChar() }.filterNotNull()
                    val strictMatches = words.filter { word ->
                        var lastIdx = 0
                        var matches = true
                        for (rk in requiredKeys) {
                            val idx = word.indexOf(rk, lastIdx)
                            if (idx == -1) { 
                                matches = false; break 
                            }
                            lastIdx = idx + 1
                        }
                        matches
                    }.take(50)
                    
                    if (strictMatches.isNotEmpty()) {
                        candidates.addAll(strictMatches)
                    }
                }
            }
        }

        synchronized(userFrequencyMap) {
            candidates.addAll(userFrequencyMap.entries
                .sortedByDescending { it.value }
                .take(30)
                .map { it.key })
        }
        // =======================================================================
        // END CANDIDATE COLLECTION
        // =======================================================================

        // =======================================================================
        // SCORING WITH DWELL TIME BOOST
        // =======================================================================
        val scored = candidates
            .filter { !isWordBlocked(it) && it.length >= MIN_WORD_LENGTH }
            .sortedWith(compareByDescending<String> { userFrequencyMap[it] ?: 0 }.thenBy { getWordRank(it) })
            .take(400)
            .mapNotNull { word ->
                val template = getOrCreateTemplate(word, keyMap) ?: return@mapNotNull null
                
                val tLen = getPathLength(template.rawPoints)
                val ratio = tLen / inputLength
                
                val maxRatio = if (inputLength < 150f) 1.5f else 5.0f
                if (ratio > maxRatio || ratio < 0.4f) return@mapNotNull null

                if (template.sampledPoints == null) {
                    template.sampledPoints = samplePath(template.rawPoints, SAMPLE_POINTS)
                    template.normalizedPoints = normalizePath(template.sampledPoints!!)
                    template.directionVectors = calculateDirectionVectors(template.sampledPoints!!)
                }
                
                val shapeScore = calculateShapeScore(normalizedInput, template.normalizedPoints!!)
                val locScore = calculateLocationScore(sampledInput, template.sampledPoints!!)
                val dirScore = calculateDirectionScore(inputDirections, template.directionVectors!!)

                val templateTurns = detectTurns(template.directionVectors!!)
                val turnScore = calculateTurnScore(inputTurns, templateTurns)
                val pathKeyScore = calculatePathKeyScore(pathKeys, word)

                // =======================================================================
                // NEW: DWELL TIME SCORING
                // Calculate how much the user's dwell times match this word's letters.
                // If user lingered on "U", words containing "U" get boosted.
                // =======================================================================
                val dwellBoost = calculateDwellBoost(word, keyDwellTimes)
                // =======================================================================
                // END DWELL TIME SCORING
                // =======================================================================

                val integrationScore = (shapeScore * SHAPE_WEIGHT) +
                                       (locScore * LOCATION_WEIGHT) +
                                       (dirScore * DIRECTION_WEIGHT) +
                                       (turnScore * TURN_WEIGHT) +
                                       (pathKeyScore * 0.8f)
                
                val rank = template.rank
                val freqBonus = 1.0f / (1.0f + 0.15f * ln((rank + 1).toFloat()))
                
                var userBoost = 1.0f
                
                val hasEndDouble = word.length >= 3 && 
                    word.last().lowercaseChar() == word[word.length - 2].lowercaseChar()
                
                if (hasEndDouble && isDwellingAtEnd) {
                    userBoost *= (1.10f + dwellScore * 0.15f)
                }
                
                if (startKey != null && word.startsWith(startKey, ignoreCase = true)) userBoost *= 1.15f
                if (endKey != null && word.endsWith(endKey, ignoreCase = true)) userBoost *= 1.15f
                if (word.length >= 6) userBoost *= 1.15f

                // =======================================================================
                // APOSTROPHE VARIANT BOOST
                // If user has a custom word with apostrophe (don't) and we're matching
                // the base form (dont), boost the apostrophe version significantly.
                // This makes swiping "dont" return "don't" if learned.
                // =======================================================================
                val wordWithApostrophe = findApostropheVariant(word)
                if (wordWithApostrophe != null) {
                    userBoost *= 1.5f  // Strong boost for apostrophe variants
                    android.util.Log.d("DroidOS_Apostrophe", "Boosting '$word' -> '$wordWithApostrophe'")
                }
                // =======================================================================
                // END BLOCK: APOSTROPHE VARIANT BOOST
                // =======================================================================


                // Apply dwell boost - words matching user's lingered keys score better
                userBoost *= dwellBoost

                val finalScore = (integrationScore * (1.0f - 0.5f * freqBonus)) / userBoost
                Pair(word, finalScore)
            }
        
        // =======================================================================
        // POST-PROCESS: Apply display forms and apostrophe variants
        // =======================================================================
        val results = scored.sortedBy { it.second }.distinctBy { it.first }.take(3).map { it.first }
        
        return results.map { word ->
            val apostropheVariant = findApostropheVariant(word)
            val base = apostropheVariant ?: word
            // FIX: Apply display form to ensure proper capitalization (Katsuya, iPhone, etc.)
            getDisplayForm(base)
        }
    }

    // =================================================================================
    // END BLOCK: decodeSwipeWithDwell
    // =================================================================================

    // =================================================================================
    // FUNCTION: calculateDwellBoost
    // SUMMARY: Calculates a boost factor for a word based on how well it matches
    //          the user's key dwell times. Words containing keys the user lingered
    //          on get a higher boost (lower score = better in this system, so we
    //          return values > 1.0 to boost, < 1.0 to penalize).
    //          
    // EXAMPLE: User types "for" path but lingers on "U" for 150ms
    //          - "for" has no U -> dwellBoost = 1.0 (neutral)
    //          - "four" has U -> dwellBoost = 1.2 (boosted, wins!)
    // =================================================================================
    private fun calculateDwellBoost(word: String, keyDwellTimes: Map<String, Long>): Float {
        if (keyDwellTimes.isEmpty()) return 1.0f
        
        var boost = 1.0f
        val wordLower = word.lowercase()
        
        // Find keys with significant dwell time
        val significantDwells = keyDwellTimes.filter { it.value > DWELL_THRESHOLD_MS }
        
        for ((key, dwellMs) in significantDwells) {
            val keyChar = key.lowercase().firstOrNull() ?: continue
            
            // Calculate boost based on dwell time
            // 100ms = small boost (1.05), 200ms = medium (1.15), 300ms+ = strong (1.25)
            val dwellFactor = when {
                dwellMs > 300 -> 1.25f
                dwellMs > 200 -> 1.15f
                dwellMs > 150 -> 1.10f
                dwellMs > 100 -> 1.05f
                else -> 1.02f
            }
            
            if (wordLower.contains(keyChar)) {
                // Word contains this lingered-on key - BOOST it
                boost *= dwellFactor
                android.util.Log.d("DroidOS_Dwell", "BOOST '$word': contains '$keyChar' (${dwellMs}ms) -> boost $dwellFactor")
            } else {
                // Word does NOT contain this lingered-on key - slight penalty
                // This helps "four" beat "for" when user lingered on "u"
                val penalty = 1.0f / (dwellFactor * 0.5f + 0.5f)  // Gentler penalty
                boost *= penalty
                android.util.Log.d("DroidOS_Dwell", "PENALTY '$word': missing '$keyChar' (${dwellMs}ms) -> penalty $penalty")
            }
        }
        
        return boost.coerceIn(0.5f, 2.0f)  // Clamp to reasonable range
    }
    // =================================================================================
    // END BLOCK: calculateDwellBoost
    // =================================================================================

    // =================================================================================
    // FUNCTION: findApostropheVariant
    // SUMMARY: Checks if a user-learned word with apostrophe exists for this base word.
    //          E.g., "dont" -> "don't", "wont" -> "won't", "im" -> "i'm"
    //          Returns the apostrophe variant if found in customWords, null otherwise.
    // =================================================================================
    private fun findApostropheVariant(baseWord: String): String? {
        val lower = baseWord.lowercase(java.util.Locale.ROOT)
        
        // Common contraction patterns
        val patterns = listOf(
            // n't contractions
            Pair("nt$", "n't"),      // dont -> don't, wont -> won't, cant -> can't
            // 'm contractions  
            Pair("^im$", "i'm"),     // im -> i'm
            // 'll contractions
            Pair("ll$", "'ll"),      // well could match, so be careful
            // 're contractions
            Pair("re$", "'re"),      // youre -> you're, were -> we're
            // 've contractions
            Pair("ve$", "'ve"),      // wouldve -> would've
            // 's contractions
            Pair("s$", "'s"),        // its -> it's, thats -> that's
        )
        
        // Check common contractions first
        for ((pattern, replacement) in patterns) {
            val regex = Regex(pattern)
            if (regex.containsMatchIn(lower)) {
                val variant = lower.replace(regex, replacement)
                if (customWords.contains(variant)) {
                    return variant
                }
            }
        }
        
        // Also check if any custom word without apostrophe matches this word
        for (customWord in customWords) {
            if (customWord.contains("'")) {
                val withoutApostrophe = customWord.replace("'", "")
                if (withoutApostrophe == lower) {
                    return customWord
                }
            }
        }
        
        return null
    }
    // =================================================================================
    // END BLOCK: calculateDwellBoost
    // =================================================================================

    // =================================================================================
    // FUNCTION: decodeSwipePreview (FAST - for live updates)
    // SUMMARY: Lightweight version of decodeSwipe for real-time preview during swiping.
    //          Uses fewer candidates and simpler scoring for speed.
    //          Returns top 3 predictions based on current path (may be incomplete).
    // =================================================================================
    fun decodeSwipePreview(swipePath: List<PointF>, keyMap: Map<String, PointF>): List<String> {
        if (swipePath.size < 5 || keyMap.isEmpty()) return emptyList()
        if (wordList.isEmpty()) return emptyList()

        val keyMapHash = keyMap.hashCode()
        if (keyMapHash != lastKeyMapHash) {
            templateCache.clear()
            lastKeyMapHash = keyMapHash
        }

        val inputLength = getPathLength(swipePath)
        if (inputLength < 20f) return emptyList()

        val sampledInput = samplePath(swipePath, SAMPLE_POINTS)
        val inputDirections = calculateDirectionVectors(sampledInput)

        val startPoint = sampledInput.first()
        val endPoint = sampledInput.last()

        val startKey = findClosestKey(startPoint, keyMap)
        val endKey = findClosestKey(endPoint, keyMap)

        // Extract path keys for intermediate matching (fewer samples for speed)
        val pathKeys = extractPathKeys(sampledInput, keyMap, 6)

        // DEBUG: Log path keys for live preview
        if (pathKeys.isNotEmpty()) {
            android.util.Log.d("DroidOS_Preview", "PREVIEW Keys: ${pathKeys.joinToString("→")}")
        }

        // FAST CANDIDATE COLLECTION - fewer candidates for speed
        val candidates = HashSet<String>()

        // 1. Neighbor Search (smaller radius for speed)
        val nearbyStart = findNearbyKeys(startPoint, keyMap, 60f)
        val nearbyEnd = findNearbyKeys(endPoint, keyMap, 60f)

        for (s in nearbyStart) {
            for (e in nearbyEnd) {
                wordsByFirstLastLetter["${s}${e}"]?.let { candidates.addAll(it) }
            }
        }

        // 2. PREFIX INJECTION (fewer candidates)
        if (startKey != null) {
            wordsByFirstLetter[startKey.first()]?.let { words ->
                candidates.addAll(words.sortedByDescending { userFrequencyMap[it] ?: 0 }.take(15))
            }
        }
        if (pathKeys.size >= 2) {
            val secondKey = pathKeys.getOrNull(1)?.firstOrNull()?.lowercaseChar()
            if (secondKey != null && startKey != null) {
                wordsByFirstLetter[startKey.first()]?.let { words ->
                    val matchingWords = words.filter { word ->
                        word.length >= 2 && word.drop(1).contains(secondKey)
                    }.sortedByDescending { userFrequencyMap[it] ?: 0 }.take(20)
                    candidates.addAll(matchingWords)
                }
            }
        }
        // FAST SCORING - simplified for speed
        val scored = candidates
            .filter { !isWordBlocked(it) && it.length >= MIN_WORD_LENGTH }
            .sortedWith(compareByDescending<String> { userFrequencyMap[it] ?: 0 }.thenBy { getWordRank(it) })
            .take(50)  // Fewer candidates for speed
            .mapNotNull { word ->
                val template = getOrCreateTemplate(word, keyMap) ?: return@mapNotNull null

                // Quick length filter
                val tLen = getPathLength(template.rawPoints)
                val ratio = tLen / inputLength
                if (ratio > 3.0f || ratio < 0.3f) return@mapNotNull null

                if (template.sampledPoints == null) {
                    template.sampledPoints = samplePath(template.rawPoints, SAMPLE_POINTS)
                    template.normalizedPoints = normalizePath(template.sampledPoints!!)
                    template.directionVectors = calculateDirectionVectors(template.sampledPoints!!)
                }

                // SIMPLIFIED SCORING - location, direction, and path key matching for speed
                val locScore = calculateLocationScore(sampledInput, template.sampledPoints!!)
                val dirScore = calculateDirectionScore(inputDirections, template.directionVectors!!)

                // Add path key score for better intermediate key matching
                val pathKeyScore = calculatePathKeyScore(pathKeys, word)

                val integrationScore = locScore * 0.4f + dirScore * 0.2f + pathKeyScore * 0.6f  // Path keys most important for preview

                // Basic boosts
                val rank = template.rank
                val freqBonus = 1.0f / (1.0f + 0.1f * ln((rank + 1).toFloat()))

                var boost = 1.0f
                if (startKey != null && word.startsWith(startKey, ignoreCase = true)) boost *= 1.2f
                if (endKey != null && word.endsWith(endKey, ignoreCase = true)) boost *= 1.2f
                if ((userFrequencyMap[word] ?: 0) > 0) boost *= 1.3f

                val finalScore = (integrationScore * (1.0f - 0.3f * freqBonus)) / boost
                Pair(word, finalScore)
            }

// =======================================================================
        // POST-PROCESS: Apply display forms and apostrophe variants
        // 1. First check for apostrophe variant (cant -> can't)
        // 2. Then apply display form for proper capitalization (droidos -> DroidOS)
        // =======================================================================
        val results = scored.sortedBy { it.second }.distinctBy { it.first }.take(3).map { it.first }
        
        return results.map { word ->
            val withApostrophe = findApostropheVariant(word)
            val baseWord = withApostrophe ?: word
            // Apply display form for custom words (preserves DroidOS, iPhone, etc.)
            getDisplayForm(baseWord)
        }
        // =======================================================================
        // END BLOCK: Display form application
        // =======================================================================
    }
    // =================================================================================
    // END BLOCK: decodeSwipeWithDwellPreview
    // =================================================================================    // =================================================================================
    // FUNCTION: findClosestKey
    // SUMMARY: Finds the single closest key to a point. Fast O(n) where n = key count.
    // =================================================================================
    private fun findClosestKey(point: PointF, keyMap: Map<String, PointF>): String? {
        var closestKey: String? = null
        var closestDist = Float.MAX_VALUE
        
        for ((key, pos) in keyMap) {
            if (key.length != 1 || !Character.isLetter(key[0])) continue
            val dist = hypot(point.x - pos.x, point.y - pos.y)
            if (dist < closestDist) {
                closestDist = dist
                closestKey = key
            }
        }
        return closestKey
    }
    // =================================================================================
    // END BLOCK: findClosestKey
    // =================================================================================

    // =================================================================================
    // FUNCTION: findNearbyKeys
    // SUMMARY: Finds all letter keys within a radius of a point.
    // =================================================================================
    private fun findNearbyKeys(point: PointF, keyMap: Map<String, PointF>, radius: Float): List<String> {
        return keyMap.entries
            .filter { (key, pos) -> 
                key.length == 1 && Character.isLetter(key[0]) &&
                hypot(point.x - pos.x, point.y - pos.y) <= radius
            }
            .map { it.key }
    }
    // =================================================================================
    // END BLOCK: findNearbyKeys
    // =================================================================================



    // =================================================================================
    // FUNCTION: extractPathKeys (v4 - Sharp Turns Only, No Sampling)
    // SUMMARY: Extracts ONLY the key waypoints: Start, Sharp Turns, and End.
    //          Does NOT sample intermediate points (which creates noise).
    //          A sharp turn is where direction changes significantly (dot < 0.4).
    //          This prevents picking up 's' when swiping diagonally from 'a' to 'k'.
    //
    //          Example: "awake" swipe path has sharp turns at w, a, k
    //          Result: a→w→a→k→e (not a→w→a→s→k→e)
    // =================================================================================
    private fun extractPathKeys(path: List<PointF>, keyMap: Map<String, PointF>, maxKeys: Int): List<String> {
        if (path.size < 3) return emptyList()

        val keys = ArrayList<String>()

        // 1. Always add Start Key
        val startKey = findClosestKey(path.first(), keyMap)
        if (startKey != null) {
            keys.add(startKey.lowercase())
        }

        // 2. Find ONLY sharp turns (significant direction changes)
        // Use a larger window (5 points) to avoid noise from jitter
        val windowSize = 5
        var lastTurnIdx = 0

        for (i in windowSize until path.size - windowSize) {
            // Vector from 5 points ago to current point
            val p1 = path[i - windowSize]
            val p2 = path[i]
            val p3 = path[i + windowSize]

            val v1x = p2.x - p1.x
            val v1y = p2.y - p1.y
            val v2x = p3.x - p2.x
            val v2y = p3.y - p2.y

            val len1 = kotlin.math.hypot(v1x, v1y)
            val len2 = kotlin.math.hypot(v2x, v2y)

            // Need significant movement to count as a direction
            if (len1 > 15f && len2 > 15f) {
                val dot = (v1x * v2x + v1y * v2y) / (len1 * len2)

                                    // SHARP turn only: dot < 0.6 means angle > ~53 degrees
                                    // Relaxed from 0.4 to catch 'k' in 'awake' and 'x' in 'expect'
                                    if (dot < 0.6f) {
                                        // Minimum distance from last turn to avoid duplicates
                                        if (i - lastTurnIdx > windowSize * 2) {                        val key = findClosestKey(p2, keyMap)?.lowercase()
                        if (key != null && (keys.isEmpty() || keys.last() != key)) {
                            keys.add(key)
                            lastTurnIdx = i
                        }
                    }
                }
            }
        }

        // 3. Always add End Key
        val endKey = findClosestKey(path.last(), keyMap)?.lowercase()
        if (endKey != null && (keys.isEmpty() || keys.last() != endKey)) {
            keys.add(endKey)
        }

        // DEBUG: Log extracted keys
        android.util.Log.d("DroidOS_PathKeys", "Extracted: ${keys.joinToString("→")} from ${path.size} pts (Sharp turns only)")

        return keys.take(maxKeys)
    }
    // =================================================================================
    // END BLOCK: extractPathKeys
    // =================================================================================

// =================================================================================
    // FUNCTION: calculatePathKeyScore (v5 - Early Keys Weighted Heavily)
    // SUMMARY: Penalizes words that don't match the path keys, with HEAVY emphasis on
    //          the first 2-3 keys. If path starts "a→w→...", words starting "aw..." 
    //          should be strongly preferred over words starting "as...".
    //          
    //          Key insight from debugging: When swiping "awake", the path often shows
    //          a→w at the start, but then picks up 's' on the way to 'k'. We need to
    //          prioritize the FIRST keys which are most reliable.
    // =================================================================================
    private fun calculatePathKeyScore(pathKeys: List<String>, word: String): Float {
        if (pathKeys.isEmpty()) return 0f
        
        val wordChars = word.lowercase()
        var penalty = 0f
        
        // CRITICAL: Check if the FIRST path keys match the FIRST word letters
        // This is the most reliable signal - the start of the swipe is intentional
        val firstPathKey = pathKeys.firstOrNull()?.firstOrNull()
        val firstWordChar = wordChars.firstOrNull()
        
        if (firstPathKey != null && firstWordChar != null && firstPathKey != firstWordChar) {
            // First key mismatch - BIG penalty
            penalty += 5.0f
        }
        
        // Check SECOND path key against second word letter (if exists)
        if (pathKeys.size >= 2 && wordChars.length >= 2) {
            val secondPathKey = pathKeys[1].firstOrNull()
            val secondWordChar = wordChars[1]
            
            if (secondPathKey != null && secondPathKey != secondWordChar) {
                // Second key mismatch - also big penalty
                // This catches "aw..." vs "as..." - if path shows 'w', penalize 's' words
                penalty += 4.0f
            }
        }
        
        // Check THIRD path key (if exists) - still important but less critical
        if (pathKeys.size >= 3 && wordChars.length >= 3) {
            val thirdPathKey = pathKeys[2].firstOrNull()
            val thirdWordChar = wordChars[2]
            
            if (thirdPathKey != null && thirdWordChar != null && thirdPathKey != thirdWordChar) {
                penalty += 2.0f
            }
        }
        
        // Now do subsequence matching for the rest of the path
        var pathIdx = 0
        var wordIdx = 0
        var matchedKeys = 0
        
        while (pathIdx < pathKeys.size && wordIdx < wordChars.length) {
            val pKey = pathKeys[pathIdx].firstOrNull() ?: continue
            val wChar = wordChars[wordIdx]
            
            if (pKey == wChar) {
                matchedKeys++
                pathIdx++
                wordIdx++
            } else {
                wordIdx++
            }
        }
        
        // Penalty for unmatched path keys (keys we swiped but aren't in the word)
        val unmatchedKeys = pathKeys.size - matchedKeys
        penalty += unmatchedKeys * 2.0f  // Reduced from 3.0f since we have early key penalties
        
        // Length penalty for very long words vs short paths
        if (wordChars.length > pathKeys.size * 2.5) {
            penalty += 0.5f
        }

        // DEBUG: Log scoring
        android.util.Log.d("DroidOS_PathKeys", "  '$word': path=${pathKeys.joinToString("-")} matched=$matchedKeys/${pathKeys.size} unmatched=$unmatchedKeys penalty=${"%.2f".format(penalty)}")
        
        return penalty
    }
    // =================================================================================
    // END BLOCK: calculatePathKeyScore
    // =================================================================================

    // =================================================================================
    // FUNCTION: areKeysAdjacent
    // SUMMARY: Checks if two keys are adjacent on a QWERTY keyboard.
    //          Used for typo tolerance - adjacent mismatches are less severe.
    // =================================================================================
    private fun areKeysAdjacent(key1: Char, key2: Char): Boolean {
        val adjacencyMap = mapOf(
            'q' to setOf('w', 'a'),
            'w' to setOf('q', 'e', 'a', 's'),
            'e' to setOf('w', 'r', 's', 'd'),
            'r' to setOf('e', 't', 'd', 'f'),
            't' to setOf('r', 'y', 'f', 'g'),
            'y' to setOf('t', 'u', 'g', 'h'),
            'u' to setOf('y', 'i', 'h', 'j'),
            'i' to setOf('u', 'o', 'j', 'k'),
            'o' to setOf('i', 'p', 'k', 'l'),
            'p' to setOf('o', 'l'),
            'a' to setOf('q', 'w', 's', 'z'),
            's' to setOf('a', 'w', 'e', 'd', 'z', 'x'),
            'd' to setOf('s', 'e', 'r', 'f', 'x', 'c'),
            'f' to setOf('d', 'r', 't', 'g', 'c', 'v'),
            'g' to setOf('f', 't', 'y', 'h', 'v', 'b'),
            'h' to setOf('g', 'y', 'u', 'j', 'b', 'n'),
            'j' to setOf('h', 'u', 'i', 'k', 'n', 'm'),
            'k' to setOf('j', 'i', 'o', 'l', 'm'),
            'l' to setOf('k', 'o', 'p'),
            'z' to setOf('a', 's', 'x'),
            'x' to setOf('z', 's', 'd', 'c'),
            'c' to setOf('x', 'd', 'f', 'v'),
            'v' to setOf('c', 'f', 'g', 'b'),
            'b' to setOf('v', 'g', 'h', 'n'),
            'n' to setOf('b', 'h', 'j', 'm'),
            'm' to setOf('n', 'j', 'k')
        )
        
        val adjacent1 = adjacencyMap[key1.lowercaseChar()] ?: emptySet()
        return key2.lowercaseChar() in adjacent1
    }
    // =================================================================================
    // END BLOCK: areKeysAdjacent
    // =================================================================================
    // =================================================================================
    // END BLOCK: calculatePathKeyScore
    // =================================================================================

    // =================================================================================
    // FUNCTION: getOrCreateTemplate
    // SUMMARY: Gets or creates a word template with key positions. Returns null if any
    //          character in the word is missing from the keyMap. Logs first failure per
    //          batch to avoid log spam while still providing diagnostic info.
    // =================================================================================

    // =================================================================================
    // FUNCTION: getOrCreateTemplate (With Micro-Loops for Double Letters)
    // =================================================================================
    private fun getOrCreateTemplate(word: String, keyMap: Map<String, PointF>): WordTemplate? {
        templateCache[word]?.let { return it }

        val rawPoints = ArrayList<PointF>()
        var lastKeyPos: PointF? = null
        
        for (char in word) {
            val keyPos = keyMap[char.toString().uppercase()] ?: keyMap[char.toString().lowercase()] ?: return null
            

            // DOUBLE LETTER LOGIC:
            if (lastKeyPos != null && keyPos.x == lastKeyPos.x && keyPos.y == lastKeyPos.y) {
                // INCREASED: 10f -> 15f. 
                // Makes the "circle" gesture easier to register.
                rawPoints.add(PointF(keyPos.x + 15f, keyPos.y + 15f))
            }
            
            rawPoints.add(PointF(keyPos.x, keyPos.y))
            lastKeyPos = keyPos
        }

        if (rawPoints.size < 2) return null

        val t = WordTemplate(word, getWordRank(word), rawPoints)
        templateCache[word] = t
        return t
    }

    // =================================================================================
    // END BLOCK: getOrCreateTemplate
    // =================================================================================

/**
     * Calculates the total absolute length of a path in pixels.
     */
    private fun getPathLength(points: List<PointF>): Float {
        if (points.size < 2) return 0f
        var length = 0f
        for (i in 0 until points.size - 1) {
            length += hypot(points[i+1].x - points[i].x, points[i+1].y - points[i].y)
        }
        return length
    }
    /**
     * Uniformly sample N points along a path.
     * This makes paths of different lengths comparable.
     */
    private fun samplePath(path: List<PointF>, numSamples: Int): List<PointF> {
        if (path.size < 2) return path
        if (path.size == numSamples) return path
        
        // Calculate total path length
        var totalLength = 0f
        for (i in 1 until path.size) {
            totalLength += hypot(path[i].x - path[i-1].x, path[i].y - path[i-1].y)
        }
        
        if (totalLength < 0.001f) {
            // Path is essentially a point - return copies of first point
            return List(numSamples) { PointF(path[0].x, path[0].y) }
        }
        
        val segmentLength = totalLength / (numSamples - 1)
        val sampled = ArrayList<PointF>(numSamples)
        sampled.add(PointF(path[0].x, path[0].y))
        
        var currentDist = 0f
        var pathIndex = 0
        var targetDist = segmentLength
        
        while (sampled.size < numSamples - 1 && pathIndex < path.size - 1) {
            val p1 = path[pathIndex]
            val p2 = path[pathIndex + 1]
            val segLen = hypot(p2.x - p1.x, p2.y - p1.y)
            
            while (currentDist + segLen >= targetDist && sampled.size < numSamples - 1) {
                val ratio = (targetDist - currentDist) / segLen
                val x = p1.x + ratio * (p2.x - p1.x)
                val y = p1.y + ratio * (p2.y - p1.y)
                sampled.add(PointF(x, y))
                targetDist += segmentLength
            }
            
            currentDist += segLen
            pathIndex++
        }
        
        // Ensure we have exactly numSamples by adding the last point
        while (sampled.size < numSamples) {
            sampled.add(PointF(path.last().x, path.last().y))
        }
        
        return sampled
    }
    
    /**
     * Normalize a path to fit within a square of size NORMALIZATION_SIZE.
     * This removes scale and translation differences for shape comparison.
     */
    private fun normalizePath(path: List<PointF>): List<PointF> {
        if (path.isEmpty()) return path
        
        // Find bounding box
        var minX = Float.MAX_VALUE
        var maxX = Float.MIN_VALUE
        var minY = Float.MAX_VALUE
        var maxY = Float.MIN_VALUE
        
        for (pt in path) {
            minX = min(minX, pt.x)
            maxX = max(maxX, pt.x)
            minY = min(minY, pt.y)
            maxY = max(maxY, pt.y)
        }
        
        val width = maxX - minX
        val height = maxY - minY
        val maxDim = max(width, height)
        
        if (maxDim < 0.001f) {
            // All points are the same - return centered points
            return path.map { PointF(NORMALIZATION_SIZE / 2, NORMALIZATION_SIZE / 2) }
        }
        
        // Scale to NORMALIZATION_SIZE and center at origin
        val scale = NORMALIZATION_SIZE / maxDim
        val centerX = (minX + maxX) / 2
        val centerY = (minY + maxY) / 2
        
        return path.map { pt ->
            PointF(
                (pt.x - centerX) * scale + NORMALIZATION_SIZE / 2,
                (pt.y - centerY) * scale + NORMALIZATION_SIZE / 2
            )
        }
    }
    
    /**
     * Calculate shape score between two normalized paths.
     * Uses average point-to-point distance.
     * Lower score = better match.
     */
    private fun calculateShapeScore(input: List<PointF>, template: List<PointF>): Float {
        if (input.size != template.size) return Float.MAX_VALUE
        
        var totalDist = 0f
        for (i in input.indices) {
            val dx = input[i].x - template[i].x
            val dy = input[i].y - template[i].y
            totalDist += sqrt(dx * dx + dy * dy)
        }
        
        return totalDist / input.size
    }
    
    /**
     * Calculate location score between two paths (absolute positions).
     * Uses average point-to-point distance with position weighting.
     * Points at the beginning and end are weighted more heavily.
     * Lower score = better match.
     */

    private fun calculateLocationScore(input: List<PointF>, template: List<PointF>): Float {
        var totalDist = 0f
        var totalWeight = 0f
        val size = input.size
        
        for (i in input.indices) {
            val dist = hypot(input[i].x - template[i].x, input[i].y - template[i].y)
            
            // --- ENDPOINT WEIGHTING (Strict) ---
            // Start: 3.0x
            // End:   5.0x (Crucial for "Swipe" vs "Swiped")
            // Middle: 1.0x
            val w = when {
                i < size * 0.15 -> 3.0f
                i > size * 0.85 -> 5.0f // Heavy penalty for missing the last key
                else -> 1.0f
            }
            
            totalDist += dist * w
            totalWeight += w
        }
        return totalDist / totalWeight
    }



    // =================================================================================
    // NEW: DIRECTION SCORING HELPERS
    // =================================================================================
    

    private fun calculateDirectionVectors(path: List<PointF>): List<PointF> {
        val vectors = ArrayList<PointF>()
        for (i in 0 until path.size - 1) {
            val dx = path[i+1].x - path[i].x
            val dy = path[i+1].y - path[i].y
            val len = hypot(dx, dy)
            if (len > 0.001f) {
                vectors.add(PointF(dx/len, dy/len))
            } else {
                // Return 0,0 for stationary segments (handled by Score function now)
                vectors.add(PointF(0f, 0f))
            }
        }
        return vectors
    }

    // =================================================================================
    // FUNCTION: calculateDirectionScore (Fixed for Double Letters & Pauses)
    // =================================================================================

    // =================================================================================
    // FUNCTION: calculateDirectionScore (Linear + Stationary Skip)
    // =================================================================================
    private fun calculateDirectionScore(input: List<PointF>, template: List<PointF>): Float {
        var totalScore = 0f
        var validPoints = 0
        
        val count = min(input.size, template.size)
        if (count == 0) return 0f

        for (i in 0 until count) {
            val v1 = input[i]
            val v2 = template[i]
            
            // Skip stationary segments (Pause/Tap)
            if ((v2.x == 0f && v2.y == 0f) || (v1.x == 0f && v1.y == 0f)) {
                continue
            }

            // Dot Product: 1.0 = aligned, -1.0 = opposite
            val dot = v1.x * v2.x + v1.y * v2.y
            
            // Penalty: Linear (Robust for complex words like "Either")
            // Reverted from Squared to forgive messy scribbles.
            totalScore += (1.0f - dot)
            validPoints++
        }
        
        return if (validPoints > 0) totalScore / validPoints else 0f
    }

// =================================================================================
    // FUNCTION: detectTurns
    // SUMMARY: Detects significant direction changes (turns/corners) in a path.
    //          Returns a list of (position, angle) pairs where position is 0.0-1.0
    //          along the path and angle is the turn magnitude in radians.
    //          A turn is detected when consecutive direction vectors differ significantly.
    // =================================================================================
// =================================================================================
    // FUNCTION: detectTurns (v2 - Sharp Corner Detection)
    // SUMMARY: Detects significant direction changes with emphasis on SHARP corners.
    //          Sharp corners = abrupt changes over 1-2 points (more intentional)
    //          Rounded corners = gradual changes over many points (less distinctive)
    //          Returns list of (position, sharpness) where sharpness indicates
    //          how abrupt the turn was (higher = sharper).
    // =================================================================================

    // =================================================================================
    // FUNCTION: detectTurns (v3 - Ultra-Sharp Emphasis)
    // =================================================================================
    private fun detectTurns(directions: List<PointF>): List<Pair<Float, Float>> {
        if (directions.size < 3) return emptyList()
        
        val turns = ArrayList<Pair<Float, Float>>()
        
        for (i in 0 until directions.size - 1) {
            val curr = directions[i]
            val next = directions[i + 1]
            
            if ((curr.x == 0f && curr.y == 0f) || (next.x == 0f && next.y == 0f)) continue
            
            // Dot product: 1.0 = straight, 0 = 90deg, -1 = U-turn
            val dot = curr.x * next.x + curr.y * next.y
            
            // ULTRA SHARP CORNER (e.g. "W", "Z", "M")
            // dot < 0.2 means angle > 78 degrees
            if (dot < 0.2f) {
                val position = i.toFloat() / directions.size.toFloat()
                // AMPLIFIED: Scale sharpness by 3.0x (was 1.5x)
                // This makes a sharp corner worth 3 "normal" curves
                val sharpness = (1.0f - dot) * 3.0f  
                turns.add(Pair(position, sharpness))
            }
            // MEDIUM CORNER (Standard curve)
            // dot < 0.6 means angle > 53 degrees
            else if (dot < 0.6f) {
                val position = i.toFloat() / directions.size.toFloat()
                val sharpness = (1.0f - dot) * 0.8f // Reduce weight of soft curves
                turns.add(Pair(position, sharpness))
            }
        }
        
        // Secondary pass for "spread out" turns (U-turns that take 3 points)
        for (i in 0 until directions.size - 3) {
            val curr = directions[i]
            val later = directions[i + 3]
            
            if ((curr.x == 0f && curr.y == 0f) || (later.x == 0f && later.y == 0f)) continue
            
            val dot = curr.x * later.x + curr.y * later.y
            
            if (dot < 0.1f) {  
                val position = (i + 1.5f) / directions.size.toFloat()
                
                val nearbyTurn = turns.any { abs(it.first - position) < 0.08f }
                if (!nearbyTurn) {
                    val sharpness = (1.0f - dot) * 2.0f // Boost U-turns too
                    turns.add(Pair(position, sharpness))
                }
            }
        }
        
        return turns.sortedBy { it.first }
    }

    // =================================================================================
    // END BLOCK: detectTurns
    // =================================================================================
    // =================================================================================
    // END BLOCK: detectTurns
    // =================================================================================

    // =================================================================================
    // FUNCTION: calculateTurnScore
    // SUMMARY: Compares turn patterns between input and template.
    //          Rewards matching turn counts and positions, penalizes mismatches.
    //          Lower score = better match.
    // =================================================================================
// =================================================================================
    // FUNCTION: calculateTurnScore (v2 - Sharp Corner Emphasis)
    // SUMMARY: Compares turn patterns with HEAVY emphasis on matching sharp corners.
    //          - Matching sharp corners = big reward (low score)
    //          - Missing sharp corners = big penalty (high score)
    //          - Turn count matters less than turn positions and sharpness
    // =================================================================================

    // =================================================================================
    // FUNCTION: calculateTurnScore (v3 - Sharp Corner Enforcement)
    // =================================================================================
    private fun calculateTurnScore(inputTurns: List<Pair<Float, Float>>, templateTurns: List<Pair<Float, Float>>): Float {
        if (inputTurns.isEmpty() && templateTurns.isEmpty()) return 0f
        
        var score = 0f
        
        // Filter for "Significant" turns (Sharpness > 1.5, which corresponds to our new 3.0x scale)
        val templateSharpTurns = templateTurns.filter { it.second > 1.5f }
        val inputSharpTurns = inputTurns.filter { it.second > 1.5f }
        
        // HEAVY PENALTY for mismatching sharp corners
        if (templateSharpTurns.isNotEmpty() && inputSharpTurns.isEmpty()) {
            // Template has a sharp corner (like "Android" 'N') but user missed it -> Fatal
            score += 1.5f 
        } else if (templateSharpTurns.isEmpty() && inputSharpTurns.isNotEmpty()) {
            // User made a sharp jerk where none belongs -> Fatal
            score += 1.0f
        }
        
        val usedTemplate = BooleanArray(templateTurns.size)
        var matchedTurns = 0
        var totalSharpnessMatch = 0f
        
        for (inputTurn in inputTurns) {
            var bestMatch = -1
            var bestScore = Float.MAX_VALUE
            
            for (j in templateTurns.indices) {
                if (usedTemplate[j]) continue
                
                val posDist = abs(inputTurn.first - templateTurns[j].first)
                val sharpnessDiff = abs(inputTurn.second - templateTurns[j].second)
                
                // Position tolerance: 20%
                if (posDist < 0.20f) {
                    val matchScore = posDist * 2f + sharpnessDiff * 0.5f
                    if (matchScore < bestScore) {
                        bestScore = matchScore
                        bestMatch = j
                    }
                }
            }
            
            if (bestMatch >= 0) {
                usedTemplate[bestMatch] = true
                matchedTurns++
                totalSharpnessMatch += bestScore
                
                // HUGE REWARD: If both are sharp and matched
                if (inputTurn.second > 1.5f && templateTurns[bestMatch].second > 1.5f) {
                    score -= 0.5f  // Massive bonus for hitting the corner
                }
            } else {
                // Penalty for extra turns in input
                score += 0.2f + inputTurn.second * 0.2f
            }
        }
        
        // Penalty for missing turns in template
        for (j in templateTurns.indices) {
            if (!usedTemplate[j]) {
                score += 0.2f + templateTurns[j].second * 0.2f
            }
        }
        
        if (matchedTurns > 0) {
            score += totalSharpnessMatch / matchedTurns * 0.3f
        }
        
        return max(0f, score)
    }

    // =================================================================================
    // END BLOCK: calculateTurnScore
    // =================================================================================
    // =================================================================================
    // END BLOCK: calculateTurnScore
    // =================================================================================



    /**
     * Find all keys within threshold distance of a point.
     * Returns a Map of Key -> Distance for O(1) lookups.
     */
    private fun findKeysWithDist(pt: PointF, keyMap: Map<String, PointF>, threshold: Float): Map<String, Float> {
        val keys = HashMap<String, Float>()
        for ((key, pos) in keyMap) {
            if (key.length != 1) continue
            val dist = hypot(pt.x - pos.x, pt.y - pos.y)
            if (dist < threshold) {
                // If key exists (e.g. from another case), keep smallest dist
                val existing = keys[key.lowercase()]
                if (existing == null || dist < existing) {
                    keys[key.lowercase()] = dist
                }
            }
        }
        return keys
    }
    
    private fun getWordRank(word: String): Int {
        var current = root
        for (char in word) {
            current = current.children[char] ?: return Int.MAX_VALUE
        }
        return if (current.isEndOfWord) current.rank else Int.MAX_VALUE
    }
    
    // =================================================================================
    // END BLOCK: SHARK2-INSPIRED SWIPE DECODER LOGIC
    // =================================================================================


    /**
     * Blocks a word permanently:
     * 1. Adds to memory.
     * 2. Removes from active lists.
     * 3. Removes from user stats. 
     * 4. Saves to file.
     */

    fun blockWord(context: Context, word: String) {
        val cleanWord = word.trim().lowercase(java.util.Locale.ROOT)
        if (cleanWord.isEmpty()) return

        Thread {
            try {
                synchronized(this) {
                    blockedWords.add(cleanWord)
                    customWords.remove(cleanWord)
                    wordList.remove(cleanWord)
                    
                    if (cleanWord.isNotEmpty()) {
                        wordsByFirstLetter[cleanWord.first()]?.remove(cleanWord)
                        if (cleanWord.length >= 2) {
                            wordsByFirstLastLetter["${cleanWord.first()}${cleanWord.last()}"]?.remove(cleanWord)
                        }
                    }
                    
                    synchronized(userFrequencyMap) {
                        userFrequencyMap.remove(cleanWord)
                    }
                    templateCache.remove(cleanWord)
                    
                    // FIX: Save files inside synchronized block to prevent ConcurrentModification and race conditions
                    saveSetToFile(context, BLOCKED_DICT_FILE, blockedWords)
                    saveSetToFile(context, USER_DICT_FILE, customWords)
                }
                
                saveUserStats(context)

                android.util.Log.d("DroidOS_Prediction", "BLOCKED: '$cleanWord'")
            } catch (e: Exception) {
                android.util.Log.e("DroidOS_Prediction", "Block failed", e)
            }
        }.start()
    }


}
