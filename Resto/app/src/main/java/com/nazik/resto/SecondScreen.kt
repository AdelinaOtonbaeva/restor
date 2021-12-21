package com.nazik.resto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        val imageView = findViewById<ImageView>(R.id.back)

        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            val button = findViewById<Button>(R.id.button4)

            button.setOnClickListener {
                startActivity(Intent(this, ThirdScreen::class.java))
            }
        }
    }
}