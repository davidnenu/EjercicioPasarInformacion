package com.example.dm2.ejerciciopasarinformacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ej3_1 extends AppCompatActivity {

    EditText s1;
    EditText s2;
    EditText si;
    TextView t1;
    TextView t2;
    int i=0,c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej3_1);

        s1=(EditText)findViewById(R.id.suma1);
        s2=(EditText)findViewById(R.id.suma2);
        s1.setEnabled(false);
        s2.setEnabled(false);
        si=(EditText)findViewById(R.id.sumaigual);
        t1=(TextView)findViewById(R.id.correctas);
        t2=(TextView)findViewById(R.id.incorrectas);

        s1.setText(String.valueOf((int)(Math.random()*100)));
        s2.setText(String.valueOf((int)(Math.random()*100)));
    }
    public void sumar(View v){
        if(si.getText().toString().length()>0) {
            Intent intent = new Intent(Ej3_1.this, Ej3_2.class);
            intent.putExtra("s1", Integer.parseInt(s1.getText().toString()));
            intent.putExtra("s2", Integer.parseInt(s2.getText().toString()));
            intent.putExtra("si", Integer.parseInt(si.getText().toString()));
            startActivityForResult(intent,1234);
        }
        
    }
    protected void onActivityResult (int requestCode, int resultCode,
                                     Intent data){
        si.setText("");
        s1.setText(String.valueOf((int)(Math.random()*100)));
        s2.setText(String.valueOf((int)(Math.random()*100)));
        if (requestCode==1234 && resultCode==RESULT_OK ) {
            String res = data.getExtras().getString("resultado");
            if(res.equals("true"))
                t1.setText("CORRECTAS: "+(c+1));
            else
            t2.setText("INCORRECTAS: "+(i+1));
        }
    }

}
