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
    private lateinit var dosw6: ImageView
    private lateinit var dosc6: ImageView
    private lateinit var dos7: ImageView
    private lateinit var dosw7: ImageView
    private lateinit var dosc7: ImageView
    private lateinit var dos8: ImageView
    private lateinit var dosw8: ImageView
    private lateinit var dosc8: ImageView
    private lateinit var dos9: ImageView

    private var dos2InitialMarginTop = 0
    private var dos3InitialMarginTop = 0
    private var dos4InitialMarginTop = 0
    private var dos5InitialMarginTop = 0
    private var dos6InitialMarginTop = 0
    private var dos7InitialMarginTop = 0
    private var dos8InitialMarginTop = 0
    private var dos9InitialMarginTop = 0

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
        dosw6 = findViewById(R.id.dosw6)
        dosc6= findViewById(R.id.dosc6)
        dos7 = findViewById(R.id.dos7)
        dosw7 = findViewById(R.id.dosw7)
        dosc7= findViewById(R.id.dosc7)
        dos8 = findViewById(R.id.dos8)
        dosw8 = findViewById(R.id.dosw8)
        dosc8= findViewById(R.id.dosc8)
        dos9 = findViewById(R.id.dos9)

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

        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7InitialMarginTop = dos7LayoutParams.topMargin

        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8InitialMarginTop = dos8LayoutParams.topMargin

        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9InitialMarginTop = dos9LayoutParams.topMargin

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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Set the top margin of dos7 to be 10dp below dos6
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dpToPx(10)
        dos7.layoutParams = dos7LayoutParams

        // Set the top margin of dos8 to be 10dp below dos7
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dpToPx(10)
        dos8.layoutParams = dos8LayoutParams

        // Set the top margin of dos9 to be 10dp below dos8
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dpToPx(10)
        dos9.layoutParams = dos9LayoutParams
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dos8InitialMarginTop
        dos8.layoutParams = dos8LayoutParams

        // Reset the top margin of dos9 to its initial value
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dos9InitialMarginTop
        dos9.layoutParams = dos9LayoutParams
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Set the top margin of dos7 to be 10dp below dos6
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dpToPx(10)
        dos7.layoutParams = dos7LayoutParams

        // Set the top margin of dos8 to be 10dp below dos7
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dpToPx(10)
        dos8.layoutParams = dos8LayoutParams

        // Set the top margin of dos9 to be 10dp below dos8
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dpToPx(10)
        dos9.layoutParams = dos9LayoutParams
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
        dosw3.visibility = View.INVISIBLE
        dosc3.visibility = View.INVISIBLE
        dos4.visibility = View.VISIBLE
        dosw4.visibility = View.INVISIBLE
        dosc4.visibility = View.INVISIBLE
        dos5.visibility = View.VISIBLE
        dosw5.visibility = View.INVISIBLE
        dosc5.visibility = View.INVISIBLE
        dos6.visibility = View.VISIBLE
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Reset the top margin of dos7 to its initial value
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        // Reset the top margin of dos8 to its initial value
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dos8InitialMarginTop
        dos8.layoutParams = dos8LayoutParams

        // Reset the top margin of dos9 to its initial value
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dos9InitialMarginTop
        dos9.layoutParams = dos9LayoutParams
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

        // Reset the top margin of dos2 to its initial value
        val dos2LayoutParams = dos2.layoutParams as ConstraintLayout.LayoutParams
        dos2LayoutParams.topToBottom = R.id.dos1
        dos2LayoutParams.topMargin = dos2InitialMarginTop
        dos2.layoutParams = dos2LayoutParams

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

        // Set the top margin of dos7 to be 10dp below dos6
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dpToPx(10)
        dos7.layoutParams = dos7LayoutParams

        // Set the top margin of dos8 to be 10dp below dos7
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dpToPx(10)
        dos8.layoutParams = dos8LayoutParams

        // Set the top margin of dos9 to be 10dp below dos8
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dpToPx(10)
        dos9.layoutParams = dos9LayoutParams
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Reset the top margin of dos7 to its initial value
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        // Reset the top margin of dos8 to its initial value
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dos8InitialMarginTop
        dos8.layoutParams = dos8LayoutParams

        // Reset the top margin of dos9 to its initial value
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dos9InitialMarginTop
        dos9.layoutParams = dos9LayoutParams

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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE


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

        // Set the top margin of dos7 to be 10dp below dos6
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dpToPx(10)
        dos7.layoutParams = dos7LayoutParams

        // Set the top margin of dos8 to be 10dp below dos7
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dpToPx(10)
        dos8.layoutParams = dos8LayoutParams

        // Set the top margin of dos9 to be 10dp below dos8
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dpToPx(10)
        dos9.layoutParams = dos9LayoutParams
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Reset the top margin of dos7 to its initial value
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        // Reset the top margin of dos8 to its initial value
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dos8InitialMarginTop
        dos8.layoutParams = dos8LayoutParams

        // Reset the top margin of dos9 to its initial value
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dos9InitialMarginTop
        dos9.layoutParams = dos9LayoutParams
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Set the top margin of dos6 to be 10dp below dos5
        val dos6LayoutParams = dos6.layoutParams as ConstraintLayout.LayoutParams
        dos6LayoutParams.topToBottom = R.id.dosc5
        dos6LayoutParams.topMargin = dpToPx(10)
        dos6.layoutParams = dos6LayoutParams

        // Set the top margin of dos7 to be 10dp below dos6
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dpToPx(10)
        dos7.layoutParams = dos7LayoutParams

        // Set the top margin of dos8 to be 10dp below dos7
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dpToPx(10)
        dos8.layoutParams = dos8LayoutParams

        // Set the top margin of dos9 to be 10dp below dos8
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dpToPx(10)
        dos9.layoutParams = dos9LayoutParams
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Reset the top margin of dos7 to its initial value
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        // Reset the top margin of dos8 to its initial value
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dos8InitialMarginTop
        dos8.layoutParams = dos8LayoutParams

        // Reset the top margin of dos9 to its initial value
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dos9InitialMarginTop
        dos9.layoutParams = dos9LayoutParams
    }

    // Click event handler for dos6
    fun onDos6Click(view: View) {
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
        dos6.visibility = View.INVISIBLE
        dosw6.visibility = View.VISIBLE
        dosc6.visibility = View.VISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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



        // Set the top margin of dos7 to be 10dp below dos6
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dosc6
        dos7LayoutParams.topMargin = dpToPx(10)
        dos7.layoutParams = dos7LayoutParams

        // Set the top margin of dos8 to be 10dp below dos7
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dpToPx(10)
        dos8.layoutParams = dos8LayoutParams

        // Set the top margin of dos9 to be 10dp below dos8
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dpToPx(10)
        dos9.layoutParams = dos9LayoutParams
    }

    // Click event handler for dosw6
    fun onDosw6Click(view: View) {
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Reset the top margin of dos7 to its initial value
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        // Reset the top margin of dos8 to its initial value
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dos8InitialMarginTop
        dos8.layoutParams = dos8LayoutParams

        // Reset the top margin of dos9 to its initial value
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dos9InitialMarginTop
        dos9.layoutParams = dos9LayoutParams
    }
    // Click event handler for dos7
    fun onDos7Click(view: View) {
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.INVISIBLE
        dosw7.visibility = View.VISIBLE
        dosc7.visibility = View.VISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Set the top margin of dos8 to be 10dp below dos7
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dosc7
        dos8LayoutParams.topMargin = dpToPx(10)
        dos8.layoutParams = dos8LayoutParams

        // Set the top margin of dos9 to be 10dp below dos8
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dpToPx(10)
        dos9.layoutParams = dos9LayoutParams
    }

    // Click event handler for dosw7
    fun onDosw7Click(view: View) {
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Reset the top margin of dos7 to its initial value
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        // Reset the top margin of dos8 to its initial value
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dos8InitialMarginTop
        dos8.layoutParams = dos8LayoutParams

        // Reset the top margin of dos9 to its initial value
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dos9InitialMarginTop
        dos9.layoutParams = dos9LayoutParams
    }

    // Click event handler for dos8
    fun onDos8Click(view: View) {
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.INVISIBLE
        dosw8.visibility = View.VISIBLE
        dosc8.visibility = View.VISIBLE
        dos9.visibility = View.VISIBLE

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

        // Reset the top margin of dos7 to its initial value
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        // Set the top margin of dos9 to be 10dp below dos8
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dosc8
        dos9LayoutParams.topMargin = dpToPx(10)
        dos9.layoutParams = dos9LayoutParams
    }

    // Click event handler for dosw7
    fun onDosw8Click(view: View) {
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
        dosw6.visibility = View.INVISIBLE
        dosc6.visibility = View.INVISIBLE
        dos7.visibility = View.VISIBLE
        dosw7.visibility = View.INVISIBLE
        dosc7.visibility = View.INVISIBLE
        dos8.visibility = View.VISIBLE
        dosw8.visibility = View.INVISIBLE
        dosc8.visibility = View.INVISIBLE
        dos9.visibility = View.VISIBLE

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

        // Reset the top margin of dos7 to its initial value
        val dos7LayoutParams = dos7.layoutParams as ConstraintLayout.LayoutParams
        dos7LayoutParams.topToBottom = R.id.dos6
        dos7LayoutParams.topMargin = dos7InitialMarginTop
        dos7.layoutParams = dos7LayoutParams

        // Reset the top margin of dos8 to its initial value
        val dos8LayoutParams = dos8.layoutParams as ConstraintLayout.LayoutParams
        dos8LayoutParams.topToBottom = R.id.dos7
        dos8LayoutParams.topMargin = dos8InitialMarginTop
        dos8.layoutParams = dos8LayoutParams

        // Reset the top margin of dos9 to its initial value
        val dos9LayoutParams = dos9.layoutParams as ConstraintLayout.LayoutParams
        dos9LayoutParams.topToBottom = R.id.dos8
        dos9LayoutParams.topMargin = dos9InitialMarginTop
        dos9.layoutParams = dos9LayoutParams
    }
    // Utility function to convert dp to pixels
    private fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density).toInt()
    }
}
