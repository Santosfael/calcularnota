package com.rafael.calculadoradenotas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = bt_calcular
        val result = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(faltas.text.toString())

            if(media >= 6 && faltas <= 10) {
                result.text = "Aluno foi Aprovado\nNota final: $media\nFaltas: $faltas"
                result.setTextColor(Color.GREEN)
            } else {
                result.text = "Aluno foi Reprovado\nNota final: $media\nFaltas: $faltas"
                result.setTextColor(Color.RED)
            }
        }
    }
}