package com.example.quize;

public class Answer {

    private int mQuestionId;
    private int mAnswer;

    public Answer(int questionId, int answer) {
        mQuestionId = questionId;
        mAnswer = answer;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public int getAnswer() {
        return mAnswer;
    }

    public void setAnswer(int answer) {
        mAnswer = answer;
    }
}
