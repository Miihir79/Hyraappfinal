package com.example.hyra_signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.TextView

class jedi : AppCompatActivity() {
    lateinit var option: Spinner
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jedi)
        supportActionBar?.hide()
    }
}