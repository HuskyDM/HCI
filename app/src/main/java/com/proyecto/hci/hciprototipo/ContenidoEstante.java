package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContenidoEstante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_estante);

        ImageButton btn_zana = findViewById(R.id.btn_zanahoria);
        Button btn_hist = findViewById(R.id.btn_hist);
        ImageButton btn_ret = findViewById(R.id.btn_return);

        btn_zana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContenidoEstante.this, ContenidoObjeto.class));
            }
        });

        btn_hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContenidoEstante.this, ContenidoHistorial.class));
            }
        });

        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
