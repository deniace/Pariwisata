package com.deni.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.databinding.ActivityMainBinding
import com.deni.pariwisata.view.AboutActivity
import com.deni.pariwisata.view.MenuActivity

/**
 * Created by Deni Supriyatna (deni ace) on 22 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this
    }

    fun goToAbout(view: View) {
        var intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }

    fun goToMenu(view: View) {
        var intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
    fun exit(view: View) {
        finish()
    }
}
