package com.example.modulo4_ej3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sumar = findViewById<Button>(R.id.sumar)
        val restar = findViewById<Button>(R.id.restar)
        val multiplicar = findViewById<Button>(R.id.multiplicar)
        val dividir = findViewById<Button>(R.id.dividir)
        val editTextprimerNumero = findViewById<EditText>(R.id.editTextPrimerNumero)
        val editTextsegundoNumero = findViewById<EditText>(R.id.editTextSegundoNumero)
        sumar.setOnClickListener(View.OnClickListener {
            if (editTextprimerNumero.text.toString().trim { it <= ' ' }.isEmpty() || editTextsegundoNumero.text.toString().trim { it <= ' ' }.isEmpty()) {    // validación
                Toast.makeText(baseContext, "(suma)faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = editTextprimerNumero.text.toString().toInt()
            val segundo = editTextsegundoNumero.text.toString().toInt()
            val suma = primer + segundo
            Toast.makeText(baseContext, "resultado: $suma", Toast.LENGTH_LONG).show()
        })
        restar.setOnClickListener(View.OnClickListener {
            if (editTextprimerNumero.text.toString().trim { it <= ' ' }.isEmpty() || editTextsegundoNumero.text.toString().trim { it <= ' ' }.isEmpty()) {    // validación
                Toast.makeText(baseContext, "(resta)faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = editTextprimerNumero.text.toString().toInt()
            val segundo = editTextsegundoNumero.text.toString().toInt()
            val resta = primer - segundo
            Toast.makeText(baseContext, "resultado: $resta", Toast.LENGTH_LONG).show()
        })
        dividir.setOnClickListener(View.OnClickListener {
            if (editTextprimerNumero.text.toString().trim { it <= ' ' }.isEmpty() || editTextsegundoNumero.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "(division)faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = editTextprimerNumero.text.toString().toInt()
            if (editTextsegundoNumero.text.toString().toInt() == 0) {
                Toast.makeText(baseContext, "no se puede dividir por 0 ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val segundo = editTextsegundoNumero.text.toString().toInt()
            val division = primer / segundo
            Toast.makeText(baseContext, "resultado :  $division", Toast.LENGTH_SHORT).show()
        })
        multiplicar.setOnClickListener(View.OnClickListener {
            if (editTextprimerNumero.text.toString().trim { it <= ' ' }.isEmpty() || editTextsegundoNumero.text.toString().trim { it <= ' ' }.isEmpty()) {    // validación
                Toast.makeText(baseContext, "(multiplicacion)faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = editTextprimerNumero.text.toString().toInt()
            val segundo = editTextsegundoNumero.text.toString().toInt()
            val multiplicacion = primer * segundo
            Toast.makeText(baseContext, "resultado: $multiplicacion", Toast.LENGTH_LONG).show()
        })
    }
}