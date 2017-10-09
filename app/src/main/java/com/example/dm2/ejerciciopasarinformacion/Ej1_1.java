package com.example.dm2.ejerciciopasarinformacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ej1_1 extends AppCompatActivity {
    EditText nombre;
    EditText apellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej1);

        nombre=(EditText) findViewById(R.id.nombre);
        apellidos=(EditText) findViewById(R.id.apellidos);

    }
    public void verificar(View v){
        if(nombre.getText().toString().length()>0&&apellidos.getText().toString().length()>0) {
            Intent intent = new Intent(Ej1_1.this, Ej1_2.class);
            intent.putExtra("nombre", nombre.getText().toString());
            intent.putExtra("apellidos", apellidos.getText().toString());
            startActivity(intent);
        }
    }
}
