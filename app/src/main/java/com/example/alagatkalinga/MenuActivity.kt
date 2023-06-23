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

        // Add your activity setup code here
    }
}