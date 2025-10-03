package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (savedInstanceState == null) {
            // Create a new Fragment to be placed in the activity layout
            val simpleFragment = SimpleFragment()

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            simpleFragment.arguments = intent.extras

            // Add the fragment to the 'fragment_container' FrameLayout
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, simpleFragment).commit()
        }
    }
}