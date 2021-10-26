package com.example.pm01ej12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Informacion extends AppCompatActivity {

    EditText txtNombreI, txtApellidoI, txtEdadI, txtCorreoI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        txtNombreI = findViewById(R.id.txtNombreI);
        txtApellidoI = findViewById(R.id.txtApellidoI);
        txtEdadI = findViewById(R.id.txtEdadI);
        txtCorreoI = findViewById(R.id.txtCorreoI);

        Button btnRegresar = findViewById(R.id.btnRegresar);

        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        txtNombreI.setText(txtNombreI.toString());
        txtApellidoI.setText(txtApellidoI.toString());
        txtEdadI.setText(txtEdadI.toString());
        txtCorreoI.setText(txtCorreoI.toString());
    }
}