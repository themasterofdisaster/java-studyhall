package basics.repetitionstructures;

import java.util.Scanner;
/*
    Break Statement

        Use the "break" statement to exit the loop regardless of what the condition says and regardless of what
        iteration it's on.


    Exercise: Letter Search

        Search a String to determine if it contains the letter 'A'.

        Exercise from TAU's Java Programming course by Angie Jones. Chapter 4c - For Loop.
        https://testautomationu.applitools.com/java-programming-course/

 */
public class ForLoopWithBreak {
    public static void main(String args[]){

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;

                //if you found the letter "A", then break to exit the for loop. There's no need to continue searching
                //through the rest of the letters, because by now we already know letterFound = true.
                break;
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }

    }
}
