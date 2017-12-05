package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Tracks team A score
    int pointsScored_a = 0;

    //Tracks team B score
    int pointsScored_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * TEAM A
     */


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add button Add +3 interactivity
     */
    public void addThreePoints_a (View view) {
        displayForTeamA(pointsScored_a = pointsScored_a + 3);
    }
    /**
     * Add button Add +2 interactivity
     */
    public void addTwoPoints_a (View view) {
        displayForTeamA(pointsScored_a = pointsScored_a + 2);
    }

    /**
     * Add button Add +3 interactivity
     */
    public void addFreeThrow_a (View view) {
        displayForTeamA(pointsScored_a = pointsScored_a + 1);
    }

    /**
     * TEAM B
     */

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add button Add +3 interactivity
     */
    public void addThreePoints_b (View view) {
        displayForTeamB(pointsScored_b = pointsScored_b + 3);
    }
    /**
     * Add button Add +2 interactivity
     */
    public void addTwoPoints_b (View view) {
        displayForTeamB(pointsScored_b = pointsScored_b + 2);
    }

    /**
     * Add button Add +3 interactivity
     */
    public void addFreeThrow_b (View view) {
        displayForTeamB(pointsScored_b = pointsScored_b + 1);
    }

    public void reset (View view) {
        displayForTeamB(pointsScored_b = 0);
        displayForTeamA(pointsScored_a = 0);
    }

}
