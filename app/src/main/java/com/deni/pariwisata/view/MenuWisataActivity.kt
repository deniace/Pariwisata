package com.deni.pariwisata.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityMenuWisataBinding

/**
 * Created by Deni Supriyatna (deni ace) on 22 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class MenuWisataActivity : AppCompatActivity() {

    lateinit var binding: ActivityMenuWisataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_menu_wisata)
        binding.activity = this
        title = getString(R.string.menu_wisata)
    }

    fun MenuWisataClick(view: View) {
        var intent = Intent(this, WisataDetailActivity::class.java)
        var id = view.getId()
        intent.putExtra("ID_WISATA", id);
        startActivity(intent)
    }
}
