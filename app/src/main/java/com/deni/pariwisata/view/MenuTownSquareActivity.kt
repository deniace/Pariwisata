package com.deni.pariwisata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
}
