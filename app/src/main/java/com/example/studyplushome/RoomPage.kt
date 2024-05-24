package com.example.studyplushome

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class RoomPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_page)

        val roomButton: ImageButton = findViewById(R.id.roomButton)
        val chatButton: ImageButton = findViewById(R.id.chatButton)

        roomButton.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.navigationBarLayout2, RoomPageFragment())
                setReorderingAllowed(true)
                addToBackStack("room")
            }
        }

        chatButton.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.navigationBarLayout2, ChatPageFragment())
                setReorderingAllowed(true)
                addToBackStack("chat")
            }
        }
    }
}