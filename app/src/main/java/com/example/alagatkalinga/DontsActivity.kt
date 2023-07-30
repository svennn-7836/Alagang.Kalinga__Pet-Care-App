package com.example.alagatkalinga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class DontsActivity : AppCompatActivity() {

    private lateinit var donts1: ImageView
    private lateinit var dontsw1: ImageView
    private lateinit var dontsc1: ImageView
    private lateinit var dontsw2: ImageView
    private lateinit var dontsc2: ImageView
    private lateinit var donts2: ImageView
    private lateinit var donts3: ImageView
    private lateinit var dontsw3: ImageView
    private lateinit var dontsc3: ImageView



    private var donts2InitialMarginTop = 0
    private var donts3InitialMarginTop = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donts)


        // Initialize the ImageView elements
        donts1 = findViewById(R.id.donts1)
        dontsw1 = findViewById(R.id.dontsw1)
        dontsc1 = findViewById(R.id.dontsc1)
        dontsw2 = findViewById(R.id.dontsw2)
        dontsc2 = findViewById(R.id.dontsc2)
        donts2 = findViewById(R.id.donts2)
        donts3 = findViewById(R.id.donts3)
        dontsw3 = findViewById(R.id.dontsw3)
        dontsc3 = findViewById(R.id.dontsc3)


        // Store the initial top margin values
        val donts2LayoutParams = donts2.layoutParams as ConstraintLayout.LayoutParams
        donts2InitialMarginTop = donts2LayoutParams.topMargin

        val donts3LayoutParams = donts3.layoutParams as ConstraintLayout.LayoutParams
        donts3InitialMarginTop = donts3LayoutParams.topMargin





        // Set initial visibility
        donts1.visibility = View.VISIBLE
        dontsw1.visibility = View.INVISIBLE
        dontsc1.visibility = View.INVISIBLE
        dontsw2.visibility = View.INVISIBLE
        dontsc2.visibility = View.INVISIBLE
        donts2.visibility = View.VISIBLE
        donts3.visibility = View.VISIBLE
        dontsw3.visibility = View.INVISIBLE
        dontsc3.visibility = View.INVISIBLE


    }

    // Click event handler for dos1
    fun onDonts1Click(view: View) {
        donts1.visibility = View.INVISIBLE
        dontsw1.visibility = View.VISIBLE
        dontsc1.visibility = View.VISIBLE
        dontsw2.visibility = View.INVISIBLE
        dontsc2.visibility = View.INVISIBLE
        donts2.visibility = View.VISIBLE
        donts3.visibility = View.VISIBLE
        dontsw3.visibility = View.INVISIBLE
        dontsc3.visibility = View.INVISIBLE



        // Set the top margin of donts2 to be 10dp below dontsc1
        val donts2LayoutParams = donts2.layoutParams as ConstraintLayout.LayoutParams
        donts2LayoutParams.topToBottom = R.id.dontsc1
        donts2LayoutParams.topMargin = dpToPx(10)
        donts2.layoutParams = donts2LayoutParams

        // Set the top margin of donts3 to be 10dp below donts2
        val donts3LayoutParams = donts3.layoutParams as ConstraintLayout.LayoutParams
        donts3LayoutParams.topToBottom = R.id.donts2
        donts3LayoutParams.topMargin = dpToPx(10)
        donts3.layoutParams = donts3LayoutParams



    }

    // Click event handler for dosw1
    fun onDontsw1Click(view: View) {
        donts1.visibility = View.VISIBLE
        dontsw1.visibility = View.INVISIBLE
        dontsc1.visibility = View.INVISIBLE
        dontsw2.visibility = View.INVISIBLE
        dontsc2.visibility = View.INVISIBLE
        donts2.visibility = View.VISIBLE
        donts3.visibility = View.VISIBLE
        dontsw3.visibility = View.INVISIBLE
        dontsc3.visibility = View.INVISIBLE


        // Reset the top margin of donts2 to its initial value
        val donts2LayoutParams = donts2.layoutParams as ConstraintLayout.LayoutParams
        donts2LayoutParams.topToBottom = R.id.donts1
        donts2LayoutParams.topMargin = donts2InitialMarginTop
        donts2.layoutParams = donts2LayoutParams

        // Reset the top margin of donts3 to its initial value
        val donts3LayoutParams = donts3.layoutParams as ConstraintLayout.LayoutParams
        donts3LayoutParams.topToBottom = R.id.donts2
        donts3LayoutParams.topMargin = donts3InitialMarginTop
        donts3.layoutParams = donts3LayoutParams




    }

    // Click event handler for dos2
    fun onDonts2Click(view: View) {
        donts1.visibility = View.VISIBLE
        dontsw1.visibility = View.INVISIBLE
        dontsc1.visibility = View.INVISIBLE
        dontsw2.visibility = View.VISIBLE
        dontsc2.visibility = View.VISIBLE
        donts2.visibility = View.INVISIBLE
        donts3.visibility = View.VISIBLE
        dontsw3.visibility = View.INVISIBLE
        dontsc3.visibility = View.INVISIBLE


        // Set the top margin of donts3 to be 44dp below dosc3
        val donts3LayoutParams = donts3.layoutParams as ConstraintLayout.LayoutParams
        donts3LayoutParams.topToBottom = R.id.dontsc2
        donts3LayoutParams.topMargin = dpToPx(10)
        donts3.layoutParams = donts3LayoutParams




    }

    // Click event handler for dosw2
    fun onDontsw2Click(view: View) {
        donts1.visibility = View.VISIBLE
        dontsw1.visibility = View.INVISIBLE
        dontsc1.visibility = View.INVISIBLE
        dontsw2.visibility = View.INVISIBLE
        dontsc2.visibility = View.INVISIBLE
        donts2.visibility = View.VISIBLE
        donts3.visibility = View.VISIBLE
        dontsw3.visibility = View.INVISIBLE
        dontsc3.visibility = View.INVISIBLE



        // Reset the top margin of donts2 to its initial value
        val donts2LayoutParams = donts2.layoutParams as ConstraintLayout.LayoutParams
        donts2LayoutParams.topToBottom = R.id.donts1
        donts2LayoutParams.topMargin = donts2InitialMarginTop
        donts2.layoutParams = donts2LayoutParams

        // Reset the top margin of donts3 to its initial value
        val donts3LayoutParams = donts3.layoutParams as ConstraintLayout.LayoutParams
        donts3LayoutParams.topToBottom = R.id.donts2
        donts3LayoutParams.topMargin = donts3InitialMarginTop
        donts3.layoutParams = donts3LayoutParams



    }
    // Click event handler for dos3
    fun onDonts3Click(view: View) {
        donts1.visibility = View.VISIBLE
        dontsw1.visibility = View.INVISIBLE
        dontsc1.visibility = View.INVISIBLE
        dontsw2.visibility = View.INVISIBLE
        dontsc2.visibility = View.INVISIBLE
        donts2.visibility = View.VISIBLE
        donts3.visibility = View.INVISIBLE
        dontsw3.visibility = View.VISIBLE
        dontsc3.visibility = View.VISIBLE


        // Reset the top margin of donts2 to its initial value
        val donts2LayoutParams = donts2.layoutParams as ConstraintLayout.LayoutParams
        donts2LayoutParams.topToBottom = R.id.donts1
        donts2LayoutParams.topMargin = donts2InitialMarginTop
        donts2.layoutParams = donts2LayoutParams



    }

    // Click event handler for dosw3
    fun onDontsw3Click(view: View) {
        donts1.visibility = View.VISIBLE
        dontsw1.visibility = View.INVISIBLE
        dontsc1.visibility = View.INVISIBLE
        dontsw2.visibility = View.INVISIBLE
        dontsc2.visibility = View.INVISIBLE
        donts2.visibility = View.VISIBLE
        donts3.visibility = View.VISIBLE
        dontsw3.visibility = View.INVISIBLE
        dontsc3.visibility = View.INVISIBLE


        // Reset the top margin of donts2 to its initial value
        val donts2LayoutParams = donts2.layoutParams as ConstraintLayout.LayoutParams
        donts2LayoutParams.topToBottom = R.id.donts1
        donts2LayoutParams.topMargin = donts2InitialMarginTop
        donts2.layoutParams = donts2LayoutParams

        // Reset the top margin of dos3 to its initial value
        val donts3LayoutParams = donts3.layoutParams as ConstraintLayout.LayoutParams
        donts3LayoutParams.topToBottom = R.id.donts2
        donts3LayoutParams.topMargin = donts3InitialMarginTop
        donts3.layoutParams = donts3LayoutParams


    }

    // Utility function to convert dp to pixels
    private fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density).toInt()
    }
}



