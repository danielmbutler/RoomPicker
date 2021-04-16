package com.dbtechprojects.meetingRoomApp.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.dbtechprojects.meetingRoomApp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler().postDelayed(
                {

                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()
                },
                2500
        ) // Here we pass the delay time in milliSeconds after which the splash activity will disappear.

    }
}