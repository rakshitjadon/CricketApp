package com.example.android.cricket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    int wicketsTeamA=0;
    int wicketsTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOneForTeamA(View v) {
        if (wicketsTeamA<10)
            scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    /**
     *
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        if (wicketsTeamA<10)
            scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        if (wicketsTeamA<10)
            scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addFourForTeamA(View v) {
        if (wicketsTeamA<10)
            scoreTeamA=scoreTeamA+4;
        displayForTeamA(scoreTeamA);
    }
    public void addSixForTeamA(View v) {
        if (wicketsTeamA<10)
            scoreTeamA=scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


        /**
         * Displays the given score for Team A.
         */


    public void resetScore(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        wicketsTeamA=0;
        wicketsTeamB=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayWicketsForTeamA(wicketsTeamA);
        displayWicketsForTeamB(wicketsTeamB);
    }
    public void addOneForTeamB(View v) {
        if (wicketsTeamB<10)
            scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addSixForTeamB(View v) {
        if (wicketsTeamB<10)
            scoreTeamB=scoreTeamB+6;
        displayForTeamB(scoreTeamB);    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addFourForTeamB(View v) {
        if (wicketsTeamB<10)
            scoreTeamB=scoreTeamB+4;
        displayForTeamB(scoreTeamB);
    }

    /**
     *
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        if (wicketsTeamB<10)
            scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        if (wicketsTeamB<10)
            scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void wicketsOfTeamA(View v) {
        if (wicketsTeamA < 10) {
            wicketsTeamA = wicketsTeamA + 1;
            displayWicketsForTeamA(wicketsTeamA);
        }
    }
    public void displayWicketsForTeamA(int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wickets);
        scoreView.setText(String.valueOf(wickets));

    }
    public void wicketsOfTeamB(View v){
        if (wicketsTeamB<10)
            wicketsTeamB = wicketsTeamB + 1;
        displayWicketsForTeamB(wicketsTeamB);
    }
    public void displayWicketsForTeamB(int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wickets);
        scoreView.setText(String.valueOf(wickets));

    }
}
