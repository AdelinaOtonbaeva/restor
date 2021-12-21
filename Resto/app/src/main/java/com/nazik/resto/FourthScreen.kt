package com.nazik.resto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FourthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_screen)
        val imageView = findViewById<ImageView>(R.id.back1)

        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
    }
}}