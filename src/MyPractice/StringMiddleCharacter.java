package MyPractice;

import java.util.Scanner;

public class StringMiddleCharacter {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = input.next();
        System.out.println("Enter the second number");
        String word2 = input.next();

        String middleCharacter1 = "";

        int totalCharacter1 = word1.length() - 1;

        int middleNumber1 = totalCharacter1 / 2;

        if (middleNumber1 % 2 == 0) {
            middleCharacter1=middleCharacter1+ word1.charAt(middleNumber1)+word1.charAt(middleNumber1+1);

        } else {
            middleCharacter1=middleCharacter1+ word1.charAt(middleNumber1);

        }
        String middleCharacter2 = "";
        int totalCharacter2 = word2.length() - 1;
        int middleNumber2 = totalCharacter2 / 2;

        if (middleNumber2 % 2 == 0) {
            middleCharacter2=middleCharacter2+word2.charAt(middleNumber2)+word2.charAt(middleNumber2+1);




        } else {
            middleCharacter2 = middleCharacter2 + word2.charAt(middleNumber2);


        }

        System.out.println(middleCharacter2);
        System.out.println(middleCharacter1);



        String result1=word1+word2+word2+word1;

        System.out.println(result1);


       word1= word1.substring(word1.charAt(0));
       word2= word2.substring(word2.charAt(0));

       String  result=word1+word2;

        System.out.println(result);

    }
}