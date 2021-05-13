package com.example.hyra_signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_navigationdrawer.*

class Navigationdrawer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigationdrawer)
        supportActionBar?.hide()
        imageButton54.setOnClickListener{
            val intant=Intent(this,Homepage::class.java)
            startActivity(intant)
        }
        imageButton48.setOnClickListener{
            val intent= Intent( this,collectons::class.java)
            startActivity(intent)
        }
    }
}