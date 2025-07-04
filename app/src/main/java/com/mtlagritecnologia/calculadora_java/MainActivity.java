package com.mtlagritecnologia.calculadora_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // TextViews
    private TextView txtExpressao, txtResultado;

    // Botões numéricos
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPonto;

    // Botões operacionais
    private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    private Button btnLimpar, btnApagar, btnIgual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkage();


    }

    private void linkage() {
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

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPonto.setOnClickListener(this);

        btnSomar.setOnClickListener(this);
        btnSubtrair.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnLimpar.setOnClickListener(this);

        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView expressao = findViewById(R.id.txtExpressao);
                String string = expressao.getText().toString();
                if (!string.isEmpty()) {
                    byte var0 = 0;
                    int var1 = string.length() - 1;
                    String newExpressao = string.substring(var0, var1);
                    expressao.setText(newExpressao);
                }
                txtResultado.setText(" ");
            }
        });
        btnLimpar.setOnClickListener(v -> {
            txtResultado.setText(" ");
            txtExpressao.setText(" ");
        });
        btnIgual.setOnClickListener(v -> {
            try {
                //responsavelk pelos calculos bibioteca importada
                Expression expression = new ExpressionBuilder(txtExpressao.getText().toString()).build();
                double resultado = expression.evaluate();
                long longResult = (long) resultado;
                if (resultado == (double) longResult) {
                    txtResultado.setText((CharSequence) String.valueOf(longResult));
                } else {
                    txtResultado.setText((CharSequence) String.valueOf(resultado));
                }
            }catch (Exception e){
                e.printStackTrace();
                txtResultado.setText("Erro");
            }
        });

    }

    public void acrescentarExpressao(String string, boolean limpar_dados) {
        if (txtResultado.getText().equals("")) {
            txtExpressao.setText(" ");
        }
        if (limpar_dados) {
            txtResultado.setText(" ");
            txtExpressao.append(string);
        } else {
            txtExpressao.append(txtResultado.getText());
            txtExpressao.append(string);
            txtResultado.setText(" ");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                acrescentarExpressao("0", true);
                break;
            case R.id.btn1:
                acrescentarExpressao("1", true);
                break;
            case R.id.btn2:
                acrescentarExpressao("2", true);
                break;
            case R.id.btn3:
                acrescentarExpressao("3", true);
                break;
            case R.id.btn4:
                acrescentarExpressao("4", true);
                break;
            case R.id.btn5:
                acrescentarExpressao("5", true);
                break;
            case R.id.btn6:
                acrescentarExpressao("6", true);
                break;
            case R.id.btn7:
                acrescentarExpressao("7", true);
                break;
            case R.id.btn8:
                acrescentarExpressao("8", true);
                break;
            case R.id.btn9:
                acrescentarExpressao("9", true);
                break;
            case R.id.btnPonto:
                acrescentarExpressao(".", false);
                break;

            case R.id.btnSomar:
                acrescentarExpressao("+", false);
                break;
            case R.id.btnSubtrair:
                acrescentarExpressao("-", false);
                break;
            case R.id.btnMultiplicar:
                acrescentarExpressao("*", false);
                break;
            case R.id.btnDividir:
                acrescentarExpressao("/", false);
                break;
        }

    }
}