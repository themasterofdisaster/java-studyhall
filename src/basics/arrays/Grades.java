package basics.arrays;

import java.util.Scanner;

public class Grades {

    //for this example of arrays we don't have the size right away. So we don't initialize the array yet.
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("How many grades would you like to enter?");
        //we initialize the array now that we know the amount of grades to hold in the array.
        grades = new int[scanner.nextInt()];

        getGrades();

        //String.format is used to format values. The "%" serves as a place holder to replace with "calculateAverage"
        //The ".f" is telling it is a float and we want to format it to 2 decimals.
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());

    }

    public static void getGrades(){
        //.length is a property of arrays. It returns the length of the array.
        for(int i=0; i<grades.length; i++){
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    //algorithm to find the highest value in an array.
    public static int getHighest(){
        int highest = grades[0];
        for(int grade: grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for(int grade: grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

}