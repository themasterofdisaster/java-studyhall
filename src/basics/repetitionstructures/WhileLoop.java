package basics.repetitionstructures;

import java.util.Scanner;

/*
    Repetition Structures - Loops

        Loops are structures that cause a block of code to repeat.

    While Loop

        While (this condition remains true){
            do this, then go back to validate the condition
        }

    Sentinels

        A sentinel is a variable used within the condition that controls the loop.. It's very important that
        somewhere in your loops there's an opportunity for the sentinel to be updated. Otherwise, this loop
        will run infinitely.


    Exercise: GrossPayInputValidation

        Each store employee makes $15 an hour. Write a program that allows the employee to enter the number
        of hours worked for the week. Do not allow overtime.

        Exercise from TAU's Java Programming course by Angie Jones. Chapter 4a - While Loop.
        https://testautomationu.applitools.com/java-programming-course/
*/

public class WhileLoop {

    public static void main(String args[]){

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //In the following While Loop example the sentinel is "hoursWorked"
        //Validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");

            //update the sentinel:
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}
