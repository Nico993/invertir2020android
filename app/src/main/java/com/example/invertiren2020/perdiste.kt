package com.example.invertiren2020

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_perdiste.*

class perdiste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perdiste)
        clickvolverajugar()
        clicksalir()
    }
    override fun onBackPressed() {}
    fun clickvolverajugar(){
        volverajugarbtn.setOnClickListener(){
            val intent : Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun clicksalir(){
        salirbtn.setOnClickListener(){
            finish()
        }
    }
}