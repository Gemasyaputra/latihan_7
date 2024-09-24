package com.gema.latihan_7

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailBuah : AppCompatActivity() {

    private lateinit var txtdetailBuah: TextView
    private lateinit var imgdetailBuah: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        setContentView(R.layout.activity_detail_buah)

        txtdetailBuah = findViewById(R.id.txtDetailBuah)
        imgdetailBuah = findViewById(R.id.imgDetailBuah)

        val intent = intent
        val nama = intent.getStringExtra("nama")
        val gambar = intent.getIntExtra("gambar", 0)

        //set data ke layout

        txtdetailBuah.setText(nama)
        imgdetailBuah.setImageResource(gambar)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}