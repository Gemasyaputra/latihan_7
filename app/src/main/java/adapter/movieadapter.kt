package adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovie)
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
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        // Ini ketika item di klik
        holder.cardView.setOnClickListener {
            // Intent untuk pindah ke MovieDetailActivity
            val intent = Intent(context, MovieDetailActivity::class.java).apply {
                putExtra("MOVIE_TITLE", movieList[position].title)
                putExtra("MOVIE_IMAGE", movieList[position].image)
            }
            context.startActivity(intent)
        }
    }
}
