package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextNumber);
        e2 = findViewById(R.id.editTextNumber2);
        t1 = findViewById(R.id.textView);
        t1.setText(" ");
    }
    public void Add(View view){
        String txt1 = e1.getText().toString();
        String txt2 = e2.getText().toString();
        if(txt1.equals(" ")||txt2.equals(" ")){

            Toast.makeText(this, "Enter all numbers", Toast.LENGTH_SHORT).show();
        }
        else {
            float num1 = Float.parseFloat(txt1);
            float num2 = Float.parseFloat(txt2);
            float result = num1 + num2;
            t1.setText("Addition" + result);
        }

    }
    public void Sub(View view){
        String txt1 = e1.getText().toString();
        String txt2 = e2.getText().toString();
        if(txt1.equals(" ") || txt2.equals(" ")){
            Toast.makeText(this, "Enter all numbers", Toast.LENGTH_SHORT).show();
        }
     else {
            float num1 = Float.parseFloat(e1.getText().toString());
            float num2 = Float.parseFloat(e2.getText().toString());
            float result = num1 - num2;
            t1.setText("Substraction" + result);
        }

    }
    public void Mul(View view){
        float num1 = Float.parseFloat(e1.getText().toString());
        float num2 = Float.parseFloat(e2.getText().toString());
        float result = num1*num2;
        t1.setText("Multiplication"+result);

    }
    public void Div(View view){
        float num1 = Float.parseFloat(e1.getText().toString());
        float num2 = Float.parseFloat(e2.getText().toString());
        if(num2==0){
            Toast.makeText(this, "Division by 0 is not allowed", Toast.LENGTH_SHORT).show();
        }
        else {
            float result = num1 / num2;
            t1.setText("Division" + result);
        }

    }
    public void Clr(View view){
        e1.setText(" ");
        e2.setText(" ");
        t1.setText(" ");

    }
}