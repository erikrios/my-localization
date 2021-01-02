package io.erikrios.github.mylocalization

import android.os.Bundle
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
}