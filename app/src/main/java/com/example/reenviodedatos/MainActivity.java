package com.example.reenviodedatos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre, edtApellido;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellido);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos();
            }
        });
    }

    public void enviarDatos() {

        String nombre = edtNombre.getText().toString();
        String apellido = edtApellido.getText().toString();

        Intent intent = new Intent(MainActivity.this, SegundaActivity.class);

        intent.putExtra("nombre", nombre);
        intent.putExtra("apellido", apellido);

        startActivity(intent);
    }
}