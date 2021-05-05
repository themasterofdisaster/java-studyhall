package basics.arrays;

import java.util.Arrays;
import java.util.Random;

/*
    Arrays.
        Find in this class arrays in use. Creating arrays, setting values to arrays and returning values from arrays.

        Find also two algorithms to search arrays: Sequential Search and Binary Search.

        Exercise from TAU's Java Programming course by Angie Jones. Chapter 7a.
        https://testautomationu.applitools.com/java-programming-course/
 */
public class LotteryTicket {

/*
    Constant Variables
        It's a variable which's value will never change within the execution of this program.
        The convention is to name constant variables in all caps.
        Use the word "final" to declare a constant variable.

        Exercise from TAU's Java Programming course by Angie Jones. Chapter 7.
        https://testautomationu.applitools.com/java-programming-course/
 */
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i< LENGTH; i++){
            int randomNumber;

            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while(search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }
    //Java doc. Use this to document methods.
    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search form
     * @return Returns true if found, false if not.
     */
    public static boolean search(int[] array, int numberToSearchFor){

        /* This is called an enhanced loop.
        It iterates through 'array' and
        each time assigns the current element to 'value'.
         */
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }

        /* If we've reached this point, then the entire array was searched
        and the value was not found
        */
        return false;
    }

    //Not using it in this exercise, just created as an example
    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Array must be sorted first.
        Arrays.sort(array);

        int index= Arrays.binarySearch(array, numberToSearchFor);
        if(index>=0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){

        for(int i=0; i<LENGTH; i++){
            //println prints things in a different line. print prints everything on the same line.
            System.out.print(ticket[i] + " | ");
        }
    }

}
