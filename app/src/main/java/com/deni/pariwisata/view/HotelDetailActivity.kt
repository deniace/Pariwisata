package com.deni.pariwisata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityHotelDetailBinding
import kotlinx.android.synthetic.main.activity_wisata_detail.*

/**
 * Created by Deni Supriyatna (deni ace) on 26 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class HotelDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityHotelDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_hotel_detail)
        binding.activity = this

        var idHotel: Int = intent.getIntExtra("ID_HOTEL", 0)
        populateHotel(idHotel)

        toolbar.setNavigationOnClickListener { onNavigateUp() }
        toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_more -> {
                    Toast.makeText(this, R.string.more, Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

    private fun populateHotel(idHotel: Int) {
        when (idHotel) {
            R.id.hotel_1 -> {
                binding.toolbarLayout.title = resources.getString(R.string.hotel_1_judul)
                binding.ivDetailImageHotel.setImageResource(R.drawable.koma_junkyard_cafe)
                binding.tvDeskripsiHotel.text = resources.getString(R.string.hotel_1_deskripsi)
            }
            R.id.hotel_2 -> {
                binding.toolbarLayout.title = resources.getString(R.string.hotel_2_judul)
                binding.ivDetailImageHotel.setImageResource(R.drawable.hotel_2_image)
                binding.tvDeskripsiHotel.text = resources.getString(R.string.hotel_2_deskripsi)
            }
            R.id.hotel_3 -> {
                binding.toolbarLayout.title = resources.getString(R.string.hotel_3_judul)
                binding.ivDetailImageHotel.setImageResource(R.drawable.hotel_3_image)
                binding.tvDeskripsiHotel.text = resources.getString(R.string.hotel_3_deskripsi)
            }
            R.id.hotel_4 -> {
                binding.toolbarLayout.title = resources.getString(R.string.hotel_4_judul)
                binding.ivDetailImageHotel.setImageResource(R.drawable.hotel_4_image)
                binding.tvDeskripsiHotel.text = resources.getString(R.string.hotel_4_deskripsi)
            }
            R.id.hotel_5 -> {
                binding.toolbarLayout.title = resources.getString(R.string.hotel_5_judul)
                binding.ivDetailImageHotel.setImageResource(R.drawable.hotel_5_image)
                binding.tvDeskripsiHotel.text = resources.getString(R.string.hotel_5_deskripsi)
            }
            else -> false
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_detail, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_more -> {
            Toast.makeText(this, R.string.more, Toast.LENGTH_SHORT).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
