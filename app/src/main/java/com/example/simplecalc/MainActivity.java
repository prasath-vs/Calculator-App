package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculation(View v){
        EditText t1 = findViewById(R.id.n1);
        EditText t2 = findViewById(R.id.n2);
        Button bt1 = findViewById(R.id.b1);
        Button bt2 = findViewById(R.id.b2);
        Button bt3 = findViewById(R.id.b3);
        Button bt4 = findViewById(R.id.b4);
        TextView res = findViewById(R.id.ans);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
                }
                else if (t2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    float a, b, c;
                    a = Float.parseFloat(t1.getText().toString());
                    b = Float.parseFloat(t2.getText().toString());
                    c = a + b;
                    res.setText("Addition = " + c);
                }
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
                }
                else if (t2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    float a, b, c;
                    a = Float.parseFloat(t1.getText().toString());
                    b = Float.parseFloat(t2.getText().toString());
                    c = a - b;
                    res.setText("Subtraction = " + c);
                }
            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
                }
                else if (t2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    float a, b, c;
                    a = Float.parseFloat(t1.getText().toString());
                    b = Float.parseFloat(t2.getText().toString());
                    c = a * b;
                    res.setText("Multiplication = " + c);
                }
            }
        });


        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
                }
                else if (t2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    float a, b, c;
                    a = Float.parseFloat(t1.getText().toString());
                    b = Float.parseFloat(t2.getText().toString());
                    c = a / b;
                    res.setText("Division = " + c);
                }
            }
        });
    }
}