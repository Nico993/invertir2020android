package com.example.invertiren2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ganaste.*

class ganaste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganaste)
        clicksalir()
        clickvolverajugar()

    }
    override fun onBackPressed() {}
    fun clickvolverajugar(){
        volverajugarbtn.setOnClickListener(){
            val intent: Intent = Intent(this, MainActivity::class.java)
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