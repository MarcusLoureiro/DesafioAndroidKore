package com.example.desafioandroidcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        Toast.makeText(this, "Bem-Vindo", Toast.LENGTH_SHORT).show()

        bt_register.setOnClickListener {
            val intent  =  Intent ( this ,  RegisterActivity :: class . java )
            startActivity(intent)
        }
    }
}