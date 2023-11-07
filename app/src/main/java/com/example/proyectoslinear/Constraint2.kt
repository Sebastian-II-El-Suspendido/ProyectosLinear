package com.example.proyectoslinear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Constraint2 : AppCompatActivity() {
    private lateinit var boton1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint2)
        boton1 = findViewById(R.id.button)
        boton1.setOnClickListener{
            val intent = Intent(this@Constraint2,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
