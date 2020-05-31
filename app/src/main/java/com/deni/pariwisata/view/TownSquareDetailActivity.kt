package com.deni.pariwisata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityTownSquareDetailBinding
import kotlinx.android.synthetic.main.activity_wisata_detail.*

/**
 * Created by Deni Supriyatna (deni ace) on 26 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class TownSquareDetailActivity : AppCompatActivity() {

    // TODO: Blum tampil
    lateinit var binding: ActivityTownSquareDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_town_square_detail)
        binding.activity = this

        var idTS: Int = intent.getIntExtra("ID_TS", 0)
        populateTS(idTS)

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

    private fun populateTS(idTS: Int) {
        when (idTS) {
            R.id.ts_1 -> {
                binding.toolbarLayout.title = resources.getString(R.string.ts_1_judul)
                binding.ivDetailImageTs.setImageResource(R.drawable.ts_1_image)
                binding.tvDeskripsiTs.text = resources.getString(R.string.ts_1_deskripsi)
            }
            R.id.ts_2 -> {
                binding.toolbarLayout.title = resources.getString(R.string.ts_2_judul)
                binding.ivDetailImageTs.setImageResource(R.drawable.ts_2_image)
                binding.tvDeskripsiTs.text = resources.getString(R.string.ts_2_deskripsi)
            }
            R.id.ts_3 -> {
                binding.toolbarLayout.title = resources.getString(R.string.ts_3_judul)
                binding.ivDetailImageTs.setImageResource(R.drawable.ts_3_image)
                binding.tvDeskripsiTs.text = resources.getString(R.string.ts_3_deskripsi)
            }
            R.id.ts_4 -> {
                binding.toolbarLayout.title = resources.getString(R.string.ts_4_judul)
                binding.ivDetailImageTs.setImageResource(R.drawable.ts_4_image)
                binding.tvDeskripsiTs.text = resources.getString(R.string.ts_4_deskripsi)
            }
            R.id.ts_5 -> {
                binding.toolbarLayout.title = resources.getString(R.string.ts_5_judul)
                binding.ivDetailImageTs.setImageResource(R.drawable.ts_5_image)
                binding.tvDeskripsiTs.text = resources.getString(R.string.ts_5_deskripsi)
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
