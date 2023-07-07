package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CatRecipe2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_recipe2)

        val backButton: ImageView = findViewById(R.id.CatBackRed2)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}