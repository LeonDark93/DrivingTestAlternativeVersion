package com.driving;

public class Test {

    private int[] answers;
    private int ticketId;
    private int questionIndex;


    public Test(int ticketId) {
        this.questionIndex = 0;
        this.ticketId = ticketId;
        this.answers = new int[20];
    }

    public void setAnswer(int answer) {
        this.answers[questionIndex] = answer;
    }

    public int getAnswer() {
        return answers[questionIndex];
    }

    public int getTicketId() {
        return this.ticketId;
    }
    public void  goForward(){
        if(questionIndex<= answers.length){
            this.questionIndex++;
        }

    }

    public void comeBack(){
        if(questionIndex >= 0){
            this.questionIndex--;
        }

    }

    public void goStart(){
        questionIndex = 0;
    }

    public int getQuestionIndex(){
        return questionIndex;
    }

}
