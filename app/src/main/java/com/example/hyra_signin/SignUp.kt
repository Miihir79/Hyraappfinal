package com.example.hyra_signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        button1.setOnClickListener{
            val intent2 = Intent(this,Homepage::class.java)
            startActivity(intent2)
        }
        imageButton.setOnClickListener{
            val intent1 = Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }
    }
}
