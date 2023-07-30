package com.example.alagatkalinga
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RecipeCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_recipe)


        val dogsImage: ImageView = findViewById(R.id.dogsImage)
        dogsImage.setOnClickListener {
            val intent = Intent(this, RecipeListActivity::class.java)
            startActivity(intent)
        }
        val CatsImage: ImageView = findViewById(R.id.CatsImage)
        CatsImage.setOnClickListener {
            val intent = Intent(this, CatRecipeActivity::class.java)
            startActivity(intent)
        }
    }
}
