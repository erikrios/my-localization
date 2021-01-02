package io.erikrios.github.mylocalization

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.mylocalization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pokeCouont = 3
        val hello = resources.getString(
            R.string.hello_world, "Narendra Wicaksono", pokeCouont, "Yoza Aprilio"
        )
        binding.tvHello.text = hello

        val songCOunt = 5
        val pluralText =
            resources.getQuantityString(R.plurals.numberOfSongsAvailable, songCOunt, songCOunt)
        binding.tvPlural.text = pluralText

        binding.tvXliff.text = resources.getString(R.string.app_homeurl)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_change_settings) {
            val mIntent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(mIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}