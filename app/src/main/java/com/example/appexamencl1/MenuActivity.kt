package com.example.appexamencl1

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val btnCerrarSesion : Button = findViewById(R.id.btnCerrarSesion)

        btnCerrarSesion.setOnClickListener{


            val titleMsg: String = "Confirmacion"
            val bodyMsg: String = "¿Esta seguro que desea salir de la App?"

            showModalConfirmExit(titleMsg, bodyMsg);
        }
    }

    private fun showModalConfirmExit(titleMsg: String, bodyMsg: String) {

        val dialogConfirm = Dialog(this)
        dialogConfirm.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConfirm.setCancelable(false)
        dialogConfirm.setContentView(R.layout.custom_modal_dialog)
        dialogConfirm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))


        //INICIO

        val titleModal : TextView = dialogConfirm.findViewById(R.id.modalTitle)
        val bodyMsgModal : TextView = dialogConfirm.findViewById(R.id.modalMessage)

        val btnAceptar : Button = dialogConfirm.findViewById(R.id.btnModalAceptar)
        val btnCancelar : Button = dialogConfirm.findViewById(R.id.btnModalCancelar)

        titleModal.text = titleMsg
        bodyMsgModal.text = bodyMsg


        btnAceptar.setOnClickListener {
            val pantallaPrincipal = Intent(this, PantallaPrincipal::class.java)
            startActivity(pantallaPrincipal)
        }
        btnCancelar.setOnClickListener {
            Toast.makeText(this, "Siga Navegando", Toast.LENGTH_LONG).show()
            dialogConfirm.dismiss()
        }
        dialogConfirm.show()

    }
}