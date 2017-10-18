package com.example.dm2.ejerciciopasarinformacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ej2_1 extends AppCompatActivity {

    EditText usuario;
    EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej2);
        usuario=(EditText)findViewById(R.id.usuario);
        pass=(EditText)findViewById(R.id.pass);
    }
    public void iniciar(View v){
        if(usuario.getText().toString().length()>0&&pass.getText().toString().length()>0) {
            Intent intent = new Intent(Ej2_1.this, Ej2_2.class);
            intent.putExtra("usuario", usuario.getText().toString());
            intent.putExtra("pass", pass.getText().toString());
            startActivity(intent);
        }
    }
}
