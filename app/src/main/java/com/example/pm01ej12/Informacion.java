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

        txtNombreI = (EditText) findViewById(R.id.txtNombreI);
        txtApellidoI = (EditText) findViewById(R.id.txtApellidoI);
        txtEdadI = (EditText) findViewById(R.id.txtEdadI);
        txtCorreoI = (EditText) findViewById(R.id.txtCorreoI);

        Button btnRegresar = (Button) findViewById(R.id.btnRegresar);

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