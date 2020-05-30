package com.deni.pariwisata.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityMenuBinding

/**
 * Created by Deni Supriyatna (deni ace) on 22 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class MenuActivity : AppCompatActivity() {

    lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_menu)
        binding.activity = this
        title = resources.getString(R.string.wisata_kota_bekasi)
    }

    public fun goToMenuRestoran(view:View){
        // intent ke activity menu restaurant
        val intent = Intent(this, MenuRestoranActivity::class.java)
        startActivity(intent)
    }

    public fun goToMenuPariwisata(view:View){
        // intent ke activity menu pariwisasta
        val intent = Intent(this, MenuWisataActivity::class.java)
        startActivity(intent)
    }

    public fun goToMenuHotel(view:View){
        // intent ke activity menu pariwisasta
        val intent = Intent(this, MenuHotelActivity::class.java)
        startActivity(intent)
    }

    public fun goToMenuTownSquare(view:View){
        // intent ke activity menu pariwisasta
        val intent = Intent(this, MenuTownSquareActivity::class.java)
        startActivity(intent)
    }

    public fun goToMenuProfile(view:View){
        // intent ke activity menu pariwisasta
        val intent = Intent(this, ProfileBekasiActivity::class.java)
        startActivity(intent)
    }

}
