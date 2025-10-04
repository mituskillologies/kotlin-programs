package com.example.loginpage
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // Find the login button from the layout by its ID
        val loginButton: Button = findViewById(R.id.login_button)
        // Set a listener to execute code when the button is clicked
        loginButton.setOnClickListener {
            // This is where the magic happens!
            launchCalculator()
        }
    }
    private fun launchCalculator() {
        // Create an intent to launch the calculator app.
        // CATEGORY_APP_CALCULATOR is a generic way to find any calculator app.
        val intent = Intent()
        intent.action = Intent.ACTION_MAIN
        intent.addCategory(Intent.CATEGORY_APP_CALCULATOR)

        try {
            // Attempt to start the activity that matches the intent
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // If no calculator app is found, show an error message to the user.
            Toast.makeText(this, "No Calculator App Found", Toast.LENGTH_SHORT).show()
        }
    }
}