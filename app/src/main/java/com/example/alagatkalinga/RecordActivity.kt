package com.example.alagatkalinga

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RecordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)

        val backButton: ImageView = findViewById(R.id.BackBrown)
        backButton.setOnClickListener {
            onBackPressed()
        }

        val addrecordbutton: ImageView = findViewById(R.id.addrecordbutton)
        addrecordbutton.setOnClickListener {
            val intent = Intent(this, RecordNewActivity::class.java)
            startActivity(intent)


        }
    }
}