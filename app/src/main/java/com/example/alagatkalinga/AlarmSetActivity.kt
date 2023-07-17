package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AlarmSetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setalarm)

        val backButton: ImageView = findViewById(R.id.alarmexit)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}