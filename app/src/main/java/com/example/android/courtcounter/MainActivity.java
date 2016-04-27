package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0,scoreb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void suma3(View v){
        score+=3;
        displayForTeamA(score);
    }
    public void suma2(View v){
        score+=2;
        displayForTeamA(score);
    }public void suma1(View v){
        score+=1;
        displayForTeamA(score);
    }
    public void suma3b(View v){
        scoreb+=3;
        displayForTeamB(scoreb);
    }
    public void suma2b(View v){
        scoreb+=2;
        displayForTeamB(scoreb);
    }public void suma1b(View v){
        scoreb+=1;
        displayForTeamB(scoreb);
    }
    public void reset(View v){
        score=0;
        scoreb=0;
        displayForTeamA(0);
        displayForTeamB(0);

    }

}
