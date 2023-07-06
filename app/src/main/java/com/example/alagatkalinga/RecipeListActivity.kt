package com.example.alagatkalinga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import android.widget.TextView


class RecipeListActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var recipeTitleText: TextView
    private lateinit var pageIndicatorText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_recipelist)

        val backButton: ImageView = findViewById(R.id.BackRed0)
        backButton.setOnClickListener {
            onBackPressed()
        }

        viewPager = findViewById(R.id.pager)
        recipeTitleText = findViewById(R.id.recipeTitleText)
        pageIndicatorText = findViewById(R.id.pageIndicatorText)

        val adapter = ImagePagerAdapter(this)
        viewPager.adapter = adapter

        recipeTitleText.text = adapter.getPageTitle(0)
        updatePageIndicator(1, adapter.count)

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                // Not needed for this example
            }

            override fun onPageSelected(position: Int) {
                recipeTitleText.text = adapter.getPageTitle(position)
                updatePageIndicator(position + 1, adapter.count)
            }

            override fun onPageScrollStateChanged(state: Int) {
                // Not needed for this example
            }
        })
    }

    private fun updatePageIndicator(currentPage: Int, totalPages: Int) {
        val pageIndicator = "Page $currentPage of $totalPages"
        pageIndicatorText.text = pageIndicator
    }
}

