package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CatRecipe9Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_recipe9)

        val backButton: ImageView = findViewById(R.id.CatBackRed9)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}