package com.wtho.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView scoreViewTeamA, scoreViewTeamB;
   private Button btnThreePoints, btnTwoPoints, btnFreeThrow;
   private Button btnThreePointsB, btnTwoPointsB, btnFreeThrowB;
   private Button btnReset;
   private int scoreA = 0;
   private int scoreB = 0;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      scoreViewTeamA = (TextView) findViewById(R.id.team_a_score);
      btnThreePoints = (Button) findViewById(R.id.btn_three_team_a);
      btnTwoPoints = (Button) findViewById(R.id.btn_two_team_a);
      btnFreeThrow = (Button) findViewById(R.id.btn_free_throw_team_a);

      scoreViewTeamB = (TextView) findViewById(R.id.team_b_score);
      btnThreePointsB = (Button) findViewById(R.id.btn_three_team_b);
      btnTwoPointsB = (Button) findViewById(R.id.btn_two_team_b);
      btnFreeThrowB = (Button) findViewById(R.id.btn_free_throw_team_b);

      btnReset = (Button) findViewById(R.id.btn_reset);

   }

   public void displayForTeamA(int score) {
      scoreViewTeamA.setText(String.valueOf(score));
   }

   public void displayForTeamB(int score) {
      scoreViewTeamB.setText(String.valueOf(score));
   }

   public void threePointsTeamA(View view) {
      scoreA += 3;
      displayForTeamA(scoreA);
   }

   public void twoPointsTeamA(View view) {
      scoreA += 2;
      displayForTeamA(scoreA);
   }

   public void freeThrowTeamA(View view) {
      scoreA += 1;
      displayForTeamA(scoreA);
   }

   public void threePointsTeamB(View view) {
      scoreB += 3;
      displayForTeamB(scoreB);
   }

   public void twoPointsTeamB(View view) {
      scoreB += 2;
      displayForTeamB(scoreB);
   }

   public void freeThrowTeamB(View view) {
      scoreB += 1;
      displayForTeamB(scoreB);
   }

   public void resetScore(View view) {
      scoreA = 0;
      scoreB = 0;
      displayForTeamA(scoreA);
      displayForTeamB(scoreB);
   }
}
