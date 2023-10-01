package com.example.appexamencl1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PantallaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        val btnCancelar = findViewById<Button>(R.id.btnCancelar)
        val  btnCrear: Button = findViewById(R.id.btnCrear)

        btnCrear.setOnClickListener{ val productScreen = Intent(this, MenuActivity::class.java)
        startActivity(productScreen)
    }

        btnCancelar.setOnClickListener({

            Toast.makeText(applicationContext,"El usuario esta intentando cancelar el registro", Toast.LENGTH_LONG).show()
        })



    }

}