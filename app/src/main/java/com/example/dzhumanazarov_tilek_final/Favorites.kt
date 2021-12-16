package com.example.dzhumanazarov_tilek_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Favorites : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)

        val textView = findViewById<TextView>(R.id.back)

        textView.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}