package com.example.dm2.ejerciciopasarinformacion;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Ej4_1 extends AppCompatActivity {
    EditText nombre;
    EditText apellidos;
    RadioButton h;
    RadioButton m;
    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    CheckBox c4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej4_1);
        nombre=(EditText)findViewById(R.id.editnombre);
        apellidos=(EditText)findViewById(R.id.editapellidos);
        h=(RadioButton)findViewById(R.id.hombre);
        m=(RadioButton)findViewById(R.id.mujer);
        c1=(CheckBox)findViewById(R.id.Musica);
        c2=(CheckBox)findViewById(R.id.Lectura);
        c3=(CheckBox)findViewById(R.id.Deportes);
        c4=(CheckBox)findViewById(R.id.Viajar);
    }
    public void enviar(View v){
        if(nombre.getText().toString().length()>0&&apellidos.getText().toString().length()>0&&(h.isChecked()||m.isChecked())&&(c1.isChecked()||c2.isChecked()||c3.isChecked()||c4.isChecked())) {
            Intent intent = new Intent(Ej4_1.this, Ej4_2.class);
            intent.putExtra("nombre", nombre.getText().toString());
            intent.putExtra("apellidos", apellidos.getText().toString());
            if(h.isChecked())
                intent.putExtra("sexo","Hombre");
            else
                intent.putExtra("sexo","Mujer");
            String s="";
            if(c1.isChecked())
                s+="Música ";
            if(c2.isChecked())
              s+="Lectura ";
            if(c3.isChecked())
               s+="Deportes ";
            if(c4.isChecked())
                s+="Viajar ";

            if(s.length()>0)
                intent.putExtra("aficiones",s);



            startActivity(intent);
        }
    }
}
