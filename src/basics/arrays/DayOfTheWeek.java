package basics.arrays;

import java.util.Scanner;

/*
    Exercise

        Make an array that holds its actual values of the days of the week, and then have the user input a number corresponding
        to some day of the week. And assume that the week starts on Monday.

        Your program should output the String that represents the day of the week that corresponds to the number that the user
        input. For example, if the user inputs the number 1, your program should print “Monday”.

        This is an optional exercise. I hope that you'll give it a try.

        Exercise from TAU's Java Programming course by Angie Jones. Chapter 7a.
        https://testautomationu.applitools.com/java-programming-course/
 */
public class DayOfTheWeek {

    static String DaysOfTheWeek[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Caturday","Sunday"};
    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {

        System.out.println("Enter day of week in number:");
        int dayNumber = scanner.nextInt();

        System.out.println("Day of the week is: " + DaysOfTheWeek[dayNumber - 1]);
    }

}





