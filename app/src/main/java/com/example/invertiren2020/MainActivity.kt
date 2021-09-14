package com.example.invertiren2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickBtnfacil()
        clickBtnmedio()
        clickBtndificil()
        ClickBtnComoJugar()
        iniciojuego()

    }
    fun clickBtnfacil(){
        var dif = 1
        Facilbtn.setOnClickListener(){
            val intent:Intent = Intent(this, periodico::class.java)
            startActivity(intent)
            finish()
            inversor1.efectivo = inversor1.Efectivo(dif).toFloat()
            inversor1.dificultad = 1



        }
    }
    fun clickBtnmedio(){
        var dif = 2
        Mediobtn.setOnClickListener(){
            val intent:Intent = Intent(this, periodico::class.java)
            startActivity(intent)
            finish()
            inversor1.efectivo = inversor1.Efectivo(dif).toFloat()
            inversor1.dificultad = 2

        }
    }
    fun clickBtndificil(){
        Dificilbtn.setOnClickListener(){
            val intent:Intent = Intent(this, periodico::class.java)
            startActivity(intent)
            finish()
            inversor1.efectivo = inversor1.Efectivo(dif = 3).toFloat()
            inversor1.dificultad = 3

        }
    }
    fun ClickBtnComoJugar(){
        ComoJugarbtn.setOnClickListener(){
            val intent:Intent = Intent(this, ComoJugar::class.java)
            startActivity(intent)

        }
    }
    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Vuelvo a presionar si quieres salir", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)
    }
    fun iniciojuego(){
        inversor1.dificultad = 0
        inversor1.efectivo = 0F
        inversor1.marketing = 10000F
        inversor1.InvestigacionDesarrollo = 10000F
        inversor1.AmpliacionPlanta = 10000F
        inversor1.Banco1 = 100000F
        inversor1.Banco2 = 300000F
        inversor1.devolverbanco1 = 0F
        inversor1.devolverbanco2 = 0F
        inversor1.mes = 1
        inversor1.personas = 2000
        inversor1.produccion = 75
        inversor1.precio = 39.99F
        inversor1.cantprodvendidso = 2000
        inversor1.cantprodproducidos = 2000
        inversor1.stock = 0
        inversor1.mantenimiento = 1000F
        inversor1.sueldos = 3000F
        inversor1.impuestos = 3000F
        inversor1.costoprod = 1000F
        inversor1.alquiler = 2000F
        inversor1.suministros = 2000F
        inversor1.interesestotales = 0F

    }


}