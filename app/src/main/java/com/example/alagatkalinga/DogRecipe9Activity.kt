package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DogRecipe9Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_recipe9)

        val backButton: ImageView = findViewById(R.id.BackRed9)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}