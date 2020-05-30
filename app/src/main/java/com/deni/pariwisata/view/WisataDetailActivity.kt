package com.deni.pariwisata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityWisataDetailBinding
import kotlinx.android.synthetic.main.activity_wisata_detail.*

/**
 * Created by Deni Supriyatna (deni ace) on 25 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class WisataDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityWisataDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_wisata_detail)
        binding.activity = this
        var idWisata: Int = intent.getIntExtra("ID_WISATA", 0)
        populateWisata(idWisata)

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


    private fun populateWisata(idWisata: Int) {
        when (idWisata) {
            R.id.wisata_1 -> {
                binding.toolbarLayout.title = resources.getString(R.string.wisata_1_judul)
                binding.ivDetailImageWisata.setImageResource(R.drawable.curug_parigi)
                binding.tvDeskripsiWisata.text = resources.getString(R.string.wisata_1_deskripsi)
            }
            R.id.wisata_2 -> {
                binding.toolbarLayout.title = resources.getString(R.string.wisata_2_judul)
                binding.ivDetailImageWisata.setImageResource(R.drawable.wisata_2_image)
                binding.tvDeskripsiWisata.text = resources.getString(R.string.wisata_2_deskripsi)
            }
            R.id.wisata_3 -> {
                binding.toolbarLayout.title = resources.getString(R.string.wisata_3_judul)
                binding.ivDetailImageWisata.setImageResource(R.drawable.wisata_3_image)
                binding.tvDeskripsiWisata.text = resources.getString(R.string.wisata_3_deskripsi)
            }
            R.id.wisata_4 -> {
                binding.toolbarLayout.title = resources.getString(R.string.wisata_4_judul)
                binding.ivDetailImageWisata.setImageResource(R.drawable.wisata_4_image)
                binding.tvDeskripsiWisata.text = resources.getString(R.string.wisata_4_deskripsi)
            }
            R.id.wisata_5 -> {
                binding.toolbarLayout.title = resources.getString(R.string.wisata_5_judul)
                binding.ivDetailImageWisata.setImageResource(R.drawable.wisata_5_image)
                binding.tvDeskripsiWisata.text = resources.getString(R.string.wisata_5_deskripsi)
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
