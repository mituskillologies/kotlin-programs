package com.example.foodbill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Define a map to store the menu items and their prices
    private val menuItems = mapOf(
        R.id.checkbox_tea to 10,
        R.id.checkbox_vadapav to 15,
        R.id.checkbox_misal to 50,
        R.id.checkbox_coffee to 20,
        R.id.checkbox_pohe to 30
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the "Calculate Bill" button
        val calculateButton: Button = findViewById(R.id.calculate_button)

        // Set a click listener for the button
        calculateButton.setOnClickListener {
            calculateAndShowBill()
        }
    }

    private fun calculateAndShowBill() {
        var totalAmount = 0
        val selectedItems = mutableListOf<String>()

        // Find all checkboxes and check their state
        menuItems.forEach { (id, price) ->
            val checkbox = findViewById<CheckBox>(id)
            if (checkbox.isChecked) {
                totalAmount += price
                // Get the text from the checkbox and add to the list
                selectedItems.add(checkbox.text.toString())
            }
        }

        // Create an intent to start the next activity (BillActivity)
        val intent = Intent(this, BillActivity::class.java).apply {
            // Pass the selected items and total amount to the next activity
            putStringArrayListExtra("SELECTED_ITEMS", ArrayList(selectedItems))
            putExtra("TOTAL_AMOUNT", totalAmount)
        }
        startActivity(intent)
    }
}
