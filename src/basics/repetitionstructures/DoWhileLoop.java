package basics.repetitionstructures;

import java.util.Scanner;

/*
Exercise from TAU's Java Programming course by Angie Jones
https://testautomationu.applitools.com/java-programming-course/

    Chapter4b - Do While Loop.

    Add Numbers

    Write a program that allows a user to enter two numbers,
    and then sums up the two numbers. The user should be able to
    repeat this action until they indicate they are done.
 */

public class DoWhileLoop {

    public static void main(String arcs[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        // The do while loop will run at least one time and THEN it will test the condition to see if it should run again
        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Enter true or false");

            //our sentinel:
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();

    }
}