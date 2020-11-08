package com.example.desafioandroidcore.Restaurante

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroidcore.R

class RestauranteAdapter(private  var listaRestaurante: ArrayList<Restaurante>, val listener: onRestauranteClickListener): RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder>() {
    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ):RestauranteAdapter.RestauranteViewHolder{
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_home, parent, false)
        return RestauranteViewHolder(itemView)

    }

    override fun getItemCount() = listaRestaurante.size

    override fun onBindViewHolder(holder: RestauranteAdapter.RestauranteViewHolder, position: Int) {
       var restaurante = listaRestaurante.get(position)

        holder.tvNomeRestaurante.text = restaurante.nome
        holder.tvEnderecoRestaurante.text = restaurante.endereco
        holder.tvHoraRestaurante.text = restaurante.horario
        holder.imgRestaurante.setImageResource(restaurante.img)



    }
    interface onRestauranteClickListener{
        fun restauranteClick(position: Int)
    }


    inner class RestauranteViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener{
        val tvNomeRestaurante: TextView = itemView.findViewById(R.id.tv_Nome_Restaurante)
        val tvEnderecoRestaurante: TextView = itemView.findViewById(R.id.tv_Endereço_Restaurante)
        val tvHoraRestaurante: TextView = itemView.findViewById(R.id.tv_Hora_Restaurante)
        val imgRestaurante: ImageView = itemView.findViewById(R.id.img_Restaurante)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position){
                listener.restauranteClick(position)
            }
        }
    }

}


