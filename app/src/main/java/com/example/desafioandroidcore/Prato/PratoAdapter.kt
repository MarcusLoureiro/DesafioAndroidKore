package com.example.desafioandroidcore.Prato

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroidcore.R

class PratoAdapter(private var listaPrato: ArrayList<Prato>, val listener: onPratoClickListener): RecyclerView.Adapter<PratoAdapter.PratoViewHolder>() {
    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): PratoViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_prato, parent, false)
        return PratoViewHolder(itemView)

    }

    override fun getItemCount() = listaPrato.size

    override fun onBindViewHolder(holder: PratoViewHolder, position: Int) {
        var prato = listaPrato.get(position)

        holder.tvNomePrato.text = prato.nome
        holder.imgPrato.setImageResource(prato.img)



    }
    interface onPratoClickListener{
        fun pratoClick(position: Int)
    }


    inner class PratoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener{
        val tvNomePrato: TextView = itemView.findViewById(R.id.tv_Nome_Prato)
        val imgPrato: ImageView = itemView.findViewById(R.id.img_Prato)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position){
                listener.pratoClick(position)
            }
        }
    }


}


