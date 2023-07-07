package com.example.alagatkalinga
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RecipeCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_recipe)

        val backButton: ImageView = findViewById(R.id.BackMenu1)
        backButton.setOnClickListener {
            onBackPressed()
        }

        val dogsImage: ImageView = findViewById(R.id.dogsImage)
        dogsImage.setOnClickListener {
            val intent = Intent(this, RecipeListActivity::class.java)
            startActivity(intent)
        }
        val CatsImage: ImageView = findViewById(R.id.CatsImage)
        CatsImage.setOnClickListener {
            val intent = Intent(this, RecipeListActivity::class.java)
            startActivity(intent)
        }
    }
}
