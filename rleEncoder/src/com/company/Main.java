package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Getting the raw text
        Scanner input = new Scanner(System.in);
        System.out.println("What is the text you want to compress");
        String rawText = input.next();
        int length = rawText.length();
        // creating an empty list
        char[] textArray = new char[rawText.length()];
        // replace each space in the list with the next letter from the raw text
        for (int i = 0; i < length; i++){
            textArray[i] = rawText.charAt(i);
        }
        char currentLetter = textArray[0];
        length = length - 1;
        int consecutiveChar = 1;
        for (int i = 0; i < length; i++) {
            // Part of previous code
            //System.out.println(consecutiveChar);
            //int priorLocation = i;
            //char priorLetter = textArray[priorLocation];
            //i++;
            int currentLocation = i;
            currentLetter = textArray[currentLocation];
            int nextLocation = i + 1;
            char nextLetter = textArray[nextLocation];
            // Debug outputs
            //System.out.println("priorLetter");
            //System.out.println(priorLetter);
            //System.out.println("currentLetter");
            //System.out.println(currentLetter);
            /*
            if (currentLetter == ''){
                System.out.print(currentLetter);
            }
            *\
             */
            if (currentLetter == nextLetter){
                consecutiveChar = consecutiveChar + 1;
            }

            else{
                System.out.print(currentLetter);
                System.out.print(consecutiveChar);
                consecutiveChar = 1;
            }



            // Previous attempts
            /*
            if (priorLetter == currentLetter) {
                consecutiveChar = consecutiveChar + 1;
            }


            if (priorLetter != currentLetter) {

                /*
                if (consecutiveChar == 0) {
                    System.out.println(priorLetter);
                }

                else{
                    consecutiveChar = consecutiveChar + 1;
                }

                if (consecutiveChar != 0) {
                    System.out.println(priorLetter);
                    //System.out.print(consecutiveChar);
                    System.out.println(consecutiveChar);
                    consecutiveChar = 0;
                }
                 */

        }
        System.out.print(currentLetter);
        System.out.print(consecutiveChar);
    }
}
