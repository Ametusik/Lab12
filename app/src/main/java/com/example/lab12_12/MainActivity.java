package com.example.lab12_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View v) {
        RadioButton rb = findViewById(R.id.answer4);
        TextView text = findViewById(R.id.answer);

        if(rb.isChecked()) {
            text.setText("Правильно!");
        } else {
            text.setText("Неправильно(");
        }
    }
}