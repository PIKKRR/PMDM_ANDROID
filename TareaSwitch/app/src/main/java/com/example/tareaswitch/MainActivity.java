package com.example.tareaswitch;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Switch switch1;
    private Switch switch2;
    private Button btnComprobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa las vistas después de setContentView
        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        btnComprobar = findViewById(R.id.Comprobar);

        // Listener del botón
        btnComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comprobarEstado();
            }
        });
    }

    private void comprobarEstado() {
        boolean estadoSwitch1 = switch1.isChecked();
        boolean estadoSwitch2 = switch2.isChecked();

        // Mostrar el estado en un Toast
        String mensaje;
        if (estadoSwitch1) {
            mensaje = "Los datos móviles están activados.";
        } else if (estadoSwitch2) {
            mensaje = "La conexión WIFI está activada.";
        } else if (estadoSwitch1 && estadoSwitch2) {
            mensaje = "Los datos móviles y la conexión WIFI están activados.";
        } else {
            mensaje = "Los datos móviles y la conexión WIFI están desactivados.";
        }

        Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
