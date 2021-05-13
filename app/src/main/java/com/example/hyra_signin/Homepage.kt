package com.example.hyra_signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_homepage.*

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        supportActionBar?.hide()
        imageButton24.setOnClickListener {
            val intent2 = Intent(this, Callofduty::class.java)
            startActivity(intent2)
        }
        imageButton37.setOnClickListener {
            val intent3 = Intent(this,Navigationdrawer::class.java)
            startActivity(intent3)
        }




    }
}