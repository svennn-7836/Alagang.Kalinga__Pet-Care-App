package com.example.alagatkalinga

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class ImagePagerAdapter2(private val context: Context) : PagerAdapter() {

    private val images = arrayOf(
        R.drawable.catrecipe1,
        R.drawable.catrecipe2,
        R.drawable.catrecipe3,
        R.drawable.catrecipe4,
        R.drawable.catrecipe5,
        R.drawable.catrecipe6,
        R.drawable.catrecipe7,
        R.drawable.catrecipe8,
        R.drawable.catrecipe9,
        R.drawable.catrecipe10,
    )
    private val titles = arrayOf(
        "Chicken and Tuna Dinner",
        "Chicken Dinner",
        "Deluxe Fish Balls",
        "Chicken, Spinach & Quinoa",
        "Chicken and Salmon",
        "Grain-Free Meatloaf",
        "Chicken and Greens",
        "Mackerel Recipe",
        "Kitty Breakfast 1",
        "Kitty Breakfast 2",
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
            when (selectedTitle) {
                "Grain-Free Dog Food" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Grain-Free Dog Food")
                    val intent = Intent(context, DogRecipe1Activity::class.java)
                    context.startActivity(intent)
                }
                "Peanut Butter and Pumpkin" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Peanut Butter and Pumpkin")
                    val intent = Intent(context, DogRecipe2Activity::class.java)
                    context.startActivity(intent)
                }
                "Glutten Free Dog Food" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Glutten Free Dog Food")
                    val intent = Intent(context, DogRecipe3Activity::class.java)
                    context.startActivity(intent)
                }
                "Pup-Cakes" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Pup-Cakes")
                    val intent = Intent(context, DogRecipe4Activity::class.java)
                    context.startActivity(intent)
                }
                "Veggies and Turkey Mix" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Veggies and Turkey Mix")
                    val intent = Intent(context, DogRecipe5Activity::class.java)
                    context.startActivity(intent)
                }
                // Add more cases for other titles and corresponding activities if needed
            }
        }

        // Set click listener on the title view
        val recipeTitleText = container.rootView.findViewById<TextView>(R.id.recipeTitleText)
        recipeTitleText.setOnClickListener {
            val selectedTitle = titles[position]
            when (selectedTitle) {
                "Grain-Free Dog Food" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Grain-Free Dog Food")
                    val intent = Intent(context, DogRecipe1Activity::class.java)
                    context.startActivity(intent)
                }
                "Peanut Butter and Pumpkin" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Peanut Butter and Pumpkin")
                    val intent = Intent(context, DogRecipe2Activity::class.java)
                    context.startActivity(intent)
                }
                "Glutten Free Dog Food" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Glutten Free Dog Food")
                    val intent = Intent(context, DogRecipe3Activity::class.java)
                    context.startActivity(intent)
                }
                "Pup-Cakes" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Pup-Cakes")
                    val intent = Intent(context, DogRecipe4Activity::class.java)
                    context.startActivity(intent)
                }
                "Veggies and Turkey Mix" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Veggies and Turkey Mix")
                    val intent = Intent(context, DogRecipe5Activity::class.java)
                    context.startActivity(intent)
                }
                // Add more cases for other titles and corresponding activities if needed
            }
        }

        return imageView
    }




    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}


