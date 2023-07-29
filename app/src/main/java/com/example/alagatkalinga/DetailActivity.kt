package com.example.alagatkalinga

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.alagatkalinga.databinding.ActivityDetailBinding
import com.google.firebase.database.FirebaseDatabase

class DetailActivity : AppCompatActivity() {
    var imageUrl = ""
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        if (bundle != null) {

            binding.detailDesc.text = bundle.getString("Description")
            binding.detailTitle.text = bundle.getString("Title")
            binding.detailPriority.text = bundle.getString("Priority")
            imageUrl = bundle.getString("Image")!!
            Glide.with(this).load(bundle.getString("Image"))
                .into(binding.detailImage)

            // Display the new pet info data
            binding.detailPetAge.text = bundle.getString("PetAge")
            binding.detailPetGender.text = bundle.getString("PetGender")
            binding.detailPetAllergies.text = bundle.getString("PetAllergies")
            binding.detailVaccination.text = bundle.getString("Vaccination")
            binding.detailNeutered.text = bundle.getString("Neutered")

            // Display the new owner info data
            binding.detailOwnerName.text = bundle.getString("OwnerName")
            binding.detailOwnerAddress.text = bundle.getString("OwnerAddress")
            binding.detailOwnerNumber.text = bundle.getString("OwnerNumber")

            // Display the new vet info data
            binding.detailVetName.text = bundle.getString("VetName")
            binding.detailVetAddress.text = bundle.getString("VetAddress")
            binding.detailVetNumber.text = bundle.getString("VetNumber")

        } else {
            // If no extras found, finish the activity or handle the error case.
            finish()
            return
        }

        binding.deleteButton.setOnClickListener {
            showDeleteConfirmationDialog()
        }


    }

    private fun showDeleteConfirmationDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Delete Task")
        builder.setMessage("Are you sure you want to delete this task?")
        builder.setPositiveButton("Yes") { _, _ ->
            deleteTaskFromFirebase()
        }
        builder.setNegativeButton("No") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    private fun deleteTaskFromFirebase() {
        val currentDate = intent.extras?.getString("Date") ?: ""
        if (currentDate.isNotEmpty()) {
            val databaseReference = FirebaseDatabase.getInstance().getReference("Todo List").child(currentDate)
            databaseReference.removeValue()
                .addOnSuccessListener {
                    Toast.makeText(this, "Task deleted successfully", Toast.LENGTH_SHORT).show()
                    finish()
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Failed to delete task", Toast.LENGTH_SHORT).show()
                }
        } else {
            Toast.makeText(this, "Invalid task data", Toast.LENGTH_SHORT).show()
        }
    }
}