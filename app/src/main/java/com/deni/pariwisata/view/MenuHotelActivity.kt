package com.deni.pariwisata.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityMenuHotelBinding

/**
 * Created by Deni Supriyatna (deni ace) on 26 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class MenuHotelActivity : AppCompatActivity() {

    lateinit var binding: ActivityMenuHotelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_menu_hotel)
        title = getString(R.string.menu_hotel)
        binding.activity = this
    }

    fun MenuHotelClick(view: View) {
        var intent = Intent(this, HotelDetailActivity::class.java)
        var id = view.getId()
        intent.putExtra("ID_HOTEL", id);
        startActivity(intent)
    }
}
