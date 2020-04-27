package day14_StringClass;

import java.util.Scanner;

public class StartEndWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();


        System.out.println("Enter second word");
        String word2 = input.next();


        int length1 = word1.length();
        int length2 = word2.length();

        if (length1 == 5 && length2 == 5) {
            if (word1.charAt(length1 - 1) == word2.charAt(0)) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }
            }else{
            System.out.println("need to be exactly 5 char length");

            }
        }
    }













