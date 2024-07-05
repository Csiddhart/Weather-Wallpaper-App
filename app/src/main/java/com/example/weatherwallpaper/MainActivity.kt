package com.example.weatherwallpaper

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.weatherwallpaper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //view Binding --> to process the thing

    private lateinit var binding: ActivityMainBinding  //binding object will help u to access Design page



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //button click listener
        binding.Summer.setOnClickListener {
            binding.Text.text="Summer Weather"

            //Glide
            Glide
                .with(this)
                .load("https://hips.hearstapps.com/hmg-prod/images/when-does-summer-end-1651614198.jpg")
                .centerCrop()
               // .placeholder(R.drawable.loading_spinner)
                .into(binding.SummerImage);
        }

        binding.Autumn.setOnClickListener {
            binding.Text.text="Autumn Weather"

            //Glide
            Glide
                .with(this)
                .load("https://images.pexels.com/photos/33109/fall-autumn-red-season.jpg")
                .centerCrop()
                // .placeholder(R.drawable.loading_spinner)
                .into(binding.AutumnImage);
        }

        binding.Winter.setOnClickListener {
            binding.Text.text="Winter Weather"

            //Glide
            Glide
                .with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/b/b0/Winter_forest_silver.jpg")
                .centerCrop()
                .into(binding.WinterImage);
        }

        binding.Spring.setOnClickListener {
            binding.Text.text="Spring Weather"

            //Glide
            Glide
                .with(this)
                .load("https://cdn.britannica.com/05/155405-050-F8969EE6/Spring-flowers-fruit-trees-bloom.jpg")
                // .placeholder(R.drawable.loading_spinner)
                .into(binding.SpringImage);
        }

    }
}