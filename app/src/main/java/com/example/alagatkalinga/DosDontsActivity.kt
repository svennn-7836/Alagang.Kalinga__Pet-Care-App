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
    private lateinit var dos5: ImageView
    private lateinit var dos6: ImageView
    private lateinit var dos7: ImageView
    private lateinit var dos8: ImageView
    private lateinit var dos9: ImageView
    private lateinit var dos10: ImageView
    private lateinit var dos11: ImageView
    private lateinit var dos12: ImageView
    private lateinit var dos13: ImageView
    private lateinit var dos14: ImageView
    private lateinit var dontstitle: ImageView
    private lateinit var donts1: ImageView
    private lateinit var donts2: ImageView
    private lateinit var donts3: ImageView

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
        dos5 = findViewById(R.id.dos5)
        dos6 = findViewById(R.id.dos6)
        dos7 = findViewById(R.id.dos7)
        dos8 = findViewById(R.id.dos8)
        dos9 = findViewById(R.id.dos9)
        dos10 = findViewById(R.id.dos10)
        dos11 = findViewById(R.id.dos11)
        dos12 = findViewById(R.id.dos12)
        dos13 = findViewById(R.id.dos13)
        dos14 = findViewById(R.id.dos14)
        dontstitle = findViewById(R.id.dontstitle)
        donts1 = findViewById(R.id.donts1)
        donts2 = findViewById(R.id.donts2)
        donts3 = findViewById(R.id.donts3)

        dos1.setOnClickListener {
            dos1.visibility = View.INVISIBLE
            dosw1.visibility = View.VISIBLE
            dosc1.visibility = View.VISIBLE

            // Adjust the position of dosw1
            val layoutParams = dosw1.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.topToBottom = dosc1.id
            dosw1.layoutParams = layoutParams

            // Move dos2 to dos14 to the desired position
            for (i in 2..14) {
                val dosView = findViewById<ImageView>(resources.getIdentifier("dos$i", "id", packageName))
                val dosLayoutParams = dosView.layoutParams as ConstraintLayout.LayoutParams
                dosLayoutParams.topToBottom = dosc1.id
                dosLayoutParams.topMargin = resources.getDimensionPixelOffset(resources.getIdentifier("dos${i}_margin_top", "dimen", packageName))
                dosView.layoutParams = dosLayoutParams
            }

            // Move dontstitle to the desired position
            val dontstitleLayoutParams = dontstitle.layoutParams as ConstraintLayout.LayoutParams
            dontstitleLayoutParams.topToBottom = dos14.id
            dontstitleLayoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.dontstitle_margin_top)
            dontstitle.layoutParams = dontstitleLayoutParams

            // Move donts1 to donts3 to the desired position
            for (i in 1..3) {
                val dontsView = findViewById<ImageView>(resources.getIdentifier("donts$i", "id", packageName))
                val dontsLayoutParams = dontsView.layoutParams as ConstraintLayout.LayoutParams
                dontsLayoutParams.topToBottom = dontstitle.id
                dontsLayoutParams.topMargin = resources.getDimensionPixelOffset(resources.getIdentifier("donts${i}_margin_top", "dimen", packageName))
                dontsView.layoutParams = dontsLayoutParams
            }
        }

        dosw1.setOnClickListener {
            dos1.visibility = View.VISIBLE
            dosw1.visibility = View.INVISIBLE
            dosc1.visibility = View.INVISIBLE

            // Reset the position of dosw1
            val layoutParams = dosw1.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
            dosw1.layoutParams = layoutParams

            // Reset the position of dos2 to dos14
            for (i in 2..14) {
                val dosView = findViewById<ImageView>(resources.getIdentifier("dos$i", "id", packageName))
                val dosLayoutParams = dosView.layoutParams as ConstraintLayout.LayoutParams
                dosLayoutParams.topToBottom = dos1.id
                dosLayoutParams.topMargin = resources.getDimensionPixelOffset(resources.getIdentifier("dos${i}_initial_margin_top", "dimen", packageName))
                dosView.layoutParams = dosLayoutParams
            }

            // Reset the position of dontstitle
            val dontstitleLayoutParams = dontstitle.layoutParams as ConstraintLayout.LayoutParams
            dontstitleLayoutParams.topToBottom = dos14.id
            dontstitleLayoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.dontstitle_initial_margin_top)
            dontstitle.layoutParams = dontstitleLayoutParams

            // Reset the position of donts1 to donts3
            for (i in 1..3) {
                val dontsView = findViewById<ImageView>(resources.getIdentifier("donts$i", "id", packageName))
                val dontsLayoutParams = dontsView.layoutParams as ConstraintLayout.LayoutParams
                dontsLayoutParams.topToBottom = dontstitle.id
                dontsLayoutParams.topMargin = resources.getDimensionPixelOffset(resources.getIdentifier("donts${i}_initial_margin_top", "dimen", packageName))
                dontsView.layoutParams = dontsLayoutParams
            }
        }
    }
}
