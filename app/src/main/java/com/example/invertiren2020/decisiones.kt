package com.example.invertiren2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_decisiones.*


class decisiones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decisiones)
        verefectivo()
        clicksiguiente()
        clickatras()
    }

    fun verefectivo() {
        var efectivo: Float = inversor1.efectivo
        efectivotxt.text = "Efectivo : $efectivo"
    }

    fun clicksiguiente() {
        var con1: Boolean
        var con2: Boolean
        Siguiente.setOnClickListener() {
            con1 = verifproduccion()
            con2 = verifpunto()
            if (con1 and con2) {
                inversor1.Banco1 = inversor1.Banco1 - (pedirbanco1number.text.toString()).toFloat()
                inversor1.Banco2 = inversor1.Banco2 - (pedirbanco2number.text.toString().toFloat())
                inversor1.marketing = (MarketingNumber.text.toString()).toFloat()
                inversor1.InvestigacionDesarrollo = inversor1.InvestigacionDesarrollo + (iydnumber.text.toString().toFloat())
                inversor1.AmpliacionPlanta = inversor1.AmpliacionPlanta + (ampliacionplatanumber.text.toString().toFloat())
                inversor1.Banco1 = inversor1.Banco1 + (devolverbanco1number.text.toString().toFloat())
                inversor1.Banco2 = inversor1.Banco2 + (devolverbanco2number.text.toString().toFloat())
                if(prod25check.isChecked){
                    inversor1.produccion = 25
                }
                else if (prod50check.isChecked){
                    inversor1.produccion = 50
                }
                else if (prod75check.isChecked){
                    inversor1.produccion = 75
                }
                else if(prod100check.isChecked){
                    inversor1.produccion = 100
                }
                if(precio1check.isChecked){
                    inversor1.precio = 19.99F
                }
                else if(precio2check.isChecked){
                    inversor1.precio = 29.99F
                }
                else if(precio3check.isChecked){
                    inversor1.precio = 39.99F
                }
                else if(precio4check.isChecked){
                    inversor1.precio = 49.99F
                }
                inversor1.efectivo = inversor1.efectivo - inversor1.marketing - (iydnumber.text.toString().toFloat()) - (ampliacionplatanumber.text.toString().toFloat()) + pedirbanco1number.text.toString().toFloat() + pedirbanco2number.text.toString().toFloat() - devolverbanco1number.text.toString().toFloat() - devolverbanco2number.text.toString().toFloat()
                if(inversor1.efectivo < 0){
                    val intent = Intent(this, perdiste::class.java)
                    startActivity(intent)
                    finish()

                }
                else{
                    calculartodo()
                    val intent = Intent(this, periodico::class.java)
                    startActivity(intent)
                    finish()
                }
                bancosquiebra()
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
    fun verifproduccion() : Boolean{
        if((prod25check.isChecked and prod50check.isChecked) or (prod25check.isChecked and prod100check.isChecked) or (prod25check.isChecked and prod75check.isChecked) or (prod50check.isChecked and prod75check.isChecked) or (prod50check.isChecked and prod100check.isChecked) or (prod75check.isChecked and prod100check.isChecked) or  (precio1check.isChecked and precio2check.isChecked) or (precio1check.isChecked and precio3check.isChecked) or (precio1check.isChecked and precio4check.isChecked) or  (precio2check.isChecked and precio3check.isChecked) or (precio2check.isChecked and precio4check.isChecked) or (precio3check.isChecked and precio4check.isChecked) or (!prod25check.isChecked and !prod50check.isChecked and !prod75check.isChecked and !prod100check.isChecked) or (!precio1check.isChecked and !precio2check.isChecked and !precio3check.isChecked and !precio4check.isChecked)){
            Toast.makeText(this,"Debes seleccionar un solo valor de produccion y un solo valor del precio",Toast.LENGTH_SHORT).show()
            return false
        }
        else if((devolverbanco1number.text.toString().isEmpty() or devolverbanco2number.text.toString()
                .isEmpty() or pedirbanco1number.text.toString()
                .isEmpty() or pedirbanco2number.text.toString()
                .isEmpty() or MarketingNumber.text.toString()
                .isEmpty() or iydnumber.text.toString()
                .isEmpty() or ampliacionplatanumber.text.toString().isEmpty())){
            Toast.makeText(this, "Ingresa algún valor en todos los casilleros", Toast.LENGTH_SHORT).show()
            return false


        }
        else{
            return true
        }
        }
    fun calculartodo(){
        inversor1.quenosepasebanco()
        inversor1.devolverbanco()
        inversor1.intereses()
        inversor1.producir()
        inversor1.personasinteresadas()
        inversor1.vender()
        inversor1.gastos()
        inversor1.efectivo = inversor1.efectivo - inversor1.interesestotales - inversor1.mantenimiento - inversor1.sueldos - inversor1.impuestos - inversor1.costoprod - inversor1.alquiler - inversor1.suministros

    }
    fun bancosquiebra(){
        if(inversor1.Banco1 < 0){
            val intent = Intent(this, perdiste::class.java)
            startActivity(intent)
            finish()
        }
        else if(inversor1.Banco2 < 0){
            val intent = Intent(this, perdiste::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun clickatras(){
        atrasbtn.setOnClickListener(){
            val intent : Intent = Intent(this, resumen::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun verifpunto() : Boolean{
        if (pedirbanco1number.text.toString() == "."){
            Toast.makeText(this, "Ingresa algún valor en todos los casilleros", Toast.LENGTH_SHORT).show()
            return false
        }
        else if(pedirbanco2number.text.toString() == "."){
            Toast.makeText(this, "Ingresa algún valor en todos los casilleros", Toast.LENGTH_SHORT).show()
            return false
        }
        else if(MarketingNumber.text.toString() == "."){
            Toast.makeText(this, "Ingresa algún valor en todos los casilleros", Toast.LENGTH_SHORT).show()
            return false
        }
        else if(iydnumber.text.toString() == "."){
            Toast.makeText(this, "Ingresa algún valor en todos los casilleros", Toast.LENGTH_SHORT).show()
            return false
        }
        else if(ampliacionplatanumber.text.toString() == "."){
            Toast.makeText(this, "Ingresa algún valor en todos los casilleros", Toast.LENGTH_SHORT).show()
            return false
        }
        else if(devolverbanco1number.text.toString() == "."){
            Toast.makeText(this, "Ingresa algún valor en todos los casilleros", Toast.LENGTH_SHORT).show()
            return false
        }
        else if(devolverbanco2number.text.toString() == "."){
            Toast.makeText(this, "Ingresa algún valor en todos los casilleros", Toast.LENGTH_SHORT).show()
            return false
        }
        else{
            return true
        }
    }
    }
