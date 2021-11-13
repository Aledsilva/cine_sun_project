package com.example.cinesun.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cinesun.R
import com.example.cinesun.databinding.MovieRowBinding
import com.example.cinesun.ui.details.DetailsActivity
import com.example.cinesun.viewmodel.ViewModelPopular
import kotlinx.android.synthetic.main.movie_row.view.*

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val testeTitles = listOf("Filme 1", "Filme 2", "Filme 3", "Filme 4")

    // number of items
    override fun getItemCount(): Int {
        return testeTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        // how we create a view
        //val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = MovieRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        //holder.binding.text = testeTitles[position]

    }
}

class CustomViewHolder(val binding: MovieRowBinding) : RecyclerView.ViewHolder(binding.root) {

    init{
        binding.imageMovie.setOnClickListener {
            val intent = Intent(itemView.context, DetailsActivity::class.java)
            itemView.context.startActivity(intent)
        }
    }
}