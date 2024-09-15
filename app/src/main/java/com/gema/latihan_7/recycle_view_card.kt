package com.gema.latihan_7

import adapter.movieadapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
        recyclerView = findViewById(R.id.rvMovieList) as RecyclerView
        movieAdapter = movieadapter(this, movieList)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = movieAdapter

        prepareMovieList()

        // Set padding untuk edge-to-edge

    }

    // Mengisi daftar film ke dalam list
    private fun prepareMovieList() {
        var movie = modelmovie("Inception", R.drawable.inception)
        movieList.add(movie)
        movie = modelmovie("avatar", R.drawable.avatar)
        movieList.add(movie)
        movie = modelmovie("batman", R.drawable.batman)
        movieList.add(movie)
        movie = modelmovie("end game", R.drawable.end_game)
        movieList.add(movie)
        movie = modelmovie("Hulk", R.drawable.hulk)
        movieList.add(movie)
        movie = modelmovie("jurassic park", R.drawable.jurassic_world)
        movieList.add(movie)
        movie = modelmovie("jumanji", R.drawable.jumanji)
        movieList.add(movie)
        movie = modelmovie("Lucy", R.drawable.lucy)
        movieList.add(movie)
        movie = modelmovie("spiderman", R.drawable.spider_man)
        movieList.add(movie)

        movieAdapter!!.notifyDataSetChanged()
    }
}
