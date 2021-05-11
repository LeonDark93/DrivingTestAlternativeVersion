package com.driving;

public class TestResult {

    private boolean answersResult[];
    private float percent;
    private int answerIndex;


    public TestResult() {
        this.answersResult = new boolean[20];
    }
    public void setPercent(float percent) {
        this.percent = percent;
    }

    public void setAnswerResult(boolean answerResult) {
        this.answersResult[answerIndex++] = answerResult;
    }

    public boolean[] getAnswersResult() {
        return answersResult;
    }

    public float getPercent() {
        return percent;
    }
}
