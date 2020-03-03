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
   private int score = 0;

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

   }

   public void displayForTeamA(int score) {
      scoreViewTeamA.setText(String.valueOf(score));
   }

   public void threePoints(View view) {
      score += 3;
      displayForTeamA(score);
   }

   public void twoPoints(View view) {
      score += 2;
      displayForTeamA(score);
   }

   public void freeThrow(View view) {
      score += 1;
      displayForTeamA(score);
   }
}
