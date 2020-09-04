package basics.decisionstructures;

import java.util.Scanner;

/*
Exercise from TAU's Java Programming course by Angie Jones
https://testautomationu.applitools.com/java-programming-course/

    Chapter3b - If-Else statements

    Quota Calculator

    All sales people are expected to make at least 10 sales each week.
    For those who do, they receive a congratulatory message.
    For those who don't, they are informed of how many sales they where short.
*/

/*
        The If-Else Statement

        If a certain condition is met, then do something. Otherwise, do something else.
*/

public class IfElseStatement {

    public static void main(String args[]){

        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("Sorry. You did not met your quota. You were "+ salesShort +" sales short");
        }
    }
}

