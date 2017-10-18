package com.example.dm2.ejerciciopasarinformacion;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ej1_1 extends Activity {
    EditText nombre;
    EditText apellidos;
    TextView condiciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej1);

        nombre=(EditText) findViewById(R.id.nombre);
        apellidos=(EditText) findViewById(R.id.apellidos);
        condiciones=(TextView)findViewById(R.id.condiciones);

    }
    public void verificar(View v){
        if(nombre.getText().toString().length()>0&&apellidos.getText().toString().length()>0) {
            Intent intent = new Intent(Ej1_1.this, Ej1_2.class);
            intent.putExtra("nombre", nombre.getText().toString());
            intent.putExtra("apellidos", apellidos.getText().toString());
            startActivityForResult(intent,1234);
        }
    }
    public void volver(View v){
        finish();
    }
    protected void onActivityResult (int requestCode, int resultCode,
                                     Intent data){
        if (requestCode==1234 && resultCode==RESULT_OK ) {
            String res = data.getExtras().getString("resultado");
            if(res.equals("ok"))
                condiciones.setText("¿Aceptas condiciones? ACEPTADAS");
            else
                condiciones.setText("¿Aceptas condiciones? RECHAZADAS");
        }
    }

}
