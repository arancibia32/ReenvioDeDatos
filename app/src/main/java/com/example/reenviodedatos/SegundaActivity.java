package com.example.reenviodedatos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    TextView txtNombre, txtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);

        Intent intent = getIntent();

        String nombre = intent.getStringExtra("nombre");
        String apellido = intent.getStringExtra("apellido");

        txtNombre.setText("Nombre: " + nombre);
        txtApellido.setText("Apellido: " + apellido);
    }
}

//holaaa