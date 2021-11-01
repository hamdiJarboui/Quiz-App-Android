package com.example.quizappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


import android.view.View;
import android.widget.Button;

import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz2 extends AppCompatActivity {
    public static final String SCORE2=
            "com.example.quizappproject.SCORE2";

    RadioButton reponse12;
    String scorestr;
    int score;
    Button startQuiz3;
    Button return1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        Intent intent1 = getIntent();
        scorestr = intent1.getStringExtra(Quiz1.SCORE1);
        reponse12 =findViewById(R.id.radioButton1);
        startQuiz3=findViewById(R.id.startquiz3btn);
        return1=findViewById(R.id.return1);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToQuiz1=new Intent(Quiz2.this,Quiz1.class);
                startActivity(goToQuiz1);
            }
        });
        startQuiz3.setOnClickListener(v -> {
            Intent goToQuiz3=new Intent(Quiz2.this,Quiz3.class);
            score=Integer.parseInt(scorestr);
            if (reponse12.isChecked()) {
                score++;
            }

            goToQuiz3.putExtra(SCORE2, String.valueOf(score));
            startActivity(goToQuiz3);
            Log.d("tag",String.valueOf(score));
        });


    }


}