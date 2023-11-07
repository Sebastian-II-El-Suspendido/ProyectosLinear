package com.example.proyectoslinear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Linear1 : AppCompatActivity() {
    private lateinit var boton1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear1)
        boton1 = findViewById(R.id.button3)
        boton1.setOnClickListener{
            val intent = Intent(this@Linear1,MainActivity::class.java)
            startActivity(intent)
        }
    }
}