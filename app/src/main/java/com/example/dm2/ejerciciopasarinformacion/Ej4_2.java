package com.example.dm2.ejerciciopasarinformacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ej4_2 extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej4_2);

        t=(TextView)findViewById(R.id.datos);

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellidos = extras.getString("apellidos");
        String sexo= extras.getString("sexo");
        String aficiones=extras.getString("aficiones");
        t.setText(nombre+"\n"+apellidos+"\n"+sexo+"\n"+aficiones);

    }
}
