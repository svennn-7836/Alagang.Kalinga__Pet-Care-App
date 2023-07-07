package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CatRecipe10Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_recipe10)

        val backButton: ImageView = findViewById(R.id.CatBackRed10)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}