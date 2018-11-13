package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class DietaDias extends AppCompatActivity {

    ImageButton returnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int i;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_dias);

        returnbtn = findViewById(R.id.return_button);

        returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietaDias.this, DietasPrincipal.class));
            }
        });

    }
}
