package com.example.desafioandroidcore.Restaurante

import android.media.Image

class Restaurante(val id: Int, val nome: String, val endereco: String, val horario: String, val img: Int) {
    override fun toString(): String {
        return "Restaurante(id=$id, nome='$nome', endereco='$endereco', horario='$horario')"
    }
}