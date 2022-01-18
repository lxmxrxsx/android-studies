package com.example.mywordsapp

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(private val letter: String, context: Context) :
    RecyclerView.Adapter<WordAdapter.WorderViewHolder>(){
    
    class WorderViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorderViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: WorderViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}