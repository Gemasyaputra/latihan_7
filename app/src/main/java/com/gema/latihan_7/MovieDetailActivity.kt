package com.gema.latihan_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        // Ambil data dari Intent
        val movieTitle = intent.getStringExtra("MOVIE_TITLE")
        val movieImage = intent.getIntExtra("MOVIE_IMAGE", 0)
        val sinopsis = intent.getStringExtra("sinopsis")
        val tanggal = intent.getStringExtra("tanggal")

        // Inisialisasi view
        val imgMovieDetail = findViewById<ImageView>(R.id.imgMovieDetail)
        val txtMovieDetail = findViewById<TextView>(R.id.txtMovieDetail)
        val txtDetailSinopsis = findViewById<TextView>(R.id.txtDetailSinopis)  // Harus sesuai ID di XML
        val txtDetailRelease = findViewById<TextView>(R.id.txtDetailrelease)

        // Set data ke view
        imgMovieDetail.setImageResource(movieImage)
        txtMovieDetail.text = movieTitle
        txtDetailSinopsis.text = sinopsis
        txtDetailRelease.text = tanggal
    }
}
