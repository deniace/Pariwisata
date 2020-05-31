package com.deni.pariwisata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityProfileBekasiBinding
import kotlinx.android.synthetic.main.activity_wisata_detail.*

/**
 * Created by Deni Supriyatna (deni ace) on 26 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class ProfileBekasiActivity : AppCompatActivity() {

    lateinit var binding: ActivityProfileBekasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile_bekasi)

        populateBks()

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

    private fun populateBks() {
        binding.toolbarLayout.title = resources.getString(R.string.profile)
        binding.ivDetailImageBks.setImageResource(R.drawable.logo_patriot)
        binding.tvDeskripsiBks.text = resources.getString(R.string.sejarah_bekasi)
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
