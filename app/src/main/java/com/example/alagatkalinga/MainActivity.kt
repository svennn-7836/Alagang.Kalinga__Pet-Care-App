package com.example.alagatkalinga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val continueButton = findViewById<Button>(R.id.continueButton)
        continueButton.setOnClickListener {
            // Handle button click event
            val intent = Intent(this@MainActivity, MenuActivity::class.java)
            startActivity(intent)
        }

    }
}