package com.example.cinesun.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.cinesun.R
import com.example.cinesun.ui.home.HomeActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        lifecycleScope.launch {
            delay(DELAY)
            startActivity(
                Intent(
                    this@SplashScreen,
                    HomeActivity::class.java
                )
            )
            finish()
        }
    }

    companion object {
        private const val DELAY = 1500L
    }
}