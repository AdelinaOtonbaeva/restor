package com.nazik.resto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraint)

        constraintLayout.setOnClickListener {
            startActivity(Intent(this, SecondScreen::class.java))
            val button = findViewById<Button>(R.id.map)
            button.setOnClickListener {
                startActivity(Intent(this, FifthScreen::class.java))
            }
        }
    }
}