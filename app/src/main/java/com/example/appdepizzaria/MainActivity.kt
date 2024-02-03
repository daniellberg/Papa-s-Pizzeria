package com.example.appdepizzaria

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appdepizzaria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var clicked = false

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btChicken.setOnClickListener {
            clicked = true
            if(clicked){
                binding.btChicken.setBackgroundResource(R.drawable.bg_button_enabled)
                binding.btChicken.setTextColor(Color.WHITE)
                binding.btAll.setBackgroundResource(R.drawable.bg_buton_disabled)
                binding.btAll.setTextColor(R.color.dark_grey)
                binding.btKebab.setBackgroundResource(R.drawable.bg_buton_disabled)
                binding.btKebab.setTextColor(R.color.dark_grey)
                binding.btPizza.setBackgroundResource(R.drawable.bg_buton_disabled)
                binding.btPizza.setTextColor(R.color.dark_grey)
                binding.btDrinks.setBackgroundResource(R.drawable.bg_buton_disabled)
                binding.btDrinks.setTextColor(R.color.dark_grey)
                binding.recyclerViewProducts.visibility = View.INVISIBLE
                binding.txtListTitle.text = "Chicken"
            }
        }




    }
}