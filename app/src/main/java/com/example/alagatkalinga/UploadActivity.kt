package com.example.alagatkalinga

import com.example.alagatkalinga.DataClass
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import com.example.alagatkalinga.databinding.ActivityUploadBinding
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import java.net.URI
import java.text.DateFormat
import java.util.Calendar
class UploadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUploadBinding
    var imageURL: String? = null
    var uri: Uri? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val activityResultLauncher = registerForActivityResult<Intent, ActivityResult>(
            ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                val data = result.data
                uri = data!!.data
                binding.uploadImage.setImageURI(uri)
            } else {
                Toast.makeText(this@UploadActivity, "No Image Selected", Toast.LENGTH_SHORT).show()
            }
        }
        binding.uploadImage.setOnClickListener {
            val photoPicker = Intent(Intent.ACTION_PICK)
            photoPicker.type = "image/*"
            activityResultLauncher.launch(photoPicker)
        }
        binding.saveButton.setOnClickListener {
            saveData()
        }
    }
    private fun saveData() {
        val storageReference = FirebaseStorage.getInstance().reference.child("Task Images")
            .child(uri!!.lastPathSegment!!)
        val builder = AlertDialog.Builder(this@UploadActivity)
        builder.setCancelable(false)
        builder.setView(R.layout.progress_layout)
        val dialog = builder.create()
        dialog.show()
        storageReference.putFile(uri!!).addOnSuccessListener { taskSnapshot ->
            val uriTask = taskSnapshot.storage.downloadUrl
            while (!uriTask.isComplete);
            val urlImage = uriTask.result
            imageURL = urlImage.toString()
            uploadData()
            dialog.dismiss()
        }.addOnFailureListener {
            dialog.dismiss()
        }
    }
    private fun uploadData() {
        val title = binding.uploadTitle.text.toString()
        val desc = binding.uploadDesc.text.toString()
        val priority = binding.uploadPriority.text.toString()
        val currentDate = DateFormat.getDateTimeInstance().format(Calendar.getInstance().time)
        val petage = binding.uploadPetAge.text.toString()
        val petgender = binding.uploadPetGender.text.toString()
        val petallergies = binding.uploadPetAllergies.text.toString()
        val vaccination = binding.uploadVaccination.text.toString()
        val neutered = binding.uploadNeutered.text.toString()
        val ownername = binding.uploadOwnerName.text.toString()
        val owneraddress = binding.uploadOwnerAddress.text.toString()
        val ownernumber = binding.uploadOwnerNumber.text.toString()
        val vetname = binding.uploadVetName.text.toString()
        val vetaddress = binding.uploadVetAddress.text.toString()
        val vetnumber = binding.uploadVetNumber.text.toString()


        // Create a new DataClass instance and set the date key
        val dataClass = DataClass(title, desc, priority, imageURL, currentDate, petage, petgender, petallergies, vaccination,
            neutered, ownername, owneraddress, ownernumber, vetname, vetaddress, vetnumber)

        FirebaseDatabase.getInstance().getReference("Todo List").child(currentDate)
            .setValue(dataClass).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this@UploadActivity, "Saved", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }.addOnFailureListener { e ->
                Toast.makeText(
                    this@UploadActivity, e.message.toString(), Toast.LENGTH_SHORT).show()
            }
    }
}

