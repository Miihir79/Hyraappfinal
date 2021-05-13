package com.example.hyra_signin

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_collectons.*

class collectons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collectons)
        supportActionBar?.hide()

        imageButton52.setOnClickListener{
            val intent= Intent(this,Navigationdrawer::class.java)
            startActivity(intent)
        }

        val appSettingPrefs:SharedPreferences = getSharedPreferences("AppSettingPrefs",0)
        val isNightModeOn: Boolean = appSettingPrefs.getBoolean("NightMode",false)
        val shareprefsEdit :SharedPreferences.Editor=appSettingPrefs.edit()
        if(isNightModeOn){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        button10.setOnClickListener{
            if(isNightModeOn) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                shareprefsEdit.putBoolean("NightMode",false)
                shareprefsEdit.apply()
            }
            else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    shareprefsEdit.putBoolean("NightMode",true)
                    shareprefsEdit.apply()
                }

        }
    }
}