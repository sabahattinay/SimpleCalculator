package com.sabahattin.simplecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    @SuppressLint("SetTextI18n")
    public void sum(View view) {

        if (!number1Text.getText().toString().isEmpty() && !number2Text.getText().toString().isEmpty()) {
            try {
                int number1 = Integer.parseInt(number1Text.getText().toString());
                int number2 = Integer.parseInt(number2Text.getText().toString());

                int result = number1 + number2;

                resultText.setText("Result: " + result);
            } catch (NumberFormatException e) {
                resultText.setText("Please enter valid numbers");
            }
        } else {
            resultText.setText("Please enter numbers in both fields");
        }


        /*
        idk why application is stopping with this code, maybe app cant catch the null




        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 + number2;

        resultText.setText("Result: " + result);




         */


    }

    public void deduct(View view){

        if (!number1Text.getText().toString().isEmpty() && !number2Text.getText().toString().isEmpty()) {
            try {
                int number1 = Integer.parseInt(number1Text.getText().toString());
                int number2 = Integer.parseInt(number2Text.getText().toString());

                int result = number1 - number2;

                resultText.setText("Result: " + result);
            } catch (NumberFormatException e) {
                resultText.setText("Please enter valid numbers");
            }
        } else {
            resultText.setText("Please enter numbers in both fields");
        }

    }

    public void multiply(View view){

        if (!number1Text.getText().toString().isEmpty() && !number2Text.getText().toString().isEmpty()) {
            try {
                int number1 = Integer.parseInt(number1Text.getText().toString());
                int number2 = Integer.parseInt(number2Text.getText().toString());

                int result = number1 * number2;

                resultText.setText("Result: " + result);
            } catch (NumberFormatException e) {
                resultText.setText("Please enter valid numbers");
            }
        } else {
            resultText.setText("Please enter numbers in both fields");
        }



    }

    public void divide(View view) {

        if (!number1Text.getText().toString().isEmpty() && !number2Text.getText().toString().isEmpty()) {
            try {
                int number1 = Integer.parseInt(number1Text.getText().toString());
                int number2 = Integer.parseInt(number2Text.getText().toString());

                int result = number1 / number2;

                resultText.setText("Result: " + result);
            } catch (NumberFormatException e) {
                resultText.setText("Please enter valid numbers");
            }
        } else {
            resultText.setText("Please enter numbers in both fields");
        }



    }







}


