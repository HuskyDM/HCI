package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class DietaCambios extends AppCompatActivity {

    LinearLayout guardarCambios;
    ImageButton returnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_cambios);

        guardarCambios = findViewById(R.id.guardar_cambios);
        returnbtn = findViewById(R.id.return_button);

        guardarCambios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietaCambios.this, DietasPrincipal.class));
            }
        });

        returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietaCambios.this, DietasPrincipal.class));
            }
        });

    }
}
