package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DietasPrincipal extends AppCompatActivity {

    LinearLayout dieta1;
    LinearLayout dietaCalorias;
    LinearLayout agregarDieta;
    ImageView deleteDieta1;
    ImageButton returnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietas_principal);

        dieta1 = findViewById(R.id.dieta1);
        dietaCalorias = findViewById(R.id.dietaCalorias);
        agregarDieta = findViewById(R.id.agregar_dieta);
        deleteDieta1 = findViewById(R.id.delete_dieta1);
        returnbtn = findViewById(R.id.return_button);

        agregarDieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietasPrincipal.this, DietaGenerar.class));
            }
        });

        dieta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietasPrincipal.this, DietaVista.class));
            }
        });

        dietaCalorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietasPrincipal.this, DietaDias.class));
            }
        });

        /**
         * Cuando se presiona el basurero, se hace invisible la dieta1
         */
        deleteDieta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dieta1.setVisibility(View.GONE);
            }
        });

        returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietasPrincipal.this, MainActivity.class));
            }
        });

    }
}
