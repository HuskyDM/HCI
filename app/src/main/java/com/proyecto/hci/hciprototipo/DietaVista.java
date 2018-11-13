package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class DietaVista extends AppCompatActivity {

    LinearLayout modificar;
    ImageButton returnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_vista);

        modificar = findViewById(R.id.modificar);
        returnbtn = findViewById(R.id.return_button);

        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietaVista.this, DietaCambios.class));
            }
        });

        returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietaVista.this, DietasPrincipal.class));
            }
        });

    }
}
