package com.example.theweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText cityField;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityField = findViewById(R.id.cityField);
        submitButton = findViewById(R.id.getWeatherButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!cityField.getText().toString().isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, WeatherData.class);
                    intent.putExtra("cityName", cityField.getText().toString().trim());
                    startActivity(intent);
                }
            }
        });

    }
}
