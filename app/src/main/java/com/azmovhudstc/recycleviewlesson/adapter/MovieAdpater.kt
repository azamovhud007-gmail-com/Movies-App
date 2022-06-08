package com.azmovhudstc.recycleviewlesson.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.azmovhudstc.recycleviewlesson.R
import com.azmovhudstc.recycleviewlesson.model.Movie
import kotlinx.android.synthetic.main.item.view.*

class MovieAdpater(var list: ArrayList<Movie>):RecyclerView.Adapter<MovieAdpater.MyViewHolder>() {

    inner class MyViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(movie: Movie){
            itemView.movieImage.setImageResource(movie.image)
            itemView.movieName.text=movie.name
            itemView.views.text=movie.views
            itemView.date.text=movie.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentItem=list[position]
        holder.onBind(currentItem)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}