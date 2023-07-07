package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CatRecipe7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_recipe7)

        val backButton: ImageView = findViewById(R.id.CatBackRed7)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}