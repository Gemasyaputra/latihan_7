package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_7.R
import model.modelbuah


class buahadapter (val itemlist : ArrayList<modelbuah>):
    RecyclerView.Adapter<buahadapter.ModelVIewHolder>() {
    class ModelVIewHolder (itemView: View) :RecyclerView.ViewHolder(itemView) {

        var itemimage : ImageView
        var itemText : TextView

        init {
            itemimage = itemView.findViewById(R.id.gambar) as ImageView
            itemText = itemView.findViewById(R.id.nama) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelVIewHolder {
        val nView = LayoutInflater.from(parent.context)
          .inflate(R.layout.item_custom_image, parent, false)
        return ModelVIewHolder(nView)
    }

    override fun getItemCount(): Int {
    return itemlist.size
    }

    override fun onBindViewHolder(holder: ModelVIewHolder, position: Int) {
      holder.itemimage.setImageResource(itemlist[position].image)
        holder.itemText.setText(itemlist[position].deskripsi)
    }

}