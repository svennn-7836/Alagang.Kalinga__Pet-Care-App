package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CatRecipe8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_recipe8)

        val backButton: ImageView = findViewById(R.id.CatBackRed8)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}