package oop.overloading;
/*
        Exercise from TAU's Java Programming course by Angie Jones. Chapter 6d.
        https://testautomationu.applitools.com/java-programming-course/
 */
public class MonthConverter {
    public static void main(String args[]){
        //no need to instantiate the "Month" class because it's methods are static.
        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("January"));
    }
}
