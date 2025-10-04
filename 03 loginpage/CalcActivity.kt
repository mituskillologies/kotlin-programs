package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CalcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        // Find all view components by their IDs
        val num1EditText: EditText = findViewById(R.id.number1_edittext)
        val num2EditText: EditText = findViewById(R.id.number2_edittext)
        val resultTextView: TextView = findViewById(R.id.result_textview)

        val addButton: Button = findViewById(R.id.add_button)
        val subtractButton: Button = findViewById(R.id.subtract_button)
        val multiplyButton: Button = findViewById(R.id.multiply_button)
        val divideButton: Button = findViewById(R.id.divide_button)
        val backButton: Button = findViewById(R.id.back_button)

        // Set click listeners for operation buttons
        addButton.setOnClickListener { performOperation(num1EditText, num2EditText, resultTextView, '+') }
        subtractButton.setOnClickListener { performOperation(num1EditText, num2EditText, resultTextView, '-') }
        multiplyButton.setOnClickListener { performOperation(num1EditText, num2EditText, resultTextView, '*') }
        divideButton.setOnClickListener { performOperation(num1EditText, num2EditText, resultTextView, '/') }

        // Set click listener for the back button
        backButton.setOnClickListener {
            finish() // This closes the current activity and goes back to the previous one
        }
    }

    private fun performOperation(num1ET: EditText, num2ET: EditText, resultTV: TextView, operator: Char) {
        val num1Str = num1ET.text.toString()
        val num2Str = num2ET.text.toString()

        if (num1Str.isBlank() || num2Str.isBlank()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            return
        }

        val num1 = num1Str.toDouble()
        val num2 = num2Str.toDouble()
        var result: Double = 0.0

        when (operator) {
            '+' -> result = num1 + num2
            '-' -> result = num1 - num2
            '*' -> result = num1 * num2
            '/' -> {
                if (num2 == 0.0) {
                    Toast.makeText(this, "Error: Cannot divide by zero!", Toast.LENGTH_LONG).show()
                    return
                }
                result = num1 / num2
            }
        }

        // Display the result, formatting to two decimal places
        resultTV.text = "Result: ${"%.2f".format(result)}"
    }
}