package com.example.dm2.ejerciciopasarinformacion;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ej2_2 extends AppCompatActivity {
    TextView tag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej2_2);

        tag=(TextView)findViewById(R.id.validardatos);
        tag.setBackgroundColor(Color.MAGENTA);

        Bundle extras = getIntent().getExtras();
        String usu = extras.getString("usuario");
        String pass = extras.getString("pass");

        if(usu.equals("david")&&pass.equals("1234"))
            tag.setText("USUARIO Y PASSWORD CORRECTAS");
        else
            tag.setText("USUARIO Y/O PASSWORD INCORRECTAS");
    }
    public void volver(View v){
        finish();
    }
}
