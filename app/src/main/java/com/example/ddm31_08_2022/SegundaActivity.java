package com.example.ddm31_08_2022;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.text.DecimalFormat;

public class SegundaActivity extends Activity {
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        textView = findViewById(R.id.textView2);
        Double peso = getIntent().getExtras().getDouble("peso");
        Double altura = getIntent().getExtras().getDouble("altura");
        Log.d("imc",Double.toString (calculaIMC(peso, altura)));

        Double converte = (calculaIMC(peso, altura));
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("IMC: ##.##");
        textView.setText((decimalFormat.format(converte)));

    }
    public Double calculaIMC(Double peso, Double altura){
        return peso/(altura*altura) ;
    }
}
