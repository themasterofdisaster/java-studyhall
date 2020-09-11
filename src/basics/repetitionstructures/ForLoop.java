package basics.repetitionstructures;

import java.util.Scanner;


/*
    The For Loop

        * Loop runs a specified number of times
        * Condition is tested before entering the loop.
        * Best to be used when you may want the loop to run or not depending on a condition and when you know how many
          times the loop should be executed.

        Breaking Out of a Loop
        'break' will end the loop. It doesn't matter what iteration it's on.


    Exercise: Cashier
        Write a cashier program that will scan a given number of items and tally the cost.

        Exercise from TAU's Java Programming course by Angie Jones. Chapter 4c - For Loop.
        https://testautomationu.applitools.com/java-programming-course/

*/

public class ForLoop {

    public static void main(String args[]){

        //Get number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all of the items and accumulate the costs
        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of item #" + (i+1));
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("Your total is $" + total);

    }
}

