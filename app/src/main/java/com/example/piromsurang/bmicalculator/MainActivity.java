package com.example.piromsurang.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.nio.DoubleBuffer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        EditText hEdit = (EditText) findViewById(R.id.inputHeight);
        EditText wEdit = (EditText) findViewById(R.id.inputWeight);
        TextView result = (TextView) findViewById(R.id.result);
        ImageView image = (ImageView) findViewById(R.id.imageView);

        double height = Double.parseDouble(hEdit.getText().toString());
        double weight = Double.parseDouble(wEdit.getText().toString());
        double bmi = weight / (height*height);

        result.setText(String.format("Your BMI is %.2f", bmi));

        if(bmi < 22) {
            image.setImageResource(R.drawable.underweight);
        } else if(bmi < 31) {
            image.setImageResource(R.drawable.healthy);
        } else {
            image.setImageResource(R.drawable.overweight);
        }
    }
}
