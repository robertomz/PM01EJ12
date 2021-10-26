package com.example.pm01ej12;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtApellido, txtEdad, txtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtApellido = (EditText) findViewById(R.id.txtApellido);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);

        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Informacion.class);

            intent.putExtra("Nombre", txtNombre.getText().toString());
            intent.putExtra("Apellido", txtApellido.getText().toString());
            intent.putExtra("Edadd", txtEdad.getText().toString());
            intent.putExtra("Correo", txtCorreo.getText().toString());

            startActivity(intent);
        });
    }
}