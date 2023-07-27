package com.example.alagatkalinga

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class SymptomsActivity : AppCompatActivity() {

    private lateinit var symp1: ImageView
    private lateinit var sympw1: ImageView
    private lateinit var sympc1: ImageView
    private lateinit var symp2: ImageView
    private lateinit var sympw2: ImageView
    private lateinit var sympc2: ImageView
    private lateinit var symp3: ImageView
    private lateinit var sympw3: ImageView
    private lateinit var sympc3: ImageView
    private lateinit var symp4: ImageView
    private lateinit var sympw4: ImageView
    private lateinit var sympc4: ImageView
    private lateinit var symp5: ImageView
    private lateinit var sympw5: ImageView
    private lateinit var sympc5: ImageView
    private lateinit var symp6: ImageView
    private lateinit var sympw6: ImageView
    private lateinit var sympc6: ImageView
    private lateinit var symp7: ImageView
    private lateinit var sympw7: ImageView
    private lateinit var sympc7: ImageView

    private var symp1InitialMarginTop = 0
    private var symp2InitialMarginTop = 0
    private var symp3InitialMarginTop = 0
    private var symp4InitialMarginTop = 0
    private var symp5InitialMarginTop = 0
    private var symp6InitialMarginTop = 0
    private var symp7InitialMarginTop = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms)

        val backButton: ImageView = findViewById(R.id.BackBlue1)
        backButton.setOnClickListener {
            onBackPressed()

        }
        // Initialize the ImageView elements
        symp1 = findViewById(R.id.symp1)
        sympw1 = findViewById(R.id.sympw1)
        sympc1 = findViewById(R.id.sympc1)
        symp2 = findViewById(R.id.symp2)
        sympw2 = findViewById(R.id.sympw2)
        sympc2 = findViewById(R.id.sympc2)
        symp3 = findViewById(R.id.symp3)
        sympw3 = findViewById(R.id.sympw3)
        sympc3 = findViewById(R.id.sympc3)
        symp4 = findViewById(R.id.symp4)
        sympw4 = findViewById(R.id.sympw4)
        sympc4 = findViewById(R.id.sympc4)
        symp5 = findViewById(R.id.symp5)
        sympw5 = findViewById(R.id.sympw5)
        sympc5 = findViewById(R.id.sympc5)
        symp6 = findViewById(R.id.symp6)
        sympw6 = findViewById(R.id.sympw6)
        sympc6 = findViewById(R.id.sympc6)
        symp7 = findViewById(R.id.symp7)
        sympw7 = findViewById(R.id.sympw7)
        sympc7 = findViewById(R.id.sympc7)

        // Store the initial top margin values
        val symp1LayoutParams = symp1.layoutParams as ConstraintLayout.LayoutParams
        symp1InitialMarginTop = symp1LayoutParams.topMargin

        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2InitialMarginTop = symp2LayoutParams.topMargin

        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3InitialMarginTop = symp3LayoutParams.topMargin

        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4InitialMarginTop = symp4LayoutParams.topMargin

        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5InitialMarginTop = symp5LayoutParams.topMargin

        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6InitialMarginTop = symp6LayoutParams.topMargin

        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7InitialMarginTop = symp7LayoutParams.topMargin

        // Set initial visibility
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE
    }

    // Click event handler for Symp1

    fun onSymp1Click(view: View) {
            symp1.visibility = View.INVISIBLE
            sympw1.visibility = View.VISIBLE
            sympc1.visibility = View.VISIBLE
            symp2.visibility = View.VISIBLE
            sympw2.visibility = View.INVISIBLE
            sympc2.visibility = View.INVISIBLE
            symp3.visibility = View.VISIBLE
            sympw3.visibility = View.INVISIBLE
            sympc3.visibility = View.INVISIBLE
            symp4.visibility = View.VISIBLE
            sympw4.visibility = View.INVISIBLE
            sympc4.visibility = View.INVISIBLE
            symp5.visibility = View.VISIBLE
            sympw5.visibility = View.INVISIBLE
            sympc5.visibility = View.INVISIBLE
            symp6.visibility = View.VISIBLE
            sympw6.visibility = View.INVISIBLE
            sympc6.visibility = View.INVISIBLE
            symp7.visibility = View.VISIBLE
            sympw7.visibility = View.INVISIBLE
            sympc7.visibility = View.INVISIBLE

            // Set the top margin of symp2 to be 10dp below sympc1
            val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
            symp2LayoutParams.topToBottom = R.id.sympc1
            symp2LayoutParams.topMargin = dpToPx(10)
            symp2.layoutParams = symp2LayoutParams

            // Set the top margin of symp3 to be 10dp below symp2
            val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
            symp3LayoutParams.topToBottom = R.id.symp2
            symp3LayoutParams.topMargin = dpToPx(10)
            symp3.layoutParams = symp3LayoutParams

            // Set the top margin of symp4 to be 10dp below symp3
            val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
            symp4LayoutParams.topToBottom = R.id.symp3
            symp4LayoutParams.topMargin = dpToPx(10)
            symp4.layoutParams = symp4LayoutParams

            // Set the top margin of symp5 to be 10dp below symp4
            val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
            symp5LayoutParams.topToBottom = R.id.symp4
            symp5LayoutParams.topMargin = dpToPx(10)
            symp5.layoutParams = symp5LayoutParams

            // Set the top margin of symp6 to be 10dp below symp5
            val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
            symp6LayoutParams.topToBottom = R.id.symp5
            symp6LayoutParams.topMargin = dpToPx(10)
            symp6.layoutParams = symp6LayoutParams

            // Set the top margin of symp7 to be 10dp below symp6
            val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
            symp7LayoutParams.topToBottom = R.id.symp6
            symp7LayoutParams.topMargin = dpToPx(10)
            symp7.layoutParams = symp7LayoutParams

    }

    // Click event handler for Sympw1
    fun onSympw1Click(view: View) {
            symp1.visibility = View.VISIBLE
            sympw1.visibility = View.INVISIBLE
            sympc1.visibility = View.INVISIBLE
            symp2.visibility = View.VISIBLE
            sympw2.visibility = View.INVISIBLE
            sympc2.visibility = View.INVISIBLE
            symp3.visibility = View.VISIBLE
            sympw3.visibility = View.INVISIBLE
            sympc3.visibility = View.INVISIBLE
            symp4.visibility = View.VISIBLE
            sympw4.visibility = View.INVISIBLE
            sympc4.visibility = View.INVISIBLE
            symp5.visibility = View.VISIBLE
            sympw5.visibility = View.INVISIBLE
            sympc5.visibility = View.INVISIBLE
            symp6.visibility = View.VISIBLE
            sympw6.visibility = View.INVISIBLE
            sympc6.visibility = View.INVISIBLE
            symp7.visibility = View.VISIBLE
            sympw7.visibility = View.INVISIBLE
            sympc7.visibility = View.INVISIBLE

            // Reset the top margin of symp2 to its initial value
            val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
            symp2LayoutParams.topToBottom = R.id.symp1
            symp2LayoutParams.topMargin = symp2InitialMarginTop
            symp2.layoutParams = symp2LayoutParams

            // Reset the top margin of symp3 to its initial value
            val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
            symp3LayoutParams.topToBottom = R.id.symp2
            symp3LayoutParams.topMargin = symp3InitialMarginTop
            symp3.layoutParams = symp3LayoutParams

            // Reset the top margin of symp4 to its initial value
            val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
            symp4LayoutParams.topToBottom = R.id.symp3
            symp4LayoutParams.topMargin = symp4InitialMarginTop
            symp4.layoutParams = symp4LayoutParams

            // Reset the top margin of symp5 to its initial value
            val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
            symp5LayoutParams.topToBottom = R.id.symp4
            symp5LayoutParams.topMargin = symp5InitialMarginTop
            symp5.layoutParams = symp5LayoutParams

            // Reset the top margin of symp6 to its initial value
            val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
            symp6LayoutParams.topToBottom = R.id.symp5
            symp6LayoutParams.topMargin = symp6InitialMarginTop
            symp6.layoutParams = symp6LayoutParams

            val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
            symp7LayoutParams.topToBottom = R.id.symp6
            symp7LayoutParams.topMargin = symp7InitialMarginTop
            symp7.layoutParams = symp7LayoutParams

    }

    // Click event handler for Symp2

    fun onSymp2Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.INVISIBLE
        sympw2.visibility = View.VISIBLE
        sympc2.visibility = View.VISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE


        // Set the top margin of symp3 to be 10dp below symp2
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.sympc2
        symp3LayoutParams.topMargin = dpToPx(10)
        symp3.layoutParams = symp3LayoutParams

        // Set the top margin of symp4 to be 10dp below symp3
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = dpToPx(10)
        symp4.layoutParams = symp4LayoutParams

        // Set the top margin of symp5 to be 10dp below symp4
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = dpToPx(10)
        symp5.layoutParams = symp5LayoutParams

        // Set the top margin of symp6 to be 10dp below symp5
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = dpToPx(10)
        symp6.layoutParams = symp6LayoutParams

        // Set the top margin of symp7 to be 10dp below symp6
        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = dpToPx(10)
        symp7.layoutParams = symp7LayoutParams

    }

    // Click event handler for Sympw2
    fun onSympw2Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE

        // Reset the top margin of symp2 to its initial value
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = symp2InitialMarginTop
        symp2.layoutParams = symp2LayoutParams

        // Reset the top margin of symp3 to its initial value
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = symp3InitialMarginTop
        symp3.layoutParams = symp3LayoutParams

        // Reset the top margin of symp4 to its initial value
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = symp4InitialMarginTop
        symp4.layoutParams = symp4LayoutParams

        // Reset the top margin of symp5 to its initial value
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = symp5InitialMarginTop
        symp5.layoutParams = symp5LayoutParams

        // Reset the top margin of symp6 to its initial value
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = symp6InitialMarginTop
        symp6.layoutParams = symp6LayoutParams

        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = symp7InitialMarginTop
        symp7.layoutParams = symp7LayoutParams

    }
    // Click event handler for Symp3

    fun onSymp3Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.INVISIBLE
        sympw3.visibility = View.VISIBLE
        sympc3.visibility = View.VISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE


        // Set the top margin of symp2 to be 10dp below symp1
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = dpToPx(10)
        symp2.layoutParams = symp2LayoutParams

        // Set the top margin of symp4 to be 10dp below symp3
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.sympc3
        symp4LayoutParams.topMargin = dpToPx(10)
        symp4.layoutParams = symp4LayoutParams

        // Set the top margin of symp5 to be 10dp below symp4
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = dpToPx(10)
        symp5.layoutParams = symp5LayoutParams

        // Set the top margin of symp6 to be 10dp below symp5
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = dpToPx(10)
        symp6.layoutParams = symp6LayoutParams

        // Set the top margin of symp7 to be 10dp below symp6
        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = dpToPx(10)
        symp7.layoutParams = symp7LayoutParams

    }

    // Click event handler for Sympw3
    fun onSympw3Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE

        // Reset the top margin of symp2 to its initial value
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = symp2InitialMarginTop
        symp2.layoutParams = symp2LayoutParams

        // Reset the top margin of symp3 to its initial value
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = symp3InitialMarginTop
        symp3.layoutParams = symp3LayoutParams

        // Reset the top margin of symp4 to its initial value
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = symp4InitialMarginTop
        symp4.layoutParams = symp4LayoutParams

        // Reset the top margin of symp5 to its initial value
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = symp5InitialMarginTop
        symp5.layoutParams = symp5LayoutParams

        // Reset the top margin of symp6 to its initial value
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = symp6InitialMarginTop
        symp6.layoutParams = symp6LayoutParams

        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = symp7InitialMarginTop
        symp7.layoutParams = symp7LayoutParams

    }
    // Click event handler for Symp4

    fun onSymp4Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.INVISIBLE
        sympw4.visibility = View.VISIBLE
        sympc4.visibility = View.VISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE


        // Set the top margin of symp2 to be 10dp below symp1
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = dpToPx(10)
        symp2.layoutParams = symp2LayoutParams

        // Set the top margin of symp3 to be 10dp below symp2
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = dpToPx(10)
        symp3.layoutParams = symp3LayoutParams

        // Set the top margin of symp5 to be 10dp below symp4
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.sympc4
        symp5LayoutParams.topMargin = dpToPx(10)
        symp5.layoutParams = symp5LayoutParams

        // Set the top margin of symp6 to be 10dp below symp5
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = dpToPx(10)
        symp6.layoutParams = symp6LayoutParams

        // Set the top margin of symp7 to be 10dp below symp6
        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = dpToPx(10)
        symp7.layoutParams = symp7LayoutParams

    }

    // Click event handler for Sympw4
    fun onSympw4Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE

        // Reset the top margin of symp2 to its initial value
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = symp2InitialMarginTop
        symp2.layoutParams = symp2LayoutParams

        // Reset the top margin of symp3 to its initial value
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = symp3InitialMarginTop
        symp3.layoutParams = symp3LayoutParams

        // Reset the top margin of symp4 to its initial value
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = symp4InitialMarginTop
        symp4.layoutParams = symp4LayoutParams

        // Reset the top margin of symp5 to its initial value
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = symp5InitialMarginTop
        symp5.layoutParams = symp5LayoutParams

        // Reset the top margin of symp6 to its initial value
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = symp6InitialMarginTop
        symp6.layoutParams = symp6LayoutParams

        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = symp7InitialMarginTop
        symp7.layoutParams = symp7LayoutParams

    }
    // Click event handler for Symp5

    fun onSymp5Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.INVISIBLE
        sympw5.visibility = View.VISIBLE
        sympc5.visibility = View.VISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE


        // Set the top margin of symp2 to be 10dp below symp1
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = dpToPx(10)
        symp2.layoutParams = symp2LayoutParams

        // Set the top margin of symp3 to be 10dp below symp2
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = dpToPx(10)
        symp3.layoutParams = symp3LayoutParams

        // Set the top margin of symp4 to be 10dp below symp3
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = dpToPx(10)
        symp4.layoutParams = symp4LayoutParams

        // Set the top margin of symp6 to be 10dp below symp5
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.sympc5
        symp6LayoutParams.topMargin = dpToPx(10)
        symp6.layoutParams = symp6LayoutParams

        // Set the top margin of symp7 to be 10dp below symp6
        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = dpToPx(10)
        symp7.layoutParams = symp7LayoutParams

    }

    // Click event handler for Sympw5
    fun onSympw5Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE

        // Reset the top margin of symp2 to its initial value
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = symp2InitialMarginTop
        symp2.layoutParams = symp2LayoutParams

        // Reset the top margin of symp3 to its initial value
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = symp3InitialMarginTop
        symp3.layoutParams = symp3LayoutParams

        // Reset the top margin of symp4 to its initial value
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = symp4InitialMarginTop
        symp4.layoutParams = symp4LayoutParams

        // Reset the top margin of symp5 to its initial value
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = symp5InitialMarginTop
        symp5.layoutParams = symp5LayoutParams

        // Reset the top margin of symp6 to its initial value
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = symp6InitialMarginTop
        symp6.layoutParams = symp6LayoutParams

        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = symp7InitialMarginTop
        symp7.layoutParams = symp7LayoutParams

    }
    // Click event handler for Symp6

    fun onSymp6Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.INVISIBLE
        sympw6.visibility = View.VISIBLE
        sympc6.visibility = View.VISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE


        // Set the top margin of symp2 to be 10dp below symp1
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = dpToPx(10)
        symp2.layoutParams = symp2LayoutParams

        // Set the top margin of symp3 to be 10dp below symp2
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = dpToPx(10)
        symp3.layoutParams = symp3LayoutParams

        // Set the top margin of symp4 to be 10dp below symp3
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = dpToPx(10)
        symp4.layoutParams = symp4LayoutParams

        // Set the top margin of symp5 to be 10dp below symp4
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = dpToPx(10)
        symp5.layoutParams = symp5LayoutParams

        // Set the top margin of symp7 to be 10dp below symp6
        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.sympc6
        symp7LayoutParams.topMargin = dpToPx(10)
        symp7.layoutParams = symp7LayoutParams

    }

    // Click event handler for Sympw6
    fun onSympw6Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE

        // Reset the top margin of symp2 to its initial value
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = symp2InitialMarginTop
        symp2.layoutParams = symp2LayoutParams

        // Reset the top margin of symp3 to its initial value
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = symp3InitialMarginTop
        symp3.layoutParams = symp3LayoutParams

        // Reset the top margin of symp4 to its initial value
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = symp4InitialMarginTop
        symp4.layoutParams = symp4LayoutParams

        // Reset the top margin of symp5 to its initial value
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = symp5InitialMarginTop
        symp5.layoutParams = symp5LayoutParams

        // Reset the top margin of symp6 to its initial value
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = symp6InitialMarginTop
        symp6.layoutParams = symp6LayoutParams

        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = symp7InitialMarginTop
        symp7.layoutParams = symp7LayoutParams

    }
    // Click event handler for Symp7

    fun onSymp7Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.INVISIBLE
        sympw7.visibility = View.VISIBLE
        sympc7.visibility = View.VISIBLE


        // Set the top margin of symp2 to be 10dp below symp1
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = dpToPx(10)
        symp2.layoutParams = symp2LayoutParams

        // Set the top margin of symp3 to be 10dp below symp2
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = dpToPx(10)
        symp3.layoutParams = symp3LayoutParams

        // Set the top margin of symp4 to be 10dp below symp3
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = dpToPx(10)
        symp4.layoutParams = symp4LayoutParams

        // Set the top margin of symp5 to be 10dp below symp4
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = dpToPx(10)
        symp5.layoutParams = symp5LayoutParams

        // Set the top margin of symp6 to be 10dp below symp5
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = dpToPx(10)
        symp6.layoutParams = symp6LayoutParams

    }

    // Click event handler for Sympw7
    fun onSympw7Click(view: View) {
        symp1.visibility = View.VISIBLE
        sympw1.visibility = View.INVISIBLE
        sympc1.visibility = View.INVISIBLE
        symp2.visibility = View.VISIBLE
        sympw2.visibility = View.INVISIBLE
        sympc2.visibility = View.INVISIBLE
        symp3.visibility = View.VISIBLE
        sympw3.visibility = View.INVISIBLE
        sympc3.visibility = View.INVISIBLE
        symp4.visibility = View.VISIBLE
        sympw4.visibility = View.INVISIBLE
        sympc4.visibility = View.INVISIBLE
        symp5.visibility = View.VISIBLE
        sympw5.visibility = View.INVISIBLE
        sympc5.visibility = View.INVISIBLE
        symp6.visibility = View.VISIBLE
        sympw6.visibility = View.INVISIBLE
        sympc6.visibility = View.INVISIBLE
        symp7.visibility = View.VISIBLE
        sympw7.visibility = View.INVISIBLE
        sympc7.visibility = View.INVISIBLE

        // Reset the top margin of symp2 to its initial value
        val symp2LayoutParams = symp2.layoutParams as ConstraintLayout.LayoutParams
        symp2LayoutParams.topToBottom = R.id.symp1
        symp2LayoutParams.topMargin = symp2InitialMarginTop
        symp2.layoutParams = symp2LayoutParams

        // Reset the top margin of symp3 to its initial value
        val symp3LayoutParams = symp3.layoutParams as ConstraintLayout.LayoutParams
        symp3LayoutParams.topToBottom = R.id.symp2
        symp3LayoutParams.topMargin = symp3InitialMarginTop
        symp3.layoutParams = symp3LayoutParams

        // Reset the top margin of symp4 to its initial value
        val symp4LayoutParams = symp4.layoutParams as ConstraintLayout.LayoutParams
        symp4LayoutParams.topToBottom = R.id.symp3
        symp4LayoutParams.topMargin = symp4InitialMarginTop
        symp4.layoutParams = symp4LayoutParams

        // Reset the top margin of symp5 to its initial value
        val symp5LayoutParams = symp5.layoutParams as ConstraintLayout.LayoutParams
        symp5LayoutParams.topToBottom = R.id.symp4
        symp5LayoutParams.topMargin = symp5InitialMarginTop
        symp5.layoutParams = symp5LayoutParams

        // Reset the top margin of symp6 to its initial value
        val symp6LayoutParams = symp6.layoutParams as ConstraintLayout.LayoutParams
        symp6LayoutParams.topToBottom = R.id.symp5
        symp6LayoutParams.topMargin = symp6InitialMarginTop
        symp6.layoutParams = symp6LayoutParams

        val symp7LayoutParams = symp7.layoutParams as ConstraintLayout.LayoutParams
        symp7LayoutParams.topToBottom = R.id.symp6
        symp7LayoutParams.topMargin = symp7InitialMarginTop
        symp7.layoutParams = symp7LayoutParams

    }
    // Utility function to convert dp to pixels
    private fun dpToPx(dp: Int): Int {
    val density = resources.displayMetrics.density
    return (dp * density).toInt()
    }

}