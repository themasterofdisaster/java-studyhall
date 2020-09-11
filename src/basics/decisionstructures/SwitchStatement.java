package basics.decisionstructures;

import java.util.Scanner;

/*
    The Switch Statement

        If situation A occurs, do something.
        Else if situation B occurs, do something else.
        Else if situation C occurs, do something else.


    Exercise: Grade Message

        Have a user enter their letter grade, and using a switch statement,
        print out a message letting them know how they did.

        Exercise from TAU's Java Programming course by Angie Jones. Chapter 3e - Switch Statements.
        https://testautomationu.applitools.com/java-programming-course/

*/

public class SwitchStatement {

    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);

    }
}