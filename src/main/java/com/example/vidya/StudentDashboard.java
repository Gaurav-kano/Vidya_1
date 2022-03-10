package com.example.vidya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class StudentDashboard extends AppCompatActivity {
    private Button button,btn,sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_student_dashboard);

        sign=findViewById(R.id.Out);
        sign.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,MainActivity.class)));

        button = findViewById(R.id.join);
        button.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,VideoActivity.class)));

        btn = findViewById(R.id.Assign);
        btn.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,AssignmentActivity.class)));


        button = findViewById(R.id.join1);
        button.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,VideoActivity.class)));

        btn = findViewById(R.id.Assign1);
        btn.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,AssignmentActivity.class)));


        button = findViewById(R.id.join2);
        button.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,VideoActivity.class)));

        btn = findViewById(R.id.Assign2);
        btn.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,AssignmentActivity.class)));


        button = findViewById(R.id.join3);
        button.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,VideoActivity.class)));

        btn = findViewById(R.id.Assign3);
        btn.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,AssignmentActivity.class)));


        button = findViewById(R.id.join4);
        button.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,VideoActivity.class)));

        btn = findViewById(R.id.Assign4);
        btn.setOnClickListener(v -> startActivity(new Intent(StudentDashboard.this,AssignmentActivity.class)));

    }
}