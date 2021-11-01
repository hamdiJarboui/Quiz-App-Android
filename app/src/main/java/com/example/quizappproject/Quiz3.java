package com.example.quizappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity {
    public static final String SCORE3 =
            "com.example.quizappproject.SCORE4";


    RadioButton reponse13;
    String scorestr;
    int score;
    Button startQuiz4;
    Button return1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        Intent intent1 = getIntent();
        scorestr = intent1.getStringExtra(Quiz2.SCORE2);
        reponse13 = findViewById(R.id.radioButton13);
        startQuiz4 = findViewById(R.id.startquiz4btn);
        return1=findViewById(R.id.return2);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToQuiz2=new Intent(Quiz3.this,Quiz2.class);
                startActivity(goToQuiz2);
            }
        });
        startQuiz4.setOnClickListener(v -> {
            Intent goToQuiz3 = new Intent(Quiz3.this, Quiz4.class);
            score = Integer.parseInt(scorestr);
            System.out.println(score);
            if (reponse13.isChecked()) {
                score++;
            }

            goToQuiz3.putExtra(SCORE3, String.valueOf(score));

            startActivity(goToQuiz3);

        });
    }
}