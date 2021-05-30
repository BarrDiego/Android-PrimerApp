package com.educacionit.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numA;
    private EditText numB;
    private TextView resultado;

    private Button suma;
    private Button resta;
    private Button multi;
    private Button div;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numA = findViewById(R.id.numA);
        numB = findViewById(R.id.numB);
        resultado = findViewById(R.id.resultado);


        suma = findViewById(R.id.botSuma);
        resta = findViewById(R.id.botResta);
        multi = findViewById(R.id.botMult);
        div = findViewById(R.id.botDiv);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String num1 = numA.getText().toString();
                    String num2 = numB.getText().toString();

                    if (num1.isEmpty() || num2.isEmpty()){
                        Toast toast = Toast.makeText(getApplicationContext(), "Ingrese los respectivos Numeros", Toast.LENGTH_LONG);
                        toast.show();

                    }else{

                    Integer numUno = Integer.parseInt(num1);
                    Integer numDos = Integer.parseInt(num2);

                    int result = numUno + numDos;
                    String getResult = Integer.toString(result);
                    resultado.setText(getResult);
                }
                }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numA.getText().toString();
                String num2 = numB.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Ingrese los respectivos Numeros", Toast.LENGTH_LONG);
                    toast.show();

                }else{

                    Integer numUno = Integer.parseInt(num1);
                    Integer numDos = Integer.parseInt(num2);

                    int result = numUno - numDos;
                    String getResult = Integer.toString(result);
                    resultado.setText(getResult);

                }
            }

        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numA.getText().toString();
                String num2 = numB.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Ingrese los respectivos Numeros", Toast.LENGTH_LONG);
                    toast.show();

                }else{
                    Double numUno = Double.parseDouble(num1);
                    Double numDos = Double.parseDouble(num2);

                    Double result = numUno * numDos;
                    String getResult = Double.toString(result);
                    resultado.setText(getResult);

                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numA.getText().toString();
                String num2 = numB.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Ingrese los respectivos Numeros", Toast.LENGTH_LONG);
                    toast.show();
                }else{
                    Double numUno = Double.parseDouble(num1);
                    Double numDos = Double.parseDouble(num2);
                    if(numDos == 0){
                        Toast toast = Toast.makeText(getApplicationContext(), "No se puede Dividir por Cero", Toast.LENGTH_LONG);
                        toast.show();
                    }else{
                    Double result = numUno / numDos;
                    String getResult = Double.toString(result);
                    resultado.setText(getResult);
                    }

                }
            }
        });





    }
}