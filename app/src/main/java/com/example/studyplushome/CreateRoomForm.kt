package com.example.studyplushome

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreateRoomForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_room_form)

        val closeButton: ImageButton = findViewById(R.id.closeButton)

        closeButton.setOnClickListener {
            startActivity(Intent(this@CreateRoomForm, HomePageFragment::class.java))
        }
    }
}