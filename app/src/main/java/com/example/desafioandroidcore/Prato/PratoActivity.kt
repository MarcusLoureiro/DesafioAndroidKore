package com.example.desafioandroidcore.Prato

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafioandroidcore.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_prato.*
import kotlinx.android.synthetic.main.layout_register.*
import kotlinx.android.synthetic.main.layout_restaurante.*

class PratoActivity : AppCompatActivity() {
    lateinit var textDecricao: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_prato)
        setSupportActionBar(toolbarPrato)
        toolbarPrato.setNavigationOnClickListener() {
            finish()
        }
        mostraViews()

    }
    fun mostraViews(){
        textDecricao = findViewById(R.id.tv_descricaoPrato)
        textDecricao.text = "Sed ut perspiciatis, unde ommis iste natus error sit voluptatem accusant doloremque laudantium, toam rem aperiam eaque ipsa, quae ab illo inventore veriatis"
    }

}