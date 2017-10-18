package com.example.dm2.ejerciciopasarinformacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Ej3_2 extends AppCompatActivity {

    TextView t;
    Button b;
    int s1;
    int s2;
    int si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej3_2);

        t=(TextView)findViewById(R.id.larespuestaes);
        b=(Button)findViewById(R.id.volver);

        Bundle extras = getIntent().getExtras();
        s1 = extras.getInt("s1");
        s2 = extras.getInt("s2");
        si = extras.getInt("si");

        if(s1+s2==si){
            t.setText("EL RESULTADO ES CORRECTO");
        }
        else{
            t.setText("EL RESULTADO ES INCORRECTO");
        }



    }
    public void volver(View v){
        if(s1+s2==si){
            Intent intent = new Intent();
            intent.putExtra("resultado", "true");
            setResult(RESULT_OK, intent);

        }
        else{
            Intent intent = new Intent();
            intent.putExtra("resultado", "false");
            setResult(RESULT_OK, intent);

        }
        finish();

    }
}
