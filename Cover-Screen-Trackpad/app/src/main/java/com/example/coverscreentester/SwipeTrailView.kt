package com.example.coverscreentester

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.View

class SwipeTrailView(context: Context) : View(context) {

    private val path = Path()
    private val paint = Paint().apply {
        color = Color.parseColor("#00A0E9") // DroidOS Blue
        style = Paint.Style.STROKE
        strokeWidth = 12f
        strokeJoin = Paint.Join.ROUND
        strokeCap = Paint.Cap.ROUND
        isAntiAlias = true
        alpha = 180
    }

    init {
        // Important: Pass touches through this view so the keyboard underneath gets them
        isClickable = false
        isFocusable = false
    }

    fun addPoint(x: Float, y: Float) {
        if (path.isEmpty) {
            path.moveTo(x, y)
        } else {
            path.lineTo(x, y)
        }
        invalidate()
    }

    fun clear() {
        path.reset()
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawPath(path, paint)
    }
}
