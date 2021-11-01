package com.example.quizappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz5 extends AppCompatActivity {

    public static final String SCORE5 =
            "com.example.quizappproject.SCORE4";


    RadioButton reponse15;

    String scorestr;
    int score;
    Button startQuiz5;
    Button return4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        Intent intent1 = getIntent();
        scorestr = intent1.getStringExtra(Quiz4.SCORE4);
        System.out.println(scorestr);
        reponse15 = findViewById(R.id.radioButton15);
        startQuiz5 = findViewById(R.id.startquiz5btn);
        return4=findViewById(R.id.return4);
        return4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToQuiz4=new Intent(Quiz5.this,Quiz4.class);
                startActivity(goToQuiz4);
            }
        });
        startQuiz5.setOnClickListener(v -> {
            Intent goToQuiz3 = new Intent(Quiz5.this, Result.class);
            score = Integer.parseInt(scorestr);
            if (reponse15.isChecked()) {
                score++;
            }

            goToQuiz3.putExtra(SCORE5, String.valueOf(score));
            startActivity(goToQuiz3);
            Log.d("tag", String.valueOf(score));
        });
    }
}