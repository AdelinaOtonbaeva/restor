package com.nazik.resto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_screen)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            startActivity(Intent(this, FourthScreen::class.java))

        }
    }
}