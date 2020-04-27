package day17_WhileLoops;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class whileLoopPractice {
    /*ask user enter yes or no.
    if the user enters than yes or no, repeat the previous step
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String word = input.next();
        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");
        while (!valid) {
            System.out.println("Please re-enter");
            word = input.next();


            if (word.equalsIgnoreCase("Yes")|| word.equalsIgnoreCase("no")){

        }

            }
        if (word.equalsIgnoreCase("Yes")) {

            System.out.println("Entered Yes");
        }
            if (word.equalsIgnoreCase("No")) {

                System.out.println("Entered No");

            }


        }


    }
