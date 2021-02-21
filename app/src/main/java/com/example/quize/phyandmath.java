package com.example.quize;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class phyandmath extends AppCompatActivity {

    Button mOption1;
    Button mOption2;
    Button mOption3;
    Button mOption4;
    Button mNext;
    TextView mQuestionTextView;
    int mIndex;
    int mIndex1;
    int mQuestion;
    int mOption_1;
    int mOption_2;
    int mOption_3;
    int mOption_4;
    int mScore;
    TextView mScoreTextView;


    private Answer [] mQuestionBank = new Answer[] {

            new Answer(R.string.phy_Q_p1, R.string.opt1_p4),
            new Answer(R.string.phy_Q_p2, R.string.opt2_p1),
            new Answer(R.string.phy_Q_p3, R.string.opt3_p1)

    };

    private Answer [] mOption1Bank = new Answer[] {

            new Answer(R.string.opt1_p1, 0),
            new Answer(R.string.opt2_p1, 0),
            new Answer(R.string.opt3_p1, 0)

    };

    private Answer [] mOption2Bank = new Answer[] {

            new Answer(R.string.opt1_p2, 0),
            new Answer(R.string.opt2_p2, 0),
            new Answer(R.string.opt3_p2, 0)

    };

    private Answer [] mOption3Bank = new Answer[] {

            new Answer(R.string.opt1_p3, 0),
            new Answer(R.string.opt2_p3, 0),
            new Answer(R.string.opt3_p3, 0)

    };

    private Answer [] mOption4Bank = new Answer[] {

            new Answer(R.string.opt1_p4, 0),
            new Answer(R.string.opt2_p4, 0),
            new Answer(R.string.opt3_p4, 0)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phyandmath);

        mOption1 = (Button) findViewById(R.id.Answer_1);
        mOption2 = (Button) findViewById(R.id.Answer_2);
        mOption3 = (Button) findViewById(R.id.Answer_3);
        mOption4 = (Button) findViewById(R.id.Answer_4);
        mNext = (Button) findViewById(R.id.next_button);
        mQuestionTextView = (TextView) findViewById(R.id.Question);
        mScoreTextView = (TextView) findViewById(R.id.textView2);

        mNext.setEnabled(false);

        //mQuestion = mQuestionBank[mIndex].getQuestionId();
        //mQuestionTextView.setText(mQuestion);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });

        mOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex1 = ( mIndex + 1 );
                mNext.setEnabled(true);
                mOption1.setEnabled(false);
                mOption2.setEnabled(false);
                mOption3.setEnabled(false);
                mOption4.setEnabled(false);
                if(mOption1Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()){
                    mOption1.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    mScore = (mScore + 1);
                    mScoreTextView.setText("Score "+ mScore +"/" + mQuestionBank.length);
                }
                else{
                    mOption1.setBackgroundColor(getResources().getColor(R.color.wrongAns));
                    Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    vibrator.vibrate(60);

                    if(mOption2Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption2.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }

                        else if(mOption3Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption3.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }

                            else if(mOption4Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption4.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }
                }
            }
        });

        mOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex1 = ( mIndex + 1 );
                mNext.setEnabled(true);
                mOption1.setEnabled(false);
                mOption2.setEnabled(false);
                mOption3.setEnabled(false);
                mOption4.setEnabled(false);
                if(mOption2Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()){
                    mOption2.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    mScore = (mScore + 1);
                    mScoreTextView.setText("Score "+ mScore +"/" + mQuestionBank.length);
                }
                else{
                    mOption2.setBackgroundColor(getResources().getColor(R.color.wrongAns));
                    Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    vibrator.vibrate(60);

                    if(mOption1Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption1.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }

                    else if(mOption3Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption3.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }

                    else if(mOption4Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption4.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }
                }

            }
        });

        mOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex1 = ( mIndex + 1 );
                mNext.setEnabled(true);
                mOption1.setEnabled(false);
                mOption2.setEnabled(false);
                mOption3.setEnabled(false);
                mOption4.setEnabled(false);
                if(mOption3Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()){
                    mOption3.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    mScore = (mScore + 1);
                    mScoreTextView.setText("Score "+ mScore +"/" + mQuestionBank.length);
                }
                else{
                    mOption3.setBackgroundColor(getResources().getColor(R.color.wrongAns));
                    Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    vibrator.vibrate(60);

                    if(mOption1Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption1.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }

                    else if(mOption2Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption2.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }

                    else if(mOption4Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption4.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }
                }
            }
        });

        mOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex1 = ( mIndex + 1 );
                mNext.setEnabled(true);
                mOption1.setEnabled(false);
                mOption2.setEnabled(false);
                mOption3.setEnabled(false);
                mOption4.setEnabled(false);
                if(mOption4Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()){
                    mOption4.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    mScore = (mScore + 1);
                    mScoreTextView.setText("Score "+ mScore +"/" + mQuestionBank.length);
                }
                else{
                    mOption4.setBackgroundColor(getResources().getColor(R.color.wrongAns));
                    Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    vibrator.vibrate(60);

                    if(mOption1Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption1.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }

                    else if(mOption3Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption3.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }

                    else if(mOption2Bank[mIndex].getQuestionId() == mQuestionBank[mIndex].getAnswer()) {
                        mOption2.setBackgroundColor(getResources().getColor(R.color.rightAns));
                    }
                }
            }
        });
    }

    private  void updateQuestion() {
        mIndex = (mIndex + 1) % mQuestionBank.length;

        if(mIndex1 == mQuestionBank.length){
            mScoreTextView.setText("Score 0/" + mQuestionBank.length);
            AlertDialog.Builder alert = new AlertDialog.Builder(phyandmath.this);
            alert.setTitle("Quiz Over");
            alert.setCancelable(false);
            alert.setMessage("You scroed "+ mScore +" points out of "+ mIndex1);
            mScore = 0;
            alert.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alert.show();
        }


        mQuestion = mQuestionBank[mIndex].getQuestionId();
        mQuestionTextView.setText(mQuestion);

        mOption_1 = mOption1Bank[mIndex].getQuestionId();
        mOption1.setText(mOption_1);

        mOption_2 = mOption2Bank[mIndex].getQuestionId();
        mOption2.setText(mOption_2);

        mOption_3 = mOption3Bank[mIndex].getQuestionId();
        mOption3.setText(mOption_3);

        mOption_4 = mOption4Bank[mIndex].getQuestionId();
        mOption4.setText(mOption_4);

        mOption1.setBackgroundColor(getResources().getColor(R.color.backgroung));
        mOption2.setBackgroundColor(getResources().getColor(R.color.backgroung));
        mOption3.setBackgroundColor(getResources().getColor(R.color.backgroung));
        mOption4.setBackgroundColor(getResources().getColor(R.color.backgroung));

        mNext.setEnabled(false);
        mOption1.setEnabled(true);
        mOption2.setEnabled(true);
        mOption3.setEnabled(true);
        mOption4.setEnabled(true);

    }

}
