package com.deni.pariwisata.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.deni.pariwisata.MainActivity
import com.deni.pariwisata.R

/**
 * Created by Deni Supriyatna (deni ace) on 22 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class SplashActivity : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }
}
