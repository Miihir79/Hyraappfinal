package com.example.hyra_signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        supportActionBar?.hide()
    }
}