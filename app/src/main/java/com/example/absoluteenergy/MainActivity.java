package com.example.absoluteenergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText massIn;
    private Button button;
    private TextView energyOut;

    private String mass = "";

    Algorithm algorithm = new Algorithm();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        massIn = findViewById(R.id.massIn); // поле ввода
        button = findViewById(R.id.button); // кнопка обработки
        energyOut = findViewById(R.id.energyOut); // поле вывода

        // выполнение действий при нажании кнопки
        button.setOnClickListener(listener); // обработка нажатия кнопки
    }

    // объект обработки нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание введённого значения
            mass = massIn.getText().toString();

            // вывод полученной информации на экран
            energyOut.setText("Понадобится " + algorithm.fuel(mass) + " киллограм топлива");
        }
    };
}