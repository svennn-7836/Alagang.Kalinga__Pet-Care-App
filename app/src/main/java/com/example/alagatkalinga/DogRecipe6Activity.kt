package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DogRecipe6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_recipe6)

        val backButton: ImageView = findViewById(R.id.BackRed6)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}