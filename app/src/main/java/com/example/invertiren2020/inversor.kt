package com.example.invertiren2020
var inversor1 : inversor = inversor()

class inversor {
    var dificultad : Int = 0
    var efectivo : Float = 0.0F
    var marketing : Float = 10000F
    var InvestigacionDesarrollo : Float = 10000F
    var AmpliacionPlanta : Float = 10000F
    var Banco1 : Float = 100000.0F
    var Banco2 : Float = 300000.0F
    var intereses1 : String = "20.7%"
    var interese2 : String = "40.5%"
    var devolverbanco1 : Float = 0F
    var devolverbanco2 : Float = 0F
    var mes : Int = 1
    var personas : Int = 2000
    var produccion : Int = 75
    var precio : Float = 39.99F
    var cantprodproducidos : Int = 2000
    var cantprodvendidso : Int = 2000
    var stock : Int = 0
    var mantenimiento : Float = 1000F
    var sueldos : Float = 3000F
    var impuestos : Float = 3000F
    var costoprod : Float = 1000F
    var alquiler : Float = 2000F
    var suministros : Float = 2000F
    var interesestotales : Float = 0.0F

    fun Efectivo(dif : Int) : Int{
        var saldo : Int
        when (dif){
            1 -> saldo = 500000
            2 -> saldo = 500000
            3 -> saldo = 500000
            else ->{
                saldo = 100000000
            }
        }
        return(saldo)

    }
    fun quenosepasebanco(){
        if(inversor1.Banco1 > 100000.0F){
            inversor1.Banco1 = 100000.0F
        }
        if(inversor1.Banco2 > 300000.0F){
            inversor1.Banco2 = 300000.0F
        }
    }
    fun devolverbanco(){
        inversor1.devolverbanco1 = 100000F - inversor1.Banco1
        inversor1.devolverbanco2 = 300000F - inversor1.Banco2
    }
    fun intereses(){
        inversor1.interesestotales = (((inversor1.devolverbanco1 * 0.207).toFloat()) + (inversor1.devolverbanco2 * 0.405)).toFloat()
    }
    fun producir(){
        if(inversor1.dificultad == 1){
            when(inversor1.produccion){
                25 -> inversor1.cantprodproducidos = ((100..1000).random() + (inversor1.AmpliacionPlanta / 50) - (inversor1.InvestigacionDesarrollo / 500000)).toInt()
                50 -> inversor1.cantprodproducidos = ((2000..3100).random() + (inversor1.AmpliacionPlanta / 50) - (inversor1.InvestigacionDesarrollo / 500000)).toInt()
                75 -> inversor1.cantprodproducidos = ((3200..4300).random()  + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 500000)).toInt()
                100 -> inversor1.cantprodproducidos = ((4400..5500).random()   + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 500000)).toInt()
                else -> inversor1.cantprodproducidos = (1..2).random()
            }
        }
       else  if(inversor1.dificultad == 2){
            when(inversor1.produccion){
                25 -> inversor1.cantprodproducidos = ((50..1000).random()  + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 50000)).toInt()
                50 -> inversor1.cantprodproducidos = ((1001..2000).random() + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 50000) ).toInt()
                75 -> inversor1.cantprodproducidos = ((2001..3000).random() + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 50000)).toInt()
                100 -> inversor1.cantprodproducidos = ((3001..4000).random() + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 50000)).toInt()
                else -> inversor1.cantprodproducidos = (1..2).random()
            }
    }
        else  if(inversor1.dificultad == 3){
            when(inversor1.produccion){
                25 -> inversor1.cantprodproducidos = ((50..700).random()  + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 5000)).toInt()
                50 -> inversor1.cantprodproducidos = ((701..1700).random() + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 5000)).toInt()
                75 -> inversor1.cantprodproducidos = ((1701..2500).random() + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 5000)).toInt()
                100 -> inversor1.cantprodproducidos = ((2501..3500).random() + (inversor1.AmpliacionPlanta / 50)  - (inversor1.InvestigacionDesarrollo / 5000)).toInt()
                else -> inversor1.cantprodproducidos = (1..2).random()
            }
        }

}
    fun personasinteresadas(){
        if(dificultad == 1){
            if(inversor1.precio == 19.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..50).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..100).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..500).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((501..1000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((1001..5000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((5001..10000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((10001..20000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((20001..30000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    else -> inversor1.personas = ((30001..40000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                }
            }
            else if(inversor1.precio == 29.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..40).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..90).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..400).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((501..900).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((1001..4000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((5001..9000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((10001..10900).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((20001..20900).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    else -> inversor1.personas = ((30001..40000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                }
            }
            else if(inversor1.precio == 39.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..30).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..80).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..300).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((501..800).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((1001..3000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((5001..8000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((10001..10800).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((20001..20800).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    else -> inversor1.personas = ((30001..40000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                }
            }
            else if(inversor1.precio == 49.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..20).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..70).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..400).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((501..700).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((1001..2000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((5001..7000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((10001..10700).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((20001..20700).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                    else -> inversor1.personas = ((30001..40000).random() + (inversor1.InvestigacionDesarrollo / (100..500).random())).toInt()
                }
            }
        }
        else if(dificultad == 2){
            if(inversor1.precio == 19.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..50).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..100).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..400).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((501..900).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((1001..4900).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((5001..9000).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((10001..10900).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((20001..20900).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    else -> inversor1.personas = ((30001..40000).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                }
            }
           else if(inversor1.precio == 29.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..40).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..90).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..300).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((501..800).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((1001..4800).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((5001..8000).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((10001..10800).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((20001..20800).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    else -> inversor1.personas = ((30001..40000).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                }
            }
            else if(inversor1.precio == 39.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..30).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..80).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..200).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((501..900).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((1001..4700).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((5001..7000).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((10001..10700).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((20001..20700).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    else -> inversor1.personas = ((30001..40000).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                }
            }
            else if(inversor1.precio == 49.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..20).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..70).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..200).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((501..800).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((1001..4600).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((5001..6000).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((10001..10600).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((20001..20600).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                    else -> inversor1.personas = ((30001..40000).random() + (inversor1.InvestigacionDesarrollo / (400..500).random())).toInt()
                }
            }
        }
        else if(dificultad == 3){
            if(inversor1.precio == 19.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..30).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..100).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..200).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((201..700).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((701..1900).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((1901..5000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((5001..10000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((10001..10900).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    else -> inversor1.personas = ((10901..30000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                }
            }
            else if(inversor1.precio == 29.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..20).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..90).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..190).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((201..600).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((701..1800).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((1901..4000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((5001..9000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((10001..10500).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    else -> inversor1.personas = ((10901..30000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                }
            }
            else if(inversor1.precio == 39.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..10).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..80).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..180).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((201..500).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((701..1700).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((1901..3000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((5001..8000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((10001..10400).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    else -> inversor1.personas = ((10901..30000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                }
            }
            else if(inversor1.precio == 49.99F) {
                when (inversor1.marketing){
                    0F -> inversor1.personas = ((1..10).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 1F..100F -> inversor1.personas = ((50..70).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 101F..500F -> inversor1.personas = ((101..170).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 501F..1000F -> inversor1.personas = ((201..400).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 1001F..5000F -> inversor1.personas = ((701..1600).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 5001F..10000F -> inversor1.personas = ((1901..2000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 10001F..20000F -> inversor1.personas = ((5001..7000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    in 20001F..30000F -> inversor1.personas = ((10001..10300).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                    else -> inversor1.personas = ((10901..30000).random() + (inversor1.InvestigacionDesarrollo / (500..700).random())).toInt()
                }
            }
        }
    }
    fun vender(){
        if (inversor1.cantprodproducidos - inversor1.personas + inversor1.stock >= 0){
            inversor1.stock = inversor1.stock  + inversor1.cantprodproducidos - inversor1.personas
            inversor1.efectivo = inversor1.efectivo + (inversor1.personas * inversor1.precio)
            inversor1.cantprodvendidso = inversor1.personas
        }
        else{
            inversor1.efectivo = inversor1.efectivo + ((inversor1.stock + inversor1.cantprodproducidos) * inversor1.precio)
            inversor1.cantprodvendidso = inversor1.cantprodproducidos + inversor1.stock
            inversor1.stock = 0
        }
    }
    fun gastos(){
        if(inversor1.dificultad == 1){
            when(inversor1.produccion){
                25 -> {
                    inversor1.mantenimiento = (500..1000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (500..1000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (500..1000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (500..1000).random() + (inversor1.AmpliacionPlanta / 1000) + inversor1.stock
                    inversor1.suministros = (500..1000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (500..1000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 100)
                }
                50 -> {
                    inversor1.mantenimiento = (1001..5000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (1001..5000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (1001..5000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (1001..5000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (1001..5000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (1001..5000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 100)
                }
                75 -> {
                    inversor1.mantenimiento = (5001..10000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 100)
                }
                100 -> {
                    inversor1.mantenimiento = (10001..10500).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (10001..10500).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (10001..10500).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (10001..10500).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (10001..10500).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (10001..10500).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 100)
                }
                else -> {
                    inversor1.mantenimiento = (500000..10000000).random().toFloat()
                    inversor1.sueldos = (500000..10000000).random().toFloat()
                    inversor1.impuestos = (500000..10000000).random().toFloat()
                    inversor1.alquiler = (500000..10000000).random().toFloat()
                    inversor1.suministros = (500000..10000000).random().toFloat()
                    inversor1.costoprod = (500000..10000000).random().toFloat()
                }


            }
        }
        if(inversor1.dificultad == 2){
            when(inversor1.produccion){
                25 -> {
                    inversor1.mantenimiento = (5001..10000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (5001..10000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 100)
                }
                50 -> {
                    inversor1.mantenimiento = (10001..15000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (10001..15000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (10001..15000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (10001..15000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (10001..15000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (10001..15000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 100)
                }
                75 -> {
                    inversor1.mantenimiento = (15001..20000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 100)
                }
                100 -> {
                    inversor1.mantenimiento = (20001..25000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 100)
                }
                else -> {
                    inversor1.mantenimiento = (500000..10000000).random().toFloat()
                    inversor1.sueldos = (500000..10000000).random().toFloat()
                    inversor1.impuestos = (50000..1000000).random().toFloat()
                    inversor1.alquiler = (50000..1000000).random().toFloat()
                    inversor1.suministros = (50000..1000000).random().toFloat()
                    inversor1.costoprod = (50000..1000000).random().toFloat()
                }


            }
        }
        if(inversor1.dificultad == 3){
            when(inversor1.produccion){
                25 -> {
                    inversor1.mantenimiento = (15001..20000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (15001..20000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 10)
                }
                50 -> {
                    inversor1.mantenimiento = (20001..25000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (10001..25000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (20001..25000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 10)
                }
                75 -> {
                    inversor1.mantenimiento = (25001..30000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (25001..30000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (25001..30000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (25001..30000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.suministros = (25001..30000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.costoprod = (25001..30000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 10)
                }
                100 -> {
                    inversor1.mantenimiento = (30001..40000).random() + (inversor1.AmpliacionPlanta / 1000)
                    inversor1.sueldos = (30001..40000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.impuestos = (30001..40000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.suministros = (30001..40000).random() + (inversor1.AmpliacionPlanta / 100)
                    inversor1.alquiler = (30001..40000).random() + (inversor1.AmpliacionPlanta / 100) + inversor1.stock
                    inversor1.costoprod = (30001..40000).random() + (inversor1.AmpliacionPlanta / 100) + (inversor1.InvestigacionDesarrollo / 10)
                }
                else -> {
                    inversor1.mantenimiento = (500000..10000000).random().toFloat()
                    inversor1.sueldos = (50000..1000000).random().toFloat()
                    inversor1.impuestos = (50000..1000000).random().toFloat()
                    inversor1.alquiler = (50000..1000000).random().toFloat()
                    inversor1.suministros = (50000..1000000).random().toFloat()
                    inversor1.costoprod = (50000..1000000).random().toFloat()
                }


            }
        }
    }
}