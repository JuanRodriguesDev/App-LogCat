package com.example.sportclub.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportclub.R

class Adapter(
    private val playerList: List<String>,

): RecyclerView.Adapter<Adapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
         val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_player_adapter, parent, false )
           return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
           val name = playerList[position]
              holder.textName.text = name
    }

    override fun getItemCount() = playerList.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textName: TextView = itemView.findViewById(R.id.text_name)
    }
}



