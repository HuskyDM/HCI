package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_contenidos = (Button) findViewById(R.id.btn_contenidos);

        btn_contenidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContenidoActual.class));
            }
        });

        Button btn_temp = (Button) findViewById(R.id.btn_temperatura);

        btn_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (MainActivity.this, Temperatura.class));
            }
        });
        Button btn_dieta = (Button) findViewById(R.id.btn_dieta);

        btn_dieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DietasPrincipal.class));
            }
        });
    }
}
