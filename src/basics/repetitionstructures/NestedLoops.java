package basics.repetitionstructures;

import java.util.Scanner;
/*
    Exercise: Average Test Scores
        Find the average of each student's test scores.

        Exercise from TAU's Java Programming course by Angie Jones. Chapter 4d - Nested Loops.
        https://testautomationu.applitools.com/java-programming-course/
 */

public class NestedLoops {
    public static void main(String args[]){

        //Initialize variables
        int numberOfStudents = 24;
        int numberOfTests =4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i=0; i<numberOfStudents; i++){

            double total = 0;

            //Make sure to use a different sentinel in this inner loop.
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }
        scanner.close();
    }
}
