package com.tanumishra.convertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText EnterNum;
    Button meter;
    Button centimeter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        EnterNum = findViewById(R.id.editTextNumberDecimal);
        meter = findViewById(R.id.meter);
        centimeter = findViewById(R.id.centimeter);

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double meter = ((double)number / 100);
                output.setText("Value in meters: " + meter);
            }
        });

        centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float centimeter = (number * 100);
                output.setText("Value in Centimeters: " + centimeter);
            }
        });
    }
}