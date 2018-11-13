package com.proyecto.hci.hciprototipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContenidoActual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_actual);

        ImageButton btn_zana = (ImageButton)findViewById(R.id.btn_zanahoria);
        ImageButton btn_return = findViewById(R.id.btn_return);
        Button btn_historial = findViewById(R.id.btn_hist);

        btn_zana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContenidoActual.this, ContenidoEstante.class));
            }
        });

        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { finish();
            }
        });
        btn_historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContenidoActual.this, ContenidoHistorial.class));
            }
        });
    }
}
