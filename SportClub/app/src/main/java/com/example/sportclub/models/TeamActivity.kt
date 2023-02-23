package com.example.sportclub.models

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sportclub.databinding.ActivityMixTeamBinding
import com.example.sportclub.databinding.CardPlayerNameBinding

class TeamActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMixTeamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMixTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)
          initRecyclerView()
        playerAddView()

        val takePhotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
    }

    private fun playerAddView(){
        val cardPlayer = CardPlayerNameBinding.inflate(layoutInflater)


        binding.btnFormPlayer.setOnClickListener {
            AlertDialog.Builder(this)
                .setView(cardPlayer.root)
                .setPositiveButton("confirmar"){ _, _ ->

                }
        }
    }


    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = Adapter(getList())
    }

    private fun getList() = listOf(

        "Juan Rodrigues",
        "Eduarda Souza",
        "Jogador 4"
    )

}