package com.example.quizappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz1 extends AppCompatActivity {
    public static final String SCORE1 =
            "com.example.quizappproject.SCORE1";

    RadioButton reponse1;
    Button startQuiz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        reponse1=findViewById(R.id.reponse1);
        startQuiz2=findViewById(R.id.startQuiz2btn);
        startQuiz2.setOnClickListener(v -> {
            Intent goToQuiz2=new Intent(Quiz1.this,Quiz2.class);
            int score = 0;
            if (reponse1.isChecked()) {
                score++;
            }
            goToQuiz2.putExtra(SCORE1, String.valueOf(score));
            startActivity(goToQuiz2);
        });
    }

}