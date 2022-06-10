package com.example.practicacontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class receptarDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receptar_datos)
        val bundle=intent.extras
        val nombre=bundle?.getString("Nombre")
        val rdbM=bundle?.getBoolean("masculino")
        val rdbF=bundle?.getBoolean("femenino")
        val date=bundle?.getString("date")
        val telefono=bundle?.getString("telefono")
        val txtnombre=findViewById<TextView>(R.id.txtNombre)
        val rdbMasculino=findViewById<RadioButton>(R.id.rdbMasculino)
        val rdbFemenino=findViewById<RadioButton>(R.id.rdbFemenino)
        val txtTelefono=findViewById<TextView>(R.id.txtTelefono)
        val txtFecha=findViewById<TextView>(R.id.txtFechaNacimiento)

        txtnombre.text= nombre.toString()
        if (rdbM != null&& rdbF!=null) {
            rdbMasculino.isChecked=rdbM
            rdbFemenino.isChecked=rdbF
        }
        txtTelefono.text=telefono.toString()
        txtFecha.text=date.toString()
        val btnregresar=findViewById<Button>(R.id.btnregresar)
        btnregresar.setOnClickListener(
            {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        )
    }
}