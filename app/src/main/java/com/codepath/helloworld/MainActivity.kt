package com.codepath.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("Hello world", "Button clicked!")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }

        // Switch
        val switch = findViewById<Switch>(R.id.modeSwitch)
        val introText = findViewById<TextView>(R.id.introTextView)
        switch.setOnCheckedChangeListener { _, b ->

            // Switch on
            if (b) {
                Log.v("Switch On", "Switch is on")

                // Turn night mode on
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                introText.setTextColor(resources.getColor(R.color.teal_700))
                button.setBackgroundColor(resources.getColor(R.color.teal_200))
                switch.setTextColor(resources.getColor(R.color.teal_700))
            }

            // Switch off
            else {
                Log.v("Switch off", "Switch is off")

                // Turn night mode off
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}