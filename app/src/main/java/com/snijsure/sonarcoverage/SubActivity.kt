package com.snijsure.sonarcoverage

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subactivity_layout)

        val text = findViewById<TextView>(R.id.subactivity_text)
        findViewById<Button>(R.id.subactivity_button).setOnClickListener {
            text.text = getString(R.string.subactivity_text)
            findViewById<Button>(R.id.subactivity_hide).visibility = View.VISIBLE
        }

        findViewById<Button>(R.id.subactivity_hide).setOnClickListener {
            it.visibility = View.GONE
        }
    }
}