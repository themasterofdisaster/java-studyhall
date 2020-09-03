package basics.decisionstructures;

import java.util.Scanner;
// ^ we import the class java.util.Scanner to be able to use

/*
Exercise from TAU's Java Programming course by Angie Jones
https://testautomationu.applitools.com/java-programming-course/

    Chapter3a

    If Statement
    All salespeople get a payment of $1000 a week.
    Salespeople who exceed 10 sales get an additional bonus of $250.
*/

public class IfStatement {

    public static void main(String args[]) {

        //Initialize known values.
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee makes this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is$" + salary);
    }
}
