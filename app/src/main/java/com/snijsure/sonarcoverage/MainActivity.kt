package com.snijsure.sonarcoverage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        findViewById<Button>(R.id.button).setOnClickListener {
            text.text = getString(R.string.mainactivity)
            findViewById<Button>(R.id.hide).visibility = View.VISIBLE
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent);
        }

        findViewById<Button>(R.id.hide).setOnClickListener {
            it.visibility = View.GONE
        }
    }
}