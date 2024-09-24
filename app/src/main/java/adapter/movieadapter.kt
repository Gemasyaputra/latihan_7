package adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_7.MovieDetailActivity
import com.gema.latihan_7.R
import model.modelmovie

class movieadapter constructor(
    private val context: Context,
    private val movieList: List<modelmovie>
) : RecyclerView.Adapter<movieadapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovieDetail)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movieList[position]

        // Set data ke tampilan
        holder.txtMovie.text = movie.title
        holder.imgMovie.setImageResource(movie.image)

        // Ini ketika item di klik
        holder.cardView.setOnClickListener {
            val intent = Intent(context, MovieDetailActivity::class.java).apply {
                putExtra("MOVIE_TITLE", movie.title)
                putExtra("MOVIE_IMAGE", movie.image)
                putExtra("tanggal", movie.tanggal)
                putExtra("sinopsis", movie.sinopsis)
            }
            context.startActivity(intent)

        }
    }
}

