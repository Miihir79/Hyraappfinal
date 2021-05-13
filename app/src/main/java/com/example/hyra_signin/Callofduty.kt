package com.example.hyra_signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_callofduty.*

class Callofduty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_callofduty)
        supportActionBar?.hide()
        imageButton43.setOnClickListener{
            val intent2 = Intent(this,Homepage::class.java)
            startActivity(intent2)
        }
        imageButton32.setOnClickListener{
            val intent = Intent(this,jedi::class.java)
            startActivity(intent)
        }
    }
}