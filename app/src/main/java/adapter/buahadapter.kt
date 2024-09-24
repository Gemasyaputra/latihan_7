package adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_7.R
import com.gema.latihan_7.detailBuah
import model.modelbuah

class buahadapter(
    val itemlist: ArrayList<modelbuah>,
    private val context: Context // Ganti getActivity dengan context
) : RecyclerView.Adapter<buahadapter.ModelViewHolder>() {

    class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemimage: ImageView = itemView.findViewById(R.id.gambar)
        var itemText: TextView = itemView.findViewById(R.id.nama)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custom_image, parent, false)
        return ModelViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.itemimage.setImageResource(itemlist[position].image)
        holder.itemText.text = itemlist[position].deskripsi

        // untuk klik detail
        holder.itemView.setOnClickListener {
            val intent = Intent(context, detailBuah::class.java)
            intent.putExtra("nama", itemlist[position].deskripsi)
            intent.putExtra("gambar", itemlist[position].image)
            context.startActivity(intent)
        }
    }
}
