package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CatRecipe4Activitiy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_recipe4)

        val backButton: ImageView = findViewById(R.id.CatBackRed4)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}