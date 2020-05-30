package com.deni.pariwisata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityRestoranDetailBinding
import kotlinx.android.synthetic.main.activity_wisata_detail.*

/**
 * Created by Deni Supriyatna (deni ace) on 26 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */
class RestoranDetailActivity : AppCompatActivity() {
    
    lateinit var binding: ActivityRestoranDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_restoran_detail)
        binding.activity = this

        var idRestoran: Int = intent.getIntExtra("ID_RESTORAN", 0)
        populateRestoran(idRestoran)

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

    private fun populateRestoran(idRestoran: Int) {
        when (idRestoran) {
            R.id.restoran_1 -> {
                binding.toolbarLayout.title = resources.getString(R.string.restoran_1_judul)
                binding.ivDetailImageRestoran.setImageResource(R.drawable.koma_junkyard_cafe)
                binding.tvDeskripsiRestoran.text = resources.getString(R.string.restoran_1_deskripsi)
            }
            R.id.restoran_2 -> {
                binding.toolbarLayout.title = resources.getString(R.string.restoran_2_judul)
                binding.ivDetailImageRestoran.setImageResource(R.drawable.restoran_2_image)
                binding.tvDeskripsiRestoran.text = resources.getString(R.string.restoran_2_deskripsi)
            }
            R.id.restoran_3 -> {
                binding.toolbarLayout.title = resources.getString(R.string.restoran_3_judul)
                binding.ivDetailImageRestoran.setImageResource(R.drawable.restoran_3_image)
                binding.tvDeskripsiRestoran.text = resources.getString(R.string.restoran_3_deskripsi)
            }
            R.id.restoran_4 -> {
                binding.toolbarLayout.title = resources.getString(R.string.restoran_4_judul)
                binding.ivDetailImageRestoran.setImageResource(R.drawable.restoran_4_image)
                binding.tvDeskripsiRestoran.text = resources.getString(R.string.restoran_4_deskripsi)
            }
            R.id.restoran_5 -> {
                binding.toolbarLayout.title = resources.getString(R.string.restoran_5_judul)
                binding.ivDetailImageRestoran.setImageResource(R.drawable.restoran_5_image)
                binding.tvDeskripsiRestoran.text = resources.getString(R.string.restoran_5_deskripsi)
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
