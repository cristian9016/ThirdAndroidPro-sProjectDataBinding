package com.example.cristiandev.thirdandroidprosprojectbinding.adapters


import android.content.Context
import android.databinding.DataBindingUtil
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cristiandev.thirdandroidprosprojectbinding.R
import com.example.cristiandev.thirdandroidprosprojectbinding.databinding.TemplateMovieBinding
import com.example.cristiandev.thirdandroidprosprojectbinding.model.Movie
import com.example.cristiandev.thirdandroidprosprojectbinding.util.inflate
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.template_movie.view.*
import java.text.SimpleDateFormat

import java.util.*

/**
 * Created by CristianDev on 6/12/2017.
 */
class MovieAdapter:RecyclerView.Adapter<MovieHolder>(){

    var onMovieSelected:((position:Int)->Unit)? = null
    var onFavoriteSelected: ((position:Int)->Unit)? = null

    var data:List<Movie> = emptyList()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.bind(data[position],position,this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder =
            MovieHolder(parent.inflate(R.layout.template_movie))

    override fun getItemCount(): Int = data.size

    fun onClickFavorite(position:Int){
        onFavoriteSelected?.invoke(position)
    }
    fun onClickMovie(position: Int){
        onMovieSelected?.invoke(position)
    }

}

class MovieHolder(view: View):RecyclerView.ViewHolder(view){
//    val dateFormat: SimpleDateFormat = SimpleDateFormat("yyyy/MM/dd", Locale.getDefault())
//    val context:Context = itemView.context
    private val binding:TemplateMovieBinding = DataBindingUtil.bind(view)
        fun bind(movie: Movie,position: Int,handler:MovieAdapter){
            binding.movie = movie
            binding.handler = handler
            binding.position = position
//        itemView.title.text = movie.nombre
//        itemView.date.text = dateFormat.format(movie.date)
//        itemView.duracion.text = context.getString(R.string.duration,movie.duracion)
//        Picasso.with(context)
//                .load(Uri.parse(movie.imagen))
//                .into(itemView.img)
    }
}