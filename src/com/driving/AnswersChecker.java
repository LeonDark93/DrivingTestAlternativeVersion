package com.driving;

public class AnswersChecker {

    private int[][] answers;

    public AnswersChecker() {
        answers = new int[][]{
                {2, 1, 1, 4, 2, 2, 4, 3, 1, 3, 1, 3, 3, 1, 3, 4, 3, 4, 3, 2},
                {2, 1, 1, 2, 3, 1, 3, 3, 1, 3, 3, 2, 3, 3, 1, 3, 2, 1, 3, 3},
                {1, 3, 3, 2, 2, 3, 2, 1, 3, 1, 3, 2, 2, 1, 3, 3, 4, 2, 3, 1},
                {2, 2, 1, 1, 2, 1, 1, 2, 2, 1, 1, 2, 3, 3, 2, 4, 1, 4, 1, 3},
                {1, 2, 1, 1, 3, 1, 3, 3, 2, 3, 1, 2, 2, 1, 1, 3, 2, 1, 2, 1}
        };
    }
    public TestResult check(Test test) {
        TestResult result = new TestResult();
        int correctAnswers = 0;
        test.goStart();
        for (int i = 0; i < 20; i++) {
           if(answers[test.getTicketId()][i] == test.getAnswer()){
               result.setAnswerResult(true);
               correctAnswers++;
           } else {
               result.setAnswerResult(false);
           }
           test.goForward();
        }
        result.setPercent(5 * correctAnswers);
        return result;
    }
}

