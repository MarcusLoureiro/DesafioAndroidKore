package com.example.desafioandroidcore.Restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafioandroidcore.Prato.Prato
import com.example.desafioandroidcore.Prato.PratoActivity
import com.example.desafioandroidcore.Prato.PratoAdapter
import com.example.desafioandroidcore.R
import kotlinx.android.synthetic.main.layout_restaurante.*

class RestauranteActivity : AppCompatActivity(), PratoAdapter.onPratoClickListener {
    var listaPrato = getAllPratos()
    var adapter = PratoAdapter(listaPrato, this)
    val restaurante1 = Restaurante(1,"Tony Roma's", "Av. Lavandisca - Indianópolis, São Paulo", "22:00", R.drawable.image1)
    lateinit var textToolbar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_restaurante)
        setSupportActionBar(toolbarRestaurante)
        toolbarRestaurante.setNavigationOnClickListener(){
            finish()
        }

        textToolbar = findViewById(R.id.title_toolbar)
        textToolbar.text = restaurante1.nome
        rvPratos.adapter = adapter
        rvPratos.layoutManager = GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false)
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
        val intent  =  Intent ( this , PratoActivity :: class . java )
        startActivity(intent)

    }


}