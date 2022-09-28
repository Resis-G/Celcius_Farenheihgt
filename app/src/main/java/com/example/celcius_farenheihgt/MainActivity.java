package com.example.celcius_farenheihgt;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void Pasar_Kelvin_Farenheight(View view){
        EditText etCelcius = findViewById(R.id.etCelcius);
        TextView tvKelvin = findViewById(R.id.tvKelvin);
        TextView tvFarenheight = findViewById(R.id.tvFarenheight);


        String Texto_Caja = String.valueOf(etCelcius.getText());
        if (Texto_Caja.isEmpty()){
            Toast.makeText(this, "Escribe un número porfavor", Toast.LENGTH_SHORT).show();
        }else{
            double Celcius = Double.parseDouble(Texto_Caja);
            double Kelvin = Celcius + 273.15;
            double farenheight = (9*(Celcius)/5)+32;

            tvFarenheight.setText("Grados Farenheight = "+ farenheight);
            tvKelvin.setText("Grados Kelvin = "+ Kelvin);
        }



    }
}