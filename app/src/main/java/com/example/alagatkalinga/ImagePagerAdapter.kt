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
                "Sweet Potato Dog Treats" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Sweet Potato Dog Treats")
                    val intent = Intent(context, DogRecipe6Activity::class.java)
                    context.startActivity(intent)
                }
                "Dog Food with Meat and Vegetables" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Dog Food with Meat and Vegetables")
                    val intent = Intent(context, DogRecipe7Activity::class.java)
                    context.startActivity(intent)
                }
                "Homemade Dog Food with Beef" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Homemade Dog Food with Beef")
                    val intent = Intent(context, DogRecipe8Activity::class.java)
                    context.startActivity(intent)
                }
                "Doggy Meatloaf with Vegetables" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Doggy Meatloaf with Vegetables")
                    val intent = Intent(context, DogRecipe9Activity::class.java)
                    context.startActivity(intent)
                }
                "Lucky and Rippy's Favorite Dog Food" -> {
                    Log.d("ImagePagerAdapter", "Image Clicked: Lucky and Rippy's Favorite Dog Food")
                    val intent = Intent(context, DogRecipe10Activity::class.java)
                    context.startActivity(intent)
                }  // Add more cases for other titles and corresponding activities if needed
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
                "Sweet Potato Dog Treats" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Sweet Potato Dog Treats")
                    val intent = Intent(context, DogRecipe6Activity::class.java)
                    context.startActivity(intent)
                }
                "Dog Food with Meat and Vegetables" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Dog Food with Meat and Vegetables")
                    val intent = Intent(context, DogRecipe7Activity::class.java)
                    context.startActivity(intent)
                }
                "Homemade Dog Food with Beef" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Homemade Dog Food with Beef")
                    val intent = Intent(context, DogRecipe8Activity::class.java)
                    context.startActivity(intent)
                }
                "Doggy Meatloaf with Vegetables" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Doggy Meatloaf with Vegetables")
                    val intent = Intent(context, DogRecipe9Activity::class.java)
                    context.startActivity(intent)
                }
                "Lucky and Rippy's Favorite Dog Food" -> {
                    Log.d("ImagePagerAdapter", "Title Clicked: Lucky and Rippy's Favorite Dog Food")
                    val intent = Intent(context, DogRecipe10Activity::class.java)
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


