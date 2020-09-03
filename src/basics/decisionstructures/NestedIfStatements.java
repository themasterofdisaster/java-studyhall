package basics.decisionstructures;

import java.util.Scanner;

/*
Exercise from TAU's Java Programming course by Angie Jones
https://testautomationu.applitools.com/java-programming-course/

    Chapter3c - Nested Ifs

    To qualify for a loan a person must make at least 30,000
    and have been working at their current job for at least 2 years
*/

public class NestedIfStatements {

    public static void main(String args[]) {

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter how many years working with your current employer:");
        double yearsEmployed = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary){
            if(yearsEmployed>=requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }
            else System.out.println("Sorry, you need at least "
                    + requiredYearsEmployed + " years working with your current employer to qualify");
        }
        else System.out.println("Sorry, you need a salary of at least "
                + requiredSalary + " pesos to qualify");
    }
}