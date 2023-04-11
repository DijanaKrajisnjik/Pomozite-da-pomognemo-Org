package com.example.pomozitedapomognemo_organizacija

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        //splashScreen.setKeepOnScreenCondition{true}
        setContentView(R.layout.activity_main)
    }
}