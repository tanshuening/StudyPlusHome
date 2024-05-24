package com.example.studyplushome

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeButton: ImageButton = findViewById(R.id.homeButton)
        val sessionButton: ImageButton = findViewById(R.id.sessionButton)
        val profileButton: ImageButton = findViewById(R.id.profileButton)

        homeButton.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.navigationBarLayout, HomePageFragment())
                setReorderingAllowed(true)
                addToBackStack("home")
            }
        }

        sessionButton.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.navigationBarLayout, SessionPageFragment())
                setReorderingAllowed(true)
                addToBackStack("session")
            }
        }

        profileButton.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.navigationBarLayout, ProfilePageFragment())
                setReorderingAllowed(true)
                addToBackStack("profile")
            }
        }
    }
}
