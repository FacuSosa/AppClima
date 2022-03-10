package com.aplicacion.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.aplicacion.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bArgentina = findViewById<Button>(R.id.bArgentina)
        val bBerlin = findViewById<Button>(R.id.bBerlin)

        bArgentina.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"ciudad_argentina")
            startActivity(intent)
        })

        bBerlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"ciudad_berlin")
            startActivity(intent)
        })

    }
}