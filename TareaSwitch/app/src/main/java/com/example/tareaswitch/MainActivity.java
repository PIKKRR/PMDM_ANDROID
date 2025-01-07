package com.example.tareaswitch;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declarar las variables para los switches y el botón

    private Switch switch1, switch2;
    private Button btnComprobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciar los elementos del diseño

        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        btnComprobar = findViewById(R.id.Comprobar);

        // Configurar la acción del botón

        btnComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comprobarEstado();
            }
        });
    }

    // Método para comprobar el estado de los Switches
    private void comprobarEstado() {
        boolean estadoSwitch1 = switch1.isChecked();
        boolean estadoSwitch2 = switch2.isChecked();

        // Crear un mensaje según los estados de los switches
        String mensaje1 = "Los datos móviles están activados y la conexión WIFI está desactivada.";
        String mensaje2 = "Los datos móviles están desactivados y la conexión WIFI está activada.";
        String mensaje3 = "Los datos móviles y la conexión WIFI están activados.";
        String mensaje4 = "Los datos móviles y la conexión WIFI están desactivados.";



        // Mostrar el mensaje en un Toast

        if (estadoSwitch1 && !estadoSwitch2) {
            Toast.makeText(this, mensaje1, Toast.LENGTH_SHORT).show();
        } else if (!estadoSwitch1 && estadoSwitch2) {
            Toast.makeText(this, mensaje2, Toast.LENGTH_SHORT).show();
        } else if (estadoSwitch1 && estadoSwitch2) {
            Toast.makeText(this, mensaje3, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, mensaje4, Toast.LENGTH_SHORT).show();
        }
    }
}