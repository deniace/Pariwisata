package com.deni.pariwisata.view

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.deni.pariwisata.R
import com.deni.pariwisata.databinding.ActivityAboutBinding

/**
 * Created by Deni Supriyatna (deni ace) on 22 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class AboutActivity : AppCompatActivity() {

    lateinit var binding:ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_about)
        binding.activity = this
        title = resources.getString(R.string.profile)
    }

    public fun goToFacebook(view: View) {
        val url = Uri.parse("https://www.facebook.com/deni.ace.5")
        val intent = Intent(Intent.ACTION_VIEW, url)
        startActivity(intent)
    }

    public fun goToYoutube(view: View) {
        val url = Uri.parse("https://www.youtube.com/c/deniace")
        val intent = Intent(Intent.ACTION_VIEW, url)
        startActivity(intent)
    }

    public fun goToIG(view: View){
        val url = Uri.parse("https://www.instagram.com/deni_ace")
        val intent = Intent(Intent.ACTION_VIEW, url)
        startActivity(intent)
    }
}
