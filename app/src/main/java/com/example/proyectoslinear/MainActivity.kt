package com.example.proyectoslinear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var boton1: Button
    private lateinit var boton2: Button
    private lateinit var boton3: Button
    private lateinit var boton4: Button
    private lateinit var boton5: Button
    private lateinit var boton6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton1 = findViewById(R.id.buttonlin1)
        boton1.setOnClickListener{
            val intent = Intent(this@MainActivity,Linear1::class.java)
            startActivity(intent)
        }
        boton2 = findViewById(R.id.buttonlin2)
        boton2.setOnClickListener{
            val intent2 = Intent(this@MainActivity,Linear2::class.java)
            startActivity(intent2)
        }
        boton3 = findViewById(R.id.butonlin3)
        boton3.setOnClickListener{
            val intent2 = Intent(this@MainActivity,Table1::class.java)
            startActivity(intent2)
        }
        boton4 = findViewById(R.id.butonlin4)
        boton4.setOnClickListener{
            val intent2 = Intent(this@MainActivity,Table2::class.java)
            startActivity(intent2)
        }
        boton5 = findViewById(R.id.butonlin5)
        boton5.setOnClickListener{
            val intent2 = Intent(this@MainActivity,Constraint1::class.java)
            startActivity(intent2)
        }
        boton6 = findViewById(R.id.butonlin6)
        boton6.setOnClickListener{
            val intent2 = Intent(this@MainActivity,Constraint2::class.java)
            startActivity(intent2)
        }
    }
}