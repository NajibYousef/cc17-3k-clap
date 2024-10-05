package com.example.personalprofilepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton // Import ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etContact: EditText
    private lateinit var etAddress: EditText
    private lateinit var saveButton: Button
    private lateinit var changePasswordButton: Button
    private lateinit var deleteAccountButton: Button
    private lateinit var backButton: ImageButton // Change Button to ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Directly set the content view

        // Initialize the EditText fields and buttons using findViewById
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etContact = findViewById(R.id.etContact)
        etAddress = findViewById(R.id.etAddress)
        saveButton = findViewById(R.id.saveButton)
        changePasswordButton = findViewById(R.id.changePasswordButton)
        deleteAccountButton = findViewById(R.id.deleteAccountButton)
        backButton = findViewById(R.id.backButton) // No change needed here

        // Setting up button click listeners
        saveButton.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val contact = etContact.text.toString()
            val address = etAddress.text.toString()

            // Check if fields are not empty
            if (name.isNotEmpty() && email.isNotEmpty() && contact.isNotEmpty() && address.isNotEmpty()) {
                // Save logic (for now, we just show a message)
                Toast.makeText(this, "Profile saved!", Toast.LENGTH_SHORT).show()
            } else {
                // Show an error message if fields are empty
                Toast.makeText(this, "Please fill in all fields!", Toast.LENGTH_SHORT).show()
            }
        }

        changePasswordButton.setOnClickListener {
            // Logic for changing password can go here
            Toast.makeText(this, "Change Password clicked", Toast.LENGTH_SHORT).show()
        }

        deleteAccountButton.setOnClickListener {
            // Logic to delete account goes here
            Toast.makeText(this, "Delete Account clicked", Toast.LENGTH_SHORT).show()
        }

        backButton.setOnClickListener {
            finish() // Close the activity when back button is clicked
        }
    }
}
