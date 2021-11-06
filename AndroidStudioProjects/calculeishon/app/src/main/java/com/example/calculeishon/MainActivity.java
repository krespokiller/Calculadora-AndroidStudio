package com.example.calculeishon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView Resultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultado = findViewById(R.id.Resultado);
    }
    public void EscribirCero(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("0");
        }else{
            Resultado.setText(Resultado.getText() + "0");
        }
    }
    public void EscribirUno(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("1");
        }else{
            Resultado.setText(Resultado.getText() + "1");
        }
    }

    public void EscribirDos(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("2");
        }else{
            Resultado.setText(Resultado.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("3");
        }else{
            Resultado.setText(Resultado.getText() + "3");
        }
    }

    public void EscribirCuatro(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("4");
        }else{
            Resultado.setText(Resultado.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("5");
        }else{
            Resultado.setText(Resultado.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("6");
        }else{
            Resultado.setText(Resultado.getText() + "6");
        }
    }

    public void EscribirSiete(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("7");
        }else{
            Resultado.setText(Resultado.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("8");
        }else{
            Resultado.setText(Resultado.getText() + "8");
        }
    }

    public void EscribirNueve(View view) {
        float valor = Float.parseFloat(Resultado.getText().toString());
        if(valor == 0.0f){
            Resultado.setText("9");
        }else{
            Resultado.setText(Resultado.getText() + "9");
        }
    }
    public void LimpiarResultado(View view) {
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        Resultado.setText("0");
    }
    public void CambioSigno(View view) {
        float valor = Float.parseFloat(String.valueOf(Resultado.getText()));
        valor = valor * -1.0f;
        Resultado.setText("" + valor);
    }

    public void OperacionDividir(View view) {
        numero1 = Float.parseFloat(String.valueOf(Resultado.getText()));
        operacion = "/";
        Resultado.setText("0");
    }

    public void OperacionMulti(View view) {
        numero1 = Float.parseFloat(String.valueOf(Resultado.getText()));
        operacion = "*";
        Resultado.setText("0");
    }

    public void OperacionMenos(View view) {
        numero1 = Float.parseFloat(String.valueOf(Resultado.getText()));
        operacion = "-";
        Resultado.setText("0");
    }

    public void OperacionMas(View view) {
        numero1 = Float.parseFloat(String.valueOf(Resultado.getText()));
        operacion = "+";
        Resultado.setText("0");
    }
    public void EscribirPunto(View view) {
        if( !String.valueOf(Resultado.getText()).contains(".") ){
            Resultado.setText(Resultado.getText() + ".");
        }
    }
    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(String.valueOf(Resultado.getText()));
        float result = 0.0f;

        if(operacion.equals("%")){
            result = (numero1 / 100.0f) * numero2;
        }if(operacion.equals("/")){
            if(numero2 != 0.0f){
                result = numero1 / numero2;
            }else{
                result = 0.0f;
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }
        }else if(operacion.equals("*")){
            result = numero1 * numero2;
        }else if(operacion.equals("-")){
            result = numero1 - numero2;
        }else if(operacion.equals("+")){
            result = numero1 + numero2;
        }

        Resultado.setText(result + "");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }
}