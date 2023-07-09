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

    private var dos2InitialMarginTop = 0
    private var dos3InitialMarginTop = 0

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

        // Store the initial top margin values
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2InitialMarginTop = dos2LayoutParams.topMargin

        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3InitialMarginTop = dos3LayoutParams.topMargin

        // Set initial visibility
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE
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

        // Set the top margin of dos2 to be 44dp below dosc1
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams.topToBottom = R.id.dosc1
        dos2LayoutParams.topMargin = dpToPx(10)
        dos2.layoutParams = dos2LayoutParams

        // Set the top margin of dos3 to be 44dp below dos2
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dos2
        dos3LayoutParams.topMargin = dpToPx(10)
        dos3.layoutParams = dos3LayoutParams
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

        // Set the top margin of dos3 to be 44dp below dosc2
        val dos3LayoutParams = dos3.layoutParams as ConstraintLayout.LayoutParams
        dos3LayoutParams.topToBottom = R.id.dosc2
        dos3LayoutParams.topMargin = dpToPx(10)
        dos3.layoutParams = dos3LayoutParams
    }

    // Click event handler for dosw2
    fun onDosw2Click(view: View) {
        dos1.visibility = View.VISIBLE
        dosw1.visibility = View.INVISIBLE
        dosc1.visibility = View.INVISIBLE
        dosw2.visibility = View.INVISIBLE
        dosc2.visibility = View.INVISIBLE
        dos2.visibility = View.VISIBLE
        dos3.visibility = View.VISIBLE

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
    }

    // Utility function to convert dp to pixels
    private fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density).toInt()
    }
}
