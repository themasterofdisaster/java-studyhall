package basics.decisionstructures;

import java.util.Scanner;

/*
Exercise from TAU's Java Programming course by Angie Jones
https://testautomationu.applitools.com/java-programming-course/

    Chapter3d - If Else If

        Exercise: Test Results


    The If-Else-If _Statement

        If the first condition is met, do something.
        Else if condition B is met, do something else.
        Else if condition C is met, do something else.
*/

public class IfElseIfStatement {

    public static void main(String args[]){

        //Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the letter grade
        char grade;

        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.println("Your grade is "+ grade);
    }
}
