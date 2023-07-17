package com.example.alagatkalinga

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val recipeImage: ImageView = findViewById(R.id.recipeImage)
        recipeImage.setOnClickListener {
            val intent = Intent(this, RecipeCategoryActivity::class.java)
            startActivity(intent)
        }
        val dosImage: ImageView = findViewById(R.id.doDontImage)
        dosImage.setOnClickListener {
            val intent = Intent(this, DosDontsActivity::class.java)
            startActivity(intent)
        }
        val symptomsImage: ImageView = findViewById(R.id.symptomsImage)
        symptomsImage.setOnClickListener {
            val intent = Intent(this, SymptomsActivity::class.java)
            startActivity(intent)
        }
        val recordImage: ImageView = findViewById(R.id.recordImage)
        recordImage.setOnClickListener {
            val intent = Intent(this, RecordActivity::class.java)
            startActivity(intent)
        }
        val alarmImage: ImageView = findViewById(R.id.alarmImage)
        alarmImage.setOnClickListener {
            val intent = Intent(this, AlarmActivity::class.java)
            startActivity(intent)
        }

        // Add your activity setup code here
    }
}