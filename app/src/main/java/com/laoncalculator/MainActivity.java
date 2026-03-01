package com.laoncalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2, input3;
    Button btnCalculateSimpleInterest, btnCaclulateLoanRepayment, btnQuit;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        btnCalculateSimpleInterest = findViewById(R.id.btnCalculateSimpleInterest);
        btnCaclulateLoanRepayment = findViewById(R.id.btnCaclulateLoanRepayment);
        btnQuit = findViewById(R.id.btnQuit);
        results = findViewById(R.id.results);

        btnCalculateSimpleInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getBtnCalculateSimpleInterest();
            }
        });

        btnCaclulateLoanRepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getBtnCaclulateLoanRepayment();
            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                getBtnQuit();
            }
        });

    }

    public void getBtnCalculateSimpleInterest() {
        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());
        int num3 = Integer.parseInt(input3.getText().toString());
        int interest = (num1 * num2 * num3) / 100;
        results.setText("Simple interest: " + interest);
    }

    public void getBtnCaclulateLoanRepayment() {
        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());
        int num3 = Integer.parseInt(input3.getText().toString());
        int interest = (num1 * num2 * num3) / 100;
        int loan = (interest + num1) / (num3 * 12);
        results.setText("Monthly Installment: " + loan);
    }

    public void getBtnQuit() {
        System.exit(0);
    }
}