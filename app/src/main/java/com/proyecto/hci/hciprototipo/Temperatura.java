package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Temperatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
    Button btn_11 = findViewById(R.id.btn_11);
    Button btn_12 = findViewById(R.id.btn_12);
    Button btn_cont = findViewById(R.id.btn_contenido);
    ImageButton return_button = findViewById(R.id.return_button);
    final Button btn_center_6=findViewById(R.id.btn_center_6);

    btn_11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String number=(String)btn_center_6.getText();
            int trans = Integer.parseInt(number);
            trans-=2;
            String newNumber = Integer.toString(trans);
            btn_center_6.setText(newNumber);
        }
    });

    btn_12.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String number=(String)btn_center_6.getText();
            int trans = Integer.parseInt(number);
            trans+=2;
            String newNumber = Integer.toString(trans);
            btn_center_6.setText(newNumber);
        }
    });
    return_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //startActivity(new Intent(Temperatura.this, MainActivity.class));
           finish();
        }
    });
    btn_cont.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Temperatura.this,ContenidoHistorial.class));
        }
    });

    }
}
