package com.deni.pariwisata.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.deni.pariwisata.R

/**
 * Created by Deni Supriyatna (deni ace) on 26 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class MenuTownSquareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_town_square)
        title = getString(R.string.menu_town_square)
    }

    fun MenuTSClick(view: View) {
        var intent = Intent(this, HotelDetailActivity::class.java)
        var id = view.getId()
        intent.putExtra("ID_TS", id);
        startActivity(intent)
    }
}
