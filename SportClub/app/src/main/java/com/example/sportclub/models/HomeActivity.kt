package com.example.sportclub.models

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sportclub.R
import com.example.sportclub.databinding.ActivitySportSelectBinding

class HomeActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySportSelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySportSelectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSportVolley.setOnClickListener {
            val newIntent = Intent(this, TeamActivity::class.java)
            startActivity(newIntent)
        }


    }
}