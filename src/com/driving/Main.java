package com.driving;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isAnswering  = true;
        int questionIndex = 1;

        System.out.print("Введите номер билета ： ");
        Test test = new Test(input.nextInt());
        System.out.println();

        do{
            System.out.println("Question "+test.getQuestionIndex());
            System.out.println("1 - Ответить");
            System.out.println("2 - Вернуться");
            System.out.println("3 - Далее");
            System.out.println("4. Закончить тест");

            int numMenu = input.nextInt();


            if(numMenu == 1){
                if(test.getAnswer() > 0 ){
                    System.out.println("Old answer = "+test.getAnswer());
                    System.out.println("Enter new answer");
                    test.setAnswer(input.nextInt());


                } else {
                    System.out.println("Enter  answer");
                    test.setAnswer(input.nextInt());
                }
            } else if(numMenu == 2){
                test.comeBack();

            } else if(numMenu == 3){
                test.goForward();
            } else if(numMenu == 4){
                isAnswering = false;
            }
        }
        while (isAnswering);

        AnswersChecker answersChecker = new AnswersChecker();
        TestResult result = answersChecker.check(test);
        System.out.println("Ваш результат = "+result.getPercent());
    }
}
// TODO: Найти проблемы в программе и решить
//  TODO   реализовать возможность изменение ответов
