package com.example.alagatkalinga

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AlarmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        val backButton: ImageView = findViewById(R.id.Backalarm)
        backButton.setOnClickListener {
            onBackPressed()
        }

        val addalarm: ImageView = findViewById(R.id.addalarm)
        addalarm.setOnClickListener {
            val intent = Intent(this, AlarmSetActivity::class.java)
            startActivity(intent)

        }
    }
}