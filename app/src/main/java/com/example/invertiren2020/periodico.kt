package com.example.invertiren2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_periodico.*
import kotlinx.android.synthetic.main.activity_decisiones.*

class periodico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_periodico)
        clicksiguiente()
        mes(inversor1.mes)
    }






    fun clicksiguiente(){

        siguientebtn.setOnClickListener(){
            inversor1.mes = inversor1.mes + 1
            val intent:Intent = Intent(this, resumen::class.java)
            startActivity(intent)
            finish()

        }

    }
    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Vuelve a presionar para volver a la pantalla principal", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false
            val intent:Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        finish()}, 2000)
    }
    fun mes(mes : Int){
        var nmes : String
        when (mes){
            1 -> {
                nmes =  "Enero"
                imageView.setImageResource(R.drawable.enero)
            }
                2 -> {
                    nmes = "Febrero"
                    imageView.setImageResource(R.drawable.febrero)
                }
                3 -> {
                    nmes = "Marzo"
                    imageView.setImageResource(R.drawable.marzo)
                }
                4 -> {
                    nmes = "Abril"
                    imageView.setImageResource(R.drawable.abril)
                }
                5 -> {
                    nmes = "Mayo"
                    imageView.setImageResource(R.drawable.mayo)
                }
                6 -> {
                    nmes = "Junio"
                    imageView.setImageResource(R.drawable.junio)
                }
                7 -> {
                    nmes = "Julio"
                    imageView.setImageResource(R.drawable.julio)
                }
                8 -> {
                    nmes = "Agosto"
                    imageView.setImageResource(R.drawable.agosto)
                }
                9 -> {
                    nmes = "Septiembre"
                    imageView.setImageResource(R.drawable.septiembre)
                }
                10 ->{
                    nmes = "Octubre"
                    imageView.setImageResource(R.drawable.octubre)
                }
                11 -> {
                    nmes = "Noviembre"
                    imageView.setImageResource(R.drawable.noviembre)
                }
                12 -> {
                    nmes = "Diciembre"
                    imageView.setImageResource(R.drawable.diciembre)
                }
                else -> {
                    nmes = "Enero 2021"
                    imageView.setImageResource(R.drawable.enero2021)
                }
            }
        mestxt.setText(nmes)

        }

    }