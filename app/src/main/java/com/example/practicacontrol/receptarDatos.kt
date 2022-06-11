package com.example.practicacontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class receptarDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receptar_datos)
        val bundle=intent.extras
        val txtnombre=findViewById<TextView>(R.id.txtNombre)
        val rdbMasculino=findViewById<RadioButton>(R.id.rdbMasculino)
        val rdbFemenino=findViewById<RadioButton>(R.id.rdbFemenino)
        val txtTelefono=findViewById<TextView>(R.id.txtTelefono)
        val txtFecha=findViewById<TextView>(R.id.txtFechaNacimiento)
        txtnombre.setText(bundle?.getString("Nombre"))
        if (bundle != null) {
            rdbMasculino.isChecked=bundle.getBoolean("masculino")
            rdbFemenino.isChecked=bundle.getBoolean("femenino")
        }
        txtTelefono.setText(bundle?.getString("telefono"))
        txtFecha.setText(bundle?.getString("date"))
        txtnombre.isEnabled=false
        rdbFemenino.isEnabled=false
        rdbMasculino.isEnabled=false
        txtTelefono.isEnabled=false
        txtFecha.isEnabled=false
    }
    fun inicio(view: View){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}