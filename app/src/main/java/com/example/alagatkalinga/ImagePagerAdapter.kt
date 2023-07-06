package com.example.alagatkalinga

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class ImagePagerAdapter(private val context: Context) : PagerAdapter() {

    private val images = arrayOf(
        R.drawable.dogfoodpic1,
        R.drawable.dogfoodpic2,
        R.drawable.dogfoodpic3,
        R.drawable.dogfoodpic4,
        R.drawable.dogfoodpic5,
        R.drawable.dogfoodpic6,
        R.drawable.dogfoodpic7,
        R.drawable.dogfoodpic8,
        R.drawable.dogfoodpic9,
        R.drawable.dogfoodpic10,
    )
    private val titles = arrayOf(
        "Grain-Free Dog Food",
        "Peanut Butter and Pumpkin",
        "Glutten Free Dog Food",
        "Pup-Cakes",
        "Veggies and Turkey Mix",
        "Sweet Potato Dog Treats",
        "Dog Food with Meat and Vegetables",
        "Homemade Dog Food with Beef",
        "Doggy Meatloaf with Vegetables",
        "Lucky and Rippy's Favorite Dog Food"
    )
    override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(context)
        imageView.setImageResource(images[position])
        container.addView(imageView)

        // Set click listener on the image view
        imageView.setOnClickListener {
            val selectedTitle = titles[position]
            if (selectedTitle == "Grain-Free Dog Food") {
                Log.d("ImagePagerAdapter", "Image Clicked: Grain-Free Dog Food")
                val intent = Intent(context, DogRecipe1Activity::class.java)
                context.startActivity(intent)
            }
        }
    

