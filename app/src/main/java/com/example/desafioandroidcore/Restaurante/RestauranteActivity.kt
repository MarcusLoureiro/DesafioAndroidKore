package com.example.desafioandroidcore.Restaurante

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafioandroidcore.R
import kotlinx.android.synthetic.main.layout_restaurante.*

class RestauranteActivity : AppCompatActivity(), PratoAdapter.onPratoClickListener {
    var listaPrato = getAllPratos()
    var adapter = PratoAdapter(listaPrato, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_restaurante)

        rvPratos.adapter = adapter
        rvPratos.layoutManager = LinearLayoutManager(this)
        rvPratos.setHasFixedSize(true)
    }

    fun getAllPratos(): ArrayList<Prato>{
        val prato1 = Prato(1,"Salada com molho Gengibre", R.drawable.image4)
        val prato2 = Prato(1,"Salada com molho Gengibre", R.drawable.image4)
        val prato3 = Prato(1,"Salada com molho Gengibre", R.drawable.image4)
        val prato4 = Prato(1,"Salada com molho Gengibre", R.drawable.image4)
        val prato5 = Prato(1,"Salada com molho Gengibre", R.drawable.image4)
        val prato6 = Prato(1,"Salada com molho Gengibre", R.drawable.image4)
        val prato7 = Prato(1,"Salada com molho Gengibre", R.drawable.image4)
        val prato8 = Prato(1,"Salada com molho Gengibre", R.drawable.image4)


        return arrayListOf(prato1, prato2, prato3, prato4, prato5, prato6, prato7, prato8)

    }

    override  fun pratoClick(position: Int){
        val prato = listaPrato.get(position)
        adapter.notifyItemChanged(position)
        Toast.makeText(this, "DEU CERTO", Toast.LENGTH_SHORT).show()
    }


}