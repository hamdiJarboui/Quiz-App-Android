package com.example.quizappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz4 extends AppCompatActivity {
    public static final String SCORE4 =
            "com.example.quizappproject.SCORE4";


    RadioButton reponse14;
    String scorestr;
    int score;
    Button startQuiz5;
    Button return3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        Intent intent1 = getIntent();
        scorestr = intent1.getStringExtra(Quiz3.SCORE3);
        System.out.println(scorestr);
        reponse14 = findViewById(R.id.radioButton14);
        startQuiz5 = findViewById(R.id.startquiz4btn);
        return3=findViewById(R.id.return3);
        return3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToQuiz3=new Intent(Quiz4.this,Quiz3.class);
                startActivity(goToQuiz3);
            }
        });
        startQuiz5.setOnClickListener(v -> {
            Intent goToQuiz3 = new Intent(Quiz4.this, Quiz5.class);
            score = Integer.parseInt(scorestr);
            if (reponse14.isChecked()) {
                score++;
            }

            goToQuiz3.putExtra(SCORE4, String.valueOf(score));
            startActivity(goToQuiz3);
            Log.d("tag", String.valueOf(score));
        });
    }
}