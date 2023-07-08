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
        R.drawable.catfoodpic1,
        R.drawable.catfoodpic2,
        R.drawable.catfoodpic3,
        R.drawable.catfoodpic4,
        R.drawable.catfoodpic5,
        R.drawable.catfoodpic6,
        R.drawable.catfoodpic7,
        R.drawable.catfoodpic8,
        R.drawable.catfoodpic9,
        R.drawable.catfoodpic10
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
        "Kitty Breakfast 2"
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
                "Chicken and Tuna Dinner" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Chicken and Tuna Dinner")
                    val intent = Intent(context, CatRecipe1Activity::class.java)
                    context.startActivity(intent)
                }
                "Chicken Dinner" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Chicken Dinner")
                    val intent = Intent(context, CatRecipe2Activity::class.java)
                    context.startActivity(intent)
                }
                "Deluxe Fish Balls" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Deluxe Fish Balls")
                    val intent = Intent(context, CatRecipe3Activity::class.java)
                    context.startActivity(intent)
                }
                "Chicken, Spinach & Quinoa" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Chicken, Spinach & Quinoa")
                    val intent = Intent(context, CatRecipe4Activitiy::class.java)
                    context.startActivity(intent)
                }
                "Chicken and Salmon" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Chicken and Salmon")
                    val intent = Intent(context, CatRecipe5Activity::class.java)
                    context.startActivity(intent)
                }
                "Grain-Free Meatloaf" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Grain-Free Meatloaf")
                    val intent = Intent(context, CatRecipe6Activity::class.java)
                    context.startActivity(intent)
                }
                "Chicken and Greens" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Chicken and Greens")
                    val intent = Intent(context, CatRecipe7Activity::class.java)
                    context.startActivity(intent)
                }
                "Mackerel Recipe" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Mackerel Recipe")
                    val intent = Intent(context, CatRecipe8Activity::class.java)
                    context.startActivity(intent)
                }
                "Kitty Breakfast 1" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Kitty Breakfast 1")
                    val intent = Intent(context, CatRecipe9Activity::class.java)
                    context.startActivity(intent)
                }
                "Kitty Breakfast 2" -> {
                    Log.d("ImagePagerAdapter2", "Image Clicked: Kitty Breakfast 2")
                    val intent = Intent(context, CatRecipe10Activity::class.java)
                    context.startActivity(intent)
                }// Add more cases for other titles and corresponding activities if needed
            }
        }

        // Set click listener on the title view
        val recipeTitleText = container.rootView.findViewById<TextView>(R.id.CatrecipeTitleText)
        recipeTitleText.setOnClickListener {
            val selectedTitle = titles[position]
            when (selectedTitle) {
                "Chicken and Tuna Dinner" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Chicken and Tuna Dinner")
                    val intent = Intent(context, CatRecipe1Activity::class.java)
                    context.startActivity(intent)
                }
                "Chicken Dinner" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Chicken Dinner")
                    val intent = Intent(context, CatRecipe2Activity::class.java)
                    context.startActivity(intent)
                }
                "Deluxe Fish Balls" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Deluxe Fish Balls")
                    val intent = Intent(context, CatRecipe3Activity::class.java)
                    context.startActivity(intent)
                }
                "Chicken, Spinach & Quinoa" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Chicken, Spinach & Quinoa")
                    val intent = Intent(context, CatRecipe4Activitiy::class.java)
                    context.startActivity(intent)
                }
                "Chicken and Salmon" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Chicken and Salmon")
                    val intent = Intent(context, CatRecipe5Activity::class.java)
                    context.startActivity(intent)
                }
                "Grain-Free Meatloaf" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Grain-Free Meatloaf")
                    val intent = Intent(context, CatRecipe6Activity::class.java)
                    context.startActivity(intent)
                }
                "Chicken and Greens" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Chicken and Greens")
                    val intent = Intent(context, CatRecipe7Activity::class.java)
                    context.startActivity(intent)
                }
                "Mackerel Recipe" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Mackerel Recipe")
                    val intent = Intent(context, CatRecipe8Activity::class.java)
                    context.startActivity(intent)
                }
                "Kitty Breakfast 1" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Kitty Breakfast 1")
                    val intent = Intent(context, CatRecipe9Activity::class.java)
                    context.startActivity(intent)
                }
                "Kitty Breakfast 2" -> {
                    Log.d("ImagePagerAdapter2", "Title Clicked: Kitty Breakfast 2")
                    val intent = Intent(context, CatRecipe10Activity::class.java)
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


