package com.example.practicacontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNombre=findViewById<EditText>(R.id.txtNombre)
        val chboxM=findViewById<RadioButton>(R.id.rdbMasculino)
        val chboxF=findViewById<RadioButton>(R.id.rdbFemenino)
        val txtDate=findViewById<EditText>(R.id.txtFechaNacimiento)
        val txtTelefono=findViewById<EditText>(R.id.txtTelefono)
        val enviar=findViewById<Button>(R.id.btnEnviar)
        enviar.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,receptarDatos::class.java)
            intent.putExtra("Nombre",txtNombre.text.toString())
            intent.putExtra("masculino",chboxM.isChecked)
            intent.putExtra("femenino",chboxF.isChecked)
            intent.putExtra("date",txtDate.text.toString())
            intent.putExtra("telefono",txtTelefono.text.toString())

            startActivity(intent)
        })
    }

}