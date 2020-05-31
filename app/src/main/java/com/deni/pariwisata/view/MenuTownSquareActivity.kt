package com.deni.pariwisata.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityMenuTownSquareBinding

/**
 * Created by Deni Supriyatna (deni ace) on 26 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class MenuTownSquareActivity : AppCompatActivity() {

    lateinit var binding: ActivityMenuTownSquareBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_menu_town_square)
        binding.activity = this
        title = getString(R.string.menu_town_square)
    }

    fun MenuTSClick(view: View) {
        var intent = Intent(this, TownSquareDetailActivity::class.java)
        var id = view.getId()
        intent.putExtra("ID_TS", id);
        startActivity(intent)
    }
}
