package com.deni.pariwisata.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityMenuRestoranBinding

/**
 * Created by Deni Supriyatna (deni ace) on 26 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class MenuRestoranActivity : AppCompatActivity() {

    lateinit var binding: ActivityMenuRestoranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_menu_restoran)
        binding.activity = this
        title = getString(R.string.menu_restoran)
    }

    fun MenuRestoranClick(view: View) {
        var intent = Intent(this, RestoranDetailActivity::class.java)
        var id = view.getId()
        intent.putExtra("ID_RESTORAN", id);
        startActivity(intent)
    }
}
