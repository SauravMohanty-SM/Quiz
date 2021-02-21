package com.example.quize;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class programming extends AppCompatActivity {

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

            new Answer(R.string.prog_Q_pg1, R.string.opt1_pg2),
            new Answer(R.string.prog_Q_pg2, R.string.opt2_pg2),
            new Answer(R.string.prog_Q_pg3, R.string.opt3_pg3),
            new Answer(R.string.prog_Q_pg4, R.string.opt4_pg3),
            new Answer(R.string.prog_Q_pg5, R.string.opt5_pg2),
            new Answer(R.string.prog_Q_pg6, R.string.opt6_pg2),
            new Answer(R.string.prog_Q_pg7, R.string.opt7_pg4),
            new Answer(R.string.prog_Q_pg8, R.string.opt8_pg3),
            new Answer(R.string.prog_Q_pg9, R.string.opt9_pg3),
            new Answer(R.string.prog_Q_pg10, R.string.opt10_pg2),
            new Answer(R.string.prog_Q_pg11, R.string.opt11_pg2),
            new Answer(R.string.prog_Q_pg12, R.string.opt12_pg1),


    };

    private Answer [] mOption1Bank = new Answer[] {

            new Answer(R.string.opt1_pg1, 0),
            new Answer(R.string.opt2_pg1, 0),
            new Answer(R.string.opt3_pg1, 0),
            new Answer(R.string.opt4_pg1, 0),
            new Answer(R.string.opt5_pg1, 0),
            new Answer(R.string.opt6_pg1, 0),
            new Answer(R.string.opt7_pg1, 0),
            new Answer(R.string.opt8_pg1, 0),
            new Answer(R.string.opt9_pg1, 0),
            new Answer(R.string.opt10_pg1, 0),
            new Answer(R.string.opt11_pg1, 0),
            new Answer(R.string.opt12_pg1, 0),

    };

    private Answer [] mOption2Bank = new Answer[] {

            new Answer(R.string.opt1_pg2, 0),
            new Answer(R.string.opt2_pg2, 0),
            new Answer(R.string.opt3_pg2, 0),
            new Answer(R.string.opt4_pg2, 0),
            new Answer(R.string.opt5_pg2, 0),
            new Answer(R.string.opt6_pg2, 0),
            new Answer(R.string.opt7_pg2, 0),
            new Answer(R.string.opt8_pg2, 0),
            new Answer(R.string.opt9_pg2, 0),
            new Answer(R.string.opt10_pg2, 0),
            new Answer(R.string.opt11_pg2, 0),
            new Answer(R.string.opt12_pg2, 0),

    };

    private Answer [] mOption3Bank = new Answer[] {

            new Answer(R.string.opt1_pg3, 0),
            new Answer(R.string.opt2_pg3, 0),
            new Answer(R.string.opt3_pg3, 0),
            new Answer(R.string.opt4_pg3, 0),
            new Answer(R.string.opt5_pg3, 0),
            new Answer(R.string.opt6_pg3, 0),
            new Answer(R.string.opt7_pg3, 0),
            new Answer(R.string.opt8_pg3, 0),
            new Answer(R.string.opt9_pg3, 0),
            new Answer(R.string.opt10_pg3, 0),
            new Answer(R.string.opt11_pg3, 0),
            new Answer(R.string.opt12_pg3, 0),

    };

    private Answer [] mOption4Bank = new Answer[] {

            new Answer(R.string.opt1_pg4, 0),
            new Answer(R.string.opt2_pg4, 0),
            new Answer(R.string.opt3_pg4, 0),
            new Answer(R.string.opt4_pg4, 0),
            new Answer(R.string.opt5_pg4, 0),
            new Answer(R.string.opt6_pg4, 0),
            new Answer(R.string.opt7_pg4, 0),
            new Answer(R.string.opt8_pg4, 0),
            new Answer(R.string.opt9_pg4, 0),
            new Answer(R.string.opt10_pg4, 0),
            new Answer(R.string.opt11_pg4, 0),
            new Answer(R.string.opt12_pg4, 0),

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);

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
            AlertDialog.Builder alert = new AlertDialog.Builder(programming.this);
            alert.setTitle("Quiz Over");
            alert.setCancelable(false);
            alert.setMessage("You scroed "+ mScore +" points out of " + mIndex1);
            mScore = 0;
            alert.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent mainPage = new Intent(programming.this, MainActivity.class);
                    startActivity(mainPage);
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