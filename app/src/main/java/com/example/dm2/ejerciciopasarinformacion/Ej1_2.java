package com.example.dm2.ejerciciopasarinformacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ej1_2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej1_2);

        Bundle extras = getIntent().getExtras();
        String nom = extras.getString("nombre");
        String ape = extras.getString("apellidos");


        tv = (TextView)findViewById(R.id.datos);
        tv.setText("¿"+nom+" "+ape+" aceptas las condiciones?");
    }
    public void aceptar(View v){

    }
    public void rechazar(View v){

    }
}
