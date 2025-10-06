package com.example.foodbill

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)

        // Find views on this screen
        val selectedItemsTextView: TextView = findViewById(R.id.selected_items_text_view)
        val totalAmountTextView: TextView = findViewById(R.id.total_amount_text_view)
        val backButton: Button = findViewById(R.id.back_button)

        // Get the data from the intent
        val selectedItems = intent.getStringArrayListExtra("SELECTED_ITEMS")
        val totalAmount = intent.getIntExtra("TOTAL_AMOUNT", 0)

        // Display the selected items
        val itemsText = selectedItems?.joinToString("\n") ?: "No items selected"
        selectedItemsTextView.text = "Selected Items:\n$itemsText"

        // Display the total amount
        totalAmountTextView.text = "Total Bill: Rs. $totalAmount"

        // Set a click listener for the back button to close this activity
        backButton.setOnClickListener {
            finish()
        }
    }
}
