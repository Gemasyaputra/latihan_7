package com.gema.latihan_7

import adapter.movieadapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.modelmovie

class RecycleCardMovie : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var movieAdapter: movieadapter? = null
    private var movieList = mutableListOf<modelmovie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view_card)

        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.rvMovieList)
        movieAdapter = movieadapter(this, movieList)
        recyclerView?.apply {
            layoutManager = GridLayoutManager(this@RecycleCardMovie, 2)
            adapter = movieAdapter
        }

        prepareMovieList()
    }

    // Mengisi daftar film ke dalam list
    private fun prepareMovieList() {
        var movie = modelmovie("Inception", R.drawable.inception, "20 November 2021", getString(R.string.sinopsis1 ))
        movieList.add(movie)
        movie = modelmovie("Avatar", R.drawable.avatar, "20 November 2021",  getString(R.string.sinopsis2))
        movieList.add(movie)
        movie = modelmovie("Batman", R.drawable.batman, "20 November 2021,", getString(R.string.sinopsis3))
        movieList.add(movie)
        movie = modelmovie("End Game", R.drawable.end_game, "20 November 2021",getString(R.string.sinopsis1))
        movieList.add(movie)
        movie = modelmovie("Hulk", R.drawable.hulk, "20 November 2021", getString(R.string.sinopsis2))
        movieList.add(movie)
        movie = modelmovie("Jurassic Park", R.drawable.jurassic_world, "20 November 2021", getString(R.string.sinopsis3))
        movieList.add(movie)
        movie = modelmovie("Jumanji", R.drawable.jumanji, "20 November 2021",getString(R.string.sinopsis1))
        movieList.add(movie)
        movie = modelmovie("Lucy", R.drawable.lucy, "20 November 2021", getString(R.string.sinopsis2))
        movieList.add(movie)
        movie = modelmovie("Spiderman", R.drawable.spider_man, "20 November 2021", getString(R.string.sinopsis3))
        movieList.add(movie)

        movieAdapter?.notifyDataSetChanged()
    }

}
