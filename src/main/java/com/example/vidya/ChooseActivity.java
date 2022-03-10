package com.example.vidya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {
    public Button button2 , btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choose);

        button2 = findViewById(R.id.Teacher_btn);
        button2.setOnClickListener(v -> {
            int oneInt = 1;
            Intent myIntent = new Intent(ChooseActivity.this, LoginActivity.class);
            myIntent.putExtra("yourIntName", oneInt);
            startActivity(myIntent);
        });

        btn2 = findViewById(R.id.Student_btn);
        btn2.setOnClickListener(v -> {
            int oneInt = 2;
            Intent myIntent = new Intent(ChooseActivity.this, LoginActivity.class);
            myIntent.putExtra("yourIntName", oneInt);
            startActivity(myIntent);
        });
    }

    }




