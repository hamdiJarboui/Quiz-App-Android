package com.example.quizappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    String scorestr;
    TextView result;
    Button startQuiz5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent1 = getIntent();
        scorestr = intent1.getStringExtra(Quiz3.SCORE3);
        System.out.println(scorestr);
        //recupération des messages
        result = findViewById(R.id.resultFinal);
        result.setText(scorestr);
        startQuiz5 = findViewById(R.id.goToMain);
        startQuiz5.setOnClickListener(v -> {
            Intent goToMain = new Intent(Result.this, MainActivity.class);
            startActivity(goToMain);

        });
    }
}