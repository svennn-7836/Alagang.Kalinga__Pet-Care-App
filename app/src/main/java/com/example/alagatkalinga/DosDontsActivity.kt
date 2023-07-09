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
    private lateinit var dosw2: ImageView
    private lateinit var dosc2: ImageView
    private lateinit var dos2: ImageView
    private lateinit var dos3: ImageView
    private lateinit var dosw3: ImageView
    private lateinit var dosc3: ImageView
    private lateinit var dos4: ImageView
    private lateinit var dosw4: ImageView
    private lateinit var dosc4: ImageView
    private lateinit var dos5: ImageView
    private lateinit var dosw5: ImageView
    private lateinit var dosc5: ImageView
    private lateinit var dos6: ImageView

    private var dos2InitialMarginTop = 0
    private var dos3InitialMarginTop = 0
    private var dos4InitialMarginTop = 0
    private var dos5InitialMarginTop = 0
    private var dos6InitialMarginTop = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosdonts_activity)

        // Initialize the ImageView elements
        dos1 = findViewById(R.id.dos1)
        dosw1 = findViewById(R.id.dosw1)
        dosc1 = findViewById(R.id.dosc1)
        dosw2 = findViewById(R.id.dosw2)
        dosc2 = findViewById(R.id.dosc2)
        dos2 = findViewById(R.id.dos2)
        dos3 = findViewById(R.id.dos3)
        dosw3 = findViewById(R.id.dosw3)
        dosc3 = findViewById(R.id.dosc3)
        dos4 = findViewById(R.id.dos4)
        dosw4 = findViewById(R.id.dosw4)
        dosc4 = findViewById(R.id.dosc4)
        dos5 = findViewById(R.id.dos5)
        dosw5 = findViewById(R.id.dosw5)
        dosc5= findViewById(R.id.dosc5)
        dos6 = findViewById(R.id.dos6)

        // Store the initial top margin values
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2InitialMarginTop = dos2LayoutParams.topMargin

        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3InitialMarginTop = dos3LayoutParams.topMargin

        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4InitialMarginTop = dos4LayoutParams.topMargin

        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5InitialMarginTop = dos5LayoutParams.topMargin

        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6InitialMarginTop = dos6LayoutParams.topMargin


        // Set initial visibility
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE
    }

    // Click event handler for dos1
    fun onDos1Click(view: View) {
        dos1.visibility = View.INVISIBLE
        dosw1.visibility = View.VISIBLE
        dosc1.visibility = View.VISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE

        // Set the top margin of dos2 to be 10dp below dosc1
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams.topToBottom = R.id.dosc1
        dos2LayoutParams.topMargin = dpToPx(10)
        dos2.layoutParams = dos2LayoutParams

        // Set the top margin of dos3 to be 10dp below dos2
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dos2
        dos3LayoutParams.topMargin = dpToPx(10)
        dos3.layoutParams = dos3LayoutParams

        // Set the top margin of dos4 to be 10dp below dos3
        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams.topToBottom = R.id.dos3
        dos4LayoutParams.topMargin = dpToPx(10)
        dos4.layoutParams = dos4LayoutParams

        // Set the top margin of dos5 to be 10dp below dos4
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dos4
        dos5LayoutParams.topMargin = dpToPx(10)
        dos5.layoutParams = dos5LayoutParams

        // Set the top margin of dos6 to be 10dp below dos5
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dos5
        dos6LayoutParams.topMargin = dpToPx(10)
        dos6.layoutParams = dos6LayoutParams
    }

    // Click event handler for dosw1
    fun onDosw1Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE

        // Reset the top margin of dos2 to its initial value
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams.topToBottom = R.id.dos1
        dos2LayoutParams.topMargin = dos2InitialMarginTop
        dos2.layoutParams = dos2LayoutParams

        // Reset the top margin of dos3 to its initial value
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dos2
        dos3LayoutParams.topMargin = dos3InitialMarginTop
        dos3.layoutParams = dos3LayoutParams

        // Reset the top margin of dos4 to its initial value
        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams.topToBottom = R.id.dos3
        dos4LayoutParams.topMargin = dos4InitialMarginTop
        dos4.layoutParams = dos4LayoutParams

        // Reset the top margin of dos5 to its initial value
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dos4
        dos5LayoutParams.topMargin = dos5InitialMarginTop
        dos5.layoutParams = dos5LayoutParams
    }

    // Click event handler for dos2
    fun onDos2Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.VISIBLE
        dosc2.visibility = View.VISIBLE
        dos2.visibility = View.INVISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE

        // Set the top margin of dos3 to be 44dp below dosc3
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dosc2
        dos3LayoutParams.topMargin = dpToPx(10)
        dos3.layoutParams = dos3LayoutParams

        // Set the top margin of dos4 to be 44dp below dosc4
        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams.topToBottom = R.id.dos3
        dos4LayoutParams.topMargin = dpToPx(10)
        dos4.layoutParams = dos4LayoutParams

        // Set the top margin of dos3 to be 44dp below dos2
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dos4
        dos5LayoutParams.topMargin = dpToPx(10)
        dos5.layoutParams = dos5LayoutParams

        // Set the top margin of dos6 to be 10dp below dos5
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dos5
        dos6LayoutParams.topMargin = dpToPx(10)
        dos6.layoutParams = dos6LayoutParams
    }

    // Click event handler for dosw2
    // Click event handler for dosw2
    fun onDosw2Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE

        // Reset the top margin of dos2 to its initial value
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams.topToBottom = R.id.dos1
        dos2LayoutParams.topMargin = dos2InitialMarginTop
        dos2.layoutParams = dos2LayoutParams

        // Reset the top margin of dos3 to its initial value
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dos2
        dos3LayoutParams.topMargin = dos3InitialMarginTop
        dos3.layoutParams = dos3LayoutParams

        // Reset the top margin of dos4 to its initial value
        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams.topToBottom = R.id.dos3
        dos4LayoutParams.topMargin = dos4InitialMarginTop
        dos4.layoutParams = dos4LayoutParams

        // Reset the top margin of dos5 to its initial value
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dos4
        dos5LayoutParams.topMargin = dos5InitialMarginTop
        dos5.layoutParams = dos5LayoutParams

        // Reset the top margin of dos6 to its initial value
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dos5
        dos6LayoutParams.topMargin = dos6InitialMarginTop
        dos6.layoutParams = dos6LayoutParams
    }
    // Click event handler for dos3
    fun onDos3Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.INVISIBLE
        dosw3.visibility = View.VISIBLE
        dosc3.visibility = View.VISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE

        // Set the top margin of dos4 to be 44dp below dosc3
        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams.topToBottom = R.id.dosc3
        dos4LayoutParams.topMargin = dpToPx(10)
        dos4.layoutParams = dos4LayoutParams

        // Set the top margin of dos3 to be 44dp below dos2
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dos4
        dos5LayoutParams.topMargin = dpToPx(10)
        dos5.layoutParams = dos5LayoutParams

        // Set the top margin of dos6 to be 10dp below dos5
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dos5
        dos6LayoutParams.topMargin = dpToPx(10)
        dos6.layoutParams = dos6LayoutParams
    }

    // Click event handler for dosw3
    fun onDosw3Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE

        // Reset the top margin of dos2 to its initial value
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams.topToBottom = R.id.dos1
        dos2LayoutParams.topMargin = dos2InitialMarginTop
        dos2.layoutParams = dos2LayoutParams

        // Reset the top margin of dos3 to its initial value
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dos2
        dos3LayoutParams.topMargin = dos3InitialMarginTop
        dos3.layoutParams = dos3LayoutParams

        // Reset the top margin of dos4 to its initial value
        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams.topToBottom = R.id.dos3
        dos4LayoutParams.topMargin = dos4InitialMarginTop
        dos4.layoutParams = dos4LayoutParams

        // Reset the top margin of dos5 to its initial value
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dos4
        dos5LayoutParams.topMargin = dos5InitialMarginTop
        dos5.layoutParams = dos5LayoutParams

        // Reset the top margin of dos6 to its initial value
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dos5
        dos6LayoutParams.topMargin = dos6InitialMarginTop
        dos6.layoutParams = dos6LayoutParams
    }
    // Click event handler for dos4
    fun onDos4Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.INVISIBLE
        dosw4.visibility = View.VISIBLE
        dosc4.visibility = View.VISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE


        // Set the top margin of dos5 to be 10dp below dos4
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dosc4
        dos5LayoutParams.topMargin = dpToPx(10)
        dos5.layoutParams = dos5LayoutParams

        // Set the top margin of dos6 to be 10dp below dos5
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dos5
        dos6LayoutParams.topMargin = dpToPx(10)
        dos6.layoutParams = dos6LayoutParams
    }

    // Click event handler for dosw4
    fun onDosw4Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE

        // Reset the top margin of dos2 to its initial value
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams.topToBottom = R.id.dos1
        dos2LayoutParams.topMargin = dos2InitialMarginTop
        dos2.layoutParams = dos2LayoutParams

        // Reset the top margin of dos3 to its initial value
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dos2
        dos3LayoutParams.topMargin = dos3InitialMarginTop
        dos3.layoutParams = dos3LayoutParams

        // Reset the top margin of dos4 to its initial value
        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams.topToBottom = R.id.dos3
        dos4LayoutParams.topMargin = dos4InitialMarginTop
        dos4.layoutParams = dos4LayoutParams

        // Reset the top margin of dos5 to its initial value
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dos4
        dos5LayoutParams.topMargin = dos4InitialMarginTop
        dos5.layoutParams = dos5LayoutParams

        // Reset the top margin of dos6 to its initial value
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dos5
        dos6LayoutParams.topMargin = dos6InitialMarginTop
        dos6.layoutParams = dos6LayoutParams
    }

    // Click event handler for dos3
    fun onDos5Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.INVISIBLE
        dosw5.visibility = View.VISIBLE
        dosc5.visibility = View.VISIBLE
        dos6.visibility = View.VISIBLE



        // Set the top margin of dos6 to be 10dp below dos5
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dosc5
        dos6LayoutParams.topMargin = dpToPx(10)
        dos6.layoutParams = dos6LayoutParams
    }

    // Click event handler for dosw4
    fun onDosw5Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE

        // Reset the top margin of dos2 to its initial value
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams.topToBottom = R.id.dos1
        dos2LayoutParams.topMargin = dos2InitialMarginTop
        dos2.layoutParams = dos2LayoutParams

        // Reset the top margin of dos3 to its initial value
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dos2
        dos3LayoutParams.topMargin = dos3InitialMarginTop
        dos3.layoutParams = dos3LayoutParams

        // Reset the top margin of dos4 to its initial value
        val dos4LayoutParams = dos4.layoutParams as ConstraintLayout.LayoutParams
        dos4LayoutParams.topToBottom = R.id.dos3
        dos4LayoutParams.topMargin = dos4InitialMarginTop
        dos4.layoutParams = dos4LayoutParams

        // Reset the top margin of dos5 to its initial value
        val dos5LayoutParams = dos5.layoutParams as ConstraintLayout.LayoutParams
        dos5LayoutParams.topToBottom = R.id.dos4
        dos5LayoutParams.topMargin = dos4InitialMarginTop
        dos5.layoutParams = dos5LayoutParams

        // Reset the top margin of dos6 to its initial value
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dos5
        dos6LayoutParams.topMargin = dos6InitialMarginTop
        dos6.layoutParams = dos6LayoutParams
    }
    // Utility function to convert dp to pixels
    private fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density).toInt()
    }
}
