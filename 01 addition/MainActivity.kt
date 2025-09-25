package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the UI elements
        val firstNumberInput = findViewById<EditText>(R.id.firstNumberInput)
        val secondNumberInput = findViewById<EditText>(R.id.secondNumberInput)
        val addButton = findViewById<Button>(R.id.addButton)
        val resultLabel = findViewById<TextView>(R.id.resultLabel)

        // Set a click listener on the button
        addButton.setOnClickListener {
            // Get the text from the EditText field
            val number1String = firstNumberInput.text.toString()
            val number2String = secondNumberInput.text.toString()

            // Check if the input fields are not empty
            if (number1String.isNotEmpty() && number2String.isNotEmpty()) {
                try {
                    // Convert the strings to integers and perform addition
                    val number1 = number1String.toInt()
                    val number2 = number2String.toInt()
                    val sum = number1 + number2

                    // Display the result
                    resultLabel.text = "Result: $sum"
                } catch (e: NumberFormatException) {
                    // Handle case where input is not a valid number
                    resultLabel.text = "Error: Invalid number format"
                }
            } else {
                // Show an error if a field is empty
                resultLabel.text = "Please enter both numbers"
            }
        }
    }
}