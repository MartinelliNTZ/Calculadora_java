package com.mtlagritecnologia.calculadora_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // TextViews
    TextView txtExpressao;
    TextView txtResultado;

    // Botões numéricos
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPonto;

    // Botões operacionais
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    Button btnLimpar, btnApagar, btnIgual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkage();
    }
    public void linkage(){
        // TextViews
        txtExpressao = findViewById(R.id.txtExpressao);
        txtResultado = findViewById(R.id.txtResultado);

        // Botões numéricos
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPonto = findViewById(R.id.btnPonto);

        // Botões operacionais
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnApagar = findViewById(R.id.btnApagar);
        btnIgual = findViewById(R.id.btnIgual);
    }
}