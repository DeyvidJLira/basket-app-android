package br.com.deyvidjlira.basket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView m_TextViewScoreTimeA;
    private TextView m_TextViewScoreTimeB;

    private int m_ScoreTimeA = 0;
    private int m_ScoreTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_TextViewScoreTimeA = (TextView) findViewById(R.id.textViewPlacarA);
        m_TextViewScoreTimeB = (TextView) findViewById(R.id.textViewPlacarB);
    }

    private void updateScore() {
        m_TextViewScoreTimeA.setText(String.valueOf(m_ScoreTimeA));
        m_TextViewScoreTimeB.setText(String.valueOf(m_ScoreTimeB));
    }

    public void clearScores(View view) {
        m_ScoreTimeA = 0;
        m_ScoreTimeB = 0;
        updateScore();
    }

    public void addThreePointsInA(View view) {
        m_ScoreTimeA += 3;
        updateScore();
    }

    public void addTwoPointsInA(View view) {
        m_ScoreTimeA += 2;
        updateScore();
    }

    public void addOnePointInA(View view) {
        m_ScoreTimeA += 1;
        updateScore();
    }

    public void addThreePointsInB(View view) {
        m_ScoreTimeB += 3;
        updateScore();
    }

    public void addTwoPointsInB(View view) {
        m_ScoreTimeB += 2;
        updateScore();
    }

    public void addOnePointInB(View view) {
        m_ScoreTimeB += 1;
        updateScore();
    }
}
