package com.example.desafioandroidcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafioandroidcore.Restaurante.Restaurante
import com.example.desafioandroidcore.Restaurante.RestauranteActivity
import com.example.desafioandroidcore.Restaurante.RestauranteAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RestauranteAdapter.onRestauranteClickListener {
    var listaRestaurante = getAllRestaurantes()
    var adapter = RestauranteAdapter(listaRestaurante, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRestaurantes.adapter = adapter
        rvRestaurantes.layoutManager = LinearLayoutManager(this)
        rvRestaurantes.setHasFixedSize(true)
    }

    fun getAllRestaurantes(): ArrayList<Restaurante>{
        val restaurante1 = Restaurante(1,"Tony Roma's", "Av. Lavandisca - Indianópolis, São Paulo", "22:00", R.drawable.image1)
        val restaurante2 = Restaurante(2,"Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "00:00", R.drawable.image4)
        val restaurante3 = Restaurante(3,"Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "00:00", R.drawable.image5)
        val restaurante4 = Restaurante(4,"Sí Señor!", "Alameda Jauperi, 626 - Moema", "01:00", R.drawable.image3)

        return arrayListOf(restaurante1, restaurante2, restaurante3, restaurante4)

    }

    override  fun restauranteClick(position: Int){
        val restaurante = listaRestaurante.get(position)
        adapter.notifyItemChanged(position)
        val intent  =  Intent ( this , RestauranteActivity :: class . java )
        startActivity(intent)
        Toast.makeText(this, "DEU CERTO", Toast.LENGTH_SHORT).show()
    }


}