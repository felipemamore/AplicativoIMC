package com.example.ddm31_08_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextPeso, editTextAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPeso=findViewById(R.id.edPeso);
        editTextAltura=findViewById(R.id.edAltura);
    }

    public void abreSegundaActivity(View v){
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("peso", Double.parseDouble(editTextPeso.getText().toString()));
        intent.putExtra("altura", Double.parseDouble(editTextAltura.getText().toString()));

        startActivity(intent);

    }
}