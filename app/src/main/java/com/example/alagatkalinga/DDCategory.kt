package com.example.alagatkalinga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DDCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ddcategory)

        val doscategory: ImageView = findViewById(R.id.doscategory)
        doscategory.setOnClickListener {
            val intent = Intent(this, DosDontsActivity::class.java)
            startActivity(intent)
        }
        val dontscategory: ImageView = findViewById(R.id.dontscategory)
        dontscategory.setOnClickListener {
            val intent = Intent(this, DontsActivity::class.java)
            startActivity(intent)
        }
    }
}