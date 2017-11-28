package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsScored = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



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
    public void addThreePoints (View view) {
        displayForTeamA(3);
    }
    /**
     * Add button Add +2 interactivity
     */
    public void addTwoPoints (View view) {
        displayForTeamA(2);
    }

    /**
     * Add button Add +3 interactivity
     */
    public void addFreeThrow (View view) {
        displayForTeamA(1);
    }

}
