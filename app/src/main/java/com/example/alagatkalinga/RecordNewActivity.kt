package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RecordNewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record_new)

        val backButton: ImageView = findViewById(R.id.newrecord2)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}