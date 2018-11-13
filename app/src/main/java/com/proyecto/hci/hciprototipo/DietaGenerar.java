package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DietaGenerar extends AppCompatActivity {

    Button btnCancelar;
    Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_generar);

        btnCancelar = findViewById(R.id.btnCancelar);
        btnAceptar = findViewById(R.id.btnAceptar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietaGenerar.this, DietasPrincipal.class));
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietaGenerar.this, DietaCambios.class));
            }
        });

    }
}
