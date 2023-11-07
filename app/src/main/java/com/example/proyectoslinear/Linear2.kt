package com.example.proyectoslinear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Linear2 : AppCompatActivity() {
    private lateinit var boton1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear2)
        boton1 = findViewById(R.id.button)
        boton1.setOnClickListener{
            val intent = Intent(this@Linear2,MainActivity::class.java)
            startActivity(intent)
        }
    }
}