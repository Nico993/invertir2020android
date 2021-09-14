package com.example.invertiren2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_resumen.*

class resumen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)
        clicksiguiente1()
        mes13()
        texto()
        quiebra()
    }

    fun clicksiguiente1() {
        siguiente1btn.setOnClickListener() {
            if(inversor1.mes == 4){
                inversor1.costoprod = 0F
                inversor1.personas = 0
                inversor1.cantprodproducidos = 0
                inversor1.cantprodvendidso = 0
                inversor1.marketing = 0F
                inversor1.produccion = 0
                inversor1.intereses()
                if(inversor1.dificultad == 1){
                    inversor1.mantenimiento = (20001..35000).random() + (inversor1.AmpliacionPlanta / 10000)
                    inversor1.sueldos = (20001..35000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.impuestos = (20001..35000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.alquiler = (20001..35000).random() + (inversor1.AmpliacionPlanta / 1000) + inversor1.stock
                    inversor1.suministros = (20001..35000).random() + (inversor1.AmpliacionPlanta / 1000)
                }
                else if(inversor1.dificultad == 2){
                    inversor1.mantenimiento = (50001..70000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                }
                else if(inversor1.dificultad == 3){
                    inversor1.mantenimiento = (50001..70000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.suministros = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                }
                else{
                    inversor1.mantenimiento = (500000..10000000).random().toFloat()
                    inversor1.sueldos = (50000..1000000).random().toFloat()
                    inversor1.impuestos = (50000..1000000).random().toFloat()
                    inversor1.alquiler = (50000..1000000).random().toFloat()
                    inversor1.suministros = (50000..1000000).random().toFloat()
                    inversor1.costoprod = (50000..1000000).random().toFloat()
                }
                inversor1.efectivo = inversor1.efectivo - inversor1.interesestotales - inversor1.mantenimiento - inversor1.sueldos - inversor1.impuestos - inversor1.costoprod - inversor1.alquiler - inversor1.suministros
                val intent: Intent = Intent(this, periodico::class.java)
                startActivity(intent)
                finish()
            }
            else if(inversor1.mes == 5){
                inversor1.intereses()
                if(inversor1.dificultad == 1){
                    inversor1.mantenimiento = (20001..35000).random() + (inversor1.AmpliacionPlanta / 10000)
                    inversor1.sueldos = (20001..35000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.impuestos = (20001..35000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.alquiler = (20001..35000).random() + (inversor1.AmpliacionPlanta / 1000) + inversor1.stock
                    inversor1.suministros = (20001..35000).random() + (inversor1.AmpliacionPlanta / 1000)
                }
                else if(inversor1.dificultad == 2){
                    inversor1.mantenimiento = (50001..70000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                }
                else if(inversor1.dificultad == 3){
                    inversor1.mantenimiento = (50001..70000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.suministros = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (50001..70000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                }
                else{
                    inversor1.mantenimiento = (500000..10000000).random().toFloat()
                    inversor1.sueldos = (50000..1000000).random().toFloat()
                    inversor1.impuestos = (50000..1000000).random().toFloat()
                    inversor1.alquiler = (50000..1000000).random().toFloat()
                    inversor1.suministros = (50000..1000000).random().toFloat()
                    inversor1.costoprod = (50000..1000000).random().toFloat()
                }
                inversor1.efectivo = inversor1.efectivo - inversor1.interesestotales - inversor1.mantenimiento - inversor1.sueldos - inversor1.impuestos - inversor1.costoprod - inversor1.alquiler - inversor1.suministros
                val intent: Intent = Intent(this, periodico::class.java)
                startActivity(intent)
                finish()

            }
            else {
                val intent: Intent = Intent(this, decisiones::class.java)
                startActivity(intent)
                finish()
            }
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
    fun mes13(){
        if(inversor1.mes == 14){
            siguiente1btn.setOnClickListener(){
                val intent: Intent = Intent(this, ganaste::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
    fun texto(){
        marketingresumentxt.text = "Marketing: " + inversor1.marketing + "     "
        precioresumentxt.text = "Precio:  " + inversor1.precio + "    "
        calidadresumentxt.text = "Calidad:  " + inversor1.InvestigacionDesarrollo + "    "
        produccionresumentxt.text = "Producción:   " + inversor1.produccion + "    "
        maquinariaresumentxt.text = "Maquinaria:   " + inversor1.AmpliacionPlanta + "    "
        matenimientoresumentxt.text = "Mantenimiento: " + inversor1.mantenimiento + "    "
        cantprodproducidosresumentxt.text = "Cantidad de productos producidos:  " + inversor1.cantprodproducidos + "    "
        sueldosresumentxt.text = "Sueldos:   " + inversor1.sueldos + "    "
        cantpersonasiteresadasresumentxt.text = "Cantidad personas interesadas:   " + inversor1.personas + "    "
        impuestosresumentxt.text = "Impuestos:   " + inversor1.impuestos + "    "
        cantprodvendresumentxt.text = "Cantidad productos vendidos:   " + inversor1.cantprodvendidso + "    "
        costoprodresumentxt.text = "Costo de producción:   " + inversor1.costoprod + "    "
        stockresumentxt.text = "Stock:   " + inversor1.stock + "    "
        alquilerresumentxt.text = "Alquiler:   " + inversor1.alquiler + "    "
        suministrosresumentxt.text = "Suministros:   " + inversor1.suministros + "    "
        interesesresumentxt.text = "Intereses:   " + inversor1.interesestotales + "    "
        efectivoresumentxt.text = "Efectivo:   " + inversor1.efectivo + "    "
        prestamodisponiblebanco1txt.text = "Prestamos disponible:   " + inversor1.Banco1 + "    "
        prestamosiponiblebanco2txt.text = "Prestamo disponible:    " + inversor1.Banco2 + "    "
        dineroadevolverbanco1txt.text = "Dinero a devolver: " + inversor1.devolverbanco1 + "    "
        dineroadevolverbanco2txt.text = "Dinero a devolver:   " + inversor1.devolverbanco2 + "    "
        tasadeinteresbanco1.text = "Tasa interes:   " + inversor1.interese2 + "    "
        tasadeinteresbanco2txt.text = "Tasa interes:   " + inversor1.intereses1 + "    "



    }
    fun quiebra(){
        if(inversor1.efectivo < 0){
            val intent = Intent(this, perdiste::class.java)
            startActivity(intent)
            finish()
        }
    }
}