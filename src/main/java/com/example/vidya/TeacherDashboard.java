package com.example.vidya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class TeacherDashboard extends AppCompatActivity {
    private Button button1,btn1,sign1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_teacher_dashboard);

        sign1= findViewById(R.id.SOut);
        sign1.setOnClickListener(v -> startActivity(new Intent(TeacherDashboard.this,MainActivity.class)));

        button1 = findViewById(R.id.joins);
        button1.setOnClickListener(v -> startActivity(new Intent(TeacherDashboard.this,VideoActivity.class)));

        btn1 = findViewById(R.id.Assigns);
        btn1.setOnClickListener(v -> startActivity(new Intent(TeacherDashboard.this,AssignmentActivity.class)));

        button1 = findViewById(R.id.joins1);
        button1.setOnClickListener(v -> startActivity(new Intent(TeacherDashboard.this,VideoActivity.class)));

        btn1 = findViewById(R.id.Assigns1);
        btn1.setOnClickListener(v -> startActivity(new Intent(TeacherDashboard.this,AssignmentActivity.class)));


    }
}