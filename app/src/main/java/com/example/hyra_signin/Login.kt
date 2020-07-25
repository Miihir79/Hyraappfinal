package com.example.hyra_signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()
        login.setOnClickListener{
            val intent2 = Intent(this,Main::class.java)
            startActivity(intent2)
        }
        imageButton4.setOnClickListener{
            val intent1 = Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }
    }
}