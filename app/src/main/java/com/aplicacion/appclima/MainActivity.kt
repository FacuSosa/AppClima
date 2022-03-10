package com.aplicacion.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)

        val ciudad = intent.getStringExtra("com.aplicacion.appclima.ciudades.CIUDAD")


        val ciudadar = Ciudad("Buenos Aires",15,"Soleado")
        val ciudadBerlin = Ciudad("Ciudad de Berlin",20,"nublado")

        if (ciudad == "ciudad_argentina"){
            // mostrar informacion ciudadar
            tvCiudad?.text = ciudadar.nombre
            tvGrados?.text = ciudadar.grados.toString() + "°"
            tvEstatus?.text = ciudadar.estatus

        }else if (ciudad == "ciudad_berlin"){
              // Mostrar informacion ciudadar
            tvCiudad?.text = ciudadBerlin.nombre
            tvGrados?.text = ciudadBerlin.grados.toString() + "°"
            tvEstatus?.text = ciudadBerlin.estatus

        }else{
            Toast.makeText(this, "No se encuentra la informacion", Toast.LENGTH_SHORT).show()
        }
    }
}