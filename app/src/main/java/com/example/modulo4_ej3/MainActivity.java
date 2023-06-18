package com.example.modulo4_ej3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sumar = findViewById(R.id.sumar);
        Button restar = findViewById(R.id.restar);
        Button multiplicar = findViewById(R.id.multiplicar);
        Button dividir = findViewById(R.id.dividir);

        EditText editTextprimerNumero = findViewById(R.id.editTextPrimerNumero);
        EditText editTextsegundoNumero = findViewById(R.id.editTextSegundoNumero);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextprimerNumero.getText().toString().trim().isEmpty() || editTextsegundoNumero.getText().toString().trim().isEmpty()){    // validación
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }
                 Integer primer = Integer.parseInt(editTextprimerNumero.getText().toString());
                Integer segundo = Integer.parseInt(editTextsegundoNumero.getText().toString());
                Integer suma = primer + segundo;
                Toast.makeText(getBaseContext(),"resultado: "+ suma.toString(), Toast.LENGTH_LONG).show();
            }

        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextprimerNumero.getText().toString().trim().isEmpty() || editTextsegundoNumero.getText().toString().trim().isEmpty()){    // validación
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer primer = Integer.parseInt(editTextprimerNumero.getText().toString());
                Integer segundo = Integer.parseInt(editTextsegundoNumero.getText().toString());
                Integer resta = primer - segundo;
                Toast.makeText(getBaseContext(),"resultado: "+ resta.toString(), Toast.LENGTH_LONG).show();
            }

        });
        }

    }
