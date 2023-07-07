package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CatRecipe5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_recipe5)

        val backButton: ImageView = findViewById(R.id.CatBackRed5)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}