package com.example.alagatkalinga

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class DosDontsActivity : AppCompatActivity() {
    private lateinit var dos1: ImageView
    private lateinit var dosw1: ImageView
    private lateinit var dosc1: ImageView
    private lateinit var dos2: ImageView
    private lateinit var dos3: ImageView
    private lateinit var dos4: ImageView
    private lateinit var dosLayoutParams: ConstraintLayout.LayoutParams
    private lateinit var dos2LayoutParams: ConstraintLayout.LayoutParams
    private lateinit var dos3LayoutParams: ConstraintLayout.LayoutParams
    private lateinit var dos4LayoutParams: ConstraintLayout.LayoutParams

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosdonts_activity)

        val backButton: ImageView = findViewById(R.id.BackGreen1)
        backButton.setOnClickListener {
            onBackPressed()
        }

        dos1 = findViewById(R.id.dos1)
        dosw1 = findViewById(R.id.dosw1)
        dosc1 = findViewById(R.id.dosc1)
        dos2 = findViewById(R.id.dos2)
        dos3 = findViewById(R.id.dos3)
        dos4 = findViewById(R.id.dos4)

        // Save the initial layout params of dos1, dos2, dos3, and dos4 for later use
        dosLayoutParams = dos1.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams

        dos1.setOnClickListener {
            dos1.visibility = View.INVISIBLE
            dosw1.visibility = View.VISIBLE
            dosc1.visibility = View.VISIBLE

            // Adjust the position of dosw1
            val layoutParams = dosw1.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.topToBottom = dosc1.id
            dosw1.layoutParams = layoutParams

            // Move dos2 to the desired position
            dos2LayoutParams.topToBottom = dosc1.id
            dos2LayoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.dos2_margin_top)
            dos2.layoutParams = dos2LayoutParams

            // Move dos3 to the desired position
            dos3LayoutParams.topToBottom = dos2.id
            dos3LayoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.dos3_margin_top)
            dos3.layoutParams = dos3LayoutParams

            // Move dos4 to the desired position
            dos4LayoutParams.topToBottom = dos3.id
            dos4LayoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.dos4_margin_top)
            dos4.layoutParams = dos4LayoutParams
        }

        dosw1.setOnClickListener {
            dos1.visibility = View.VISIBLE
            dosw1.visibility = View.INVISIBLE
            dosc1.visibility = View.INVISIBLE

            // Reset the position of dosw1
            val layoutParams = dosw1.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
            dosw1.layoutParams = layoutParams

            // Reset the position of dos2
            dos2LayoutParams.topToBottom = dos1.id
            dos2LayoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.dos2_initial_margin_top)
            dos2.layoutParams = dos2LayoutParams

            // Reset the position of dos3
            dos3LayoutParams.topToBottom = dos2.id
            dos3LayoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.dos3_initial_margin_top)
            dos3.layoutParams = dos3LayoutParams

            // Reset the position of dos4
            dos4LayoutParams.topToBottom = dos3.id
            dos4LayoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.dos4_initial_margin_top)
            dos4.layoutParams = dos4LayoutParams
        }
    }
}




