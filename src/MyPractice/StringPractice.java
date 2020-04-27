package MyPractice;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter word1");
        String word1=input.next();
        System.out.println("Enter word2");
        String word2=input.next();

        String result1 = word1+" " + word2+" " + word2+" " + word1;

        System.out.println(result1);


        word1 = word1.substring(1);
        word2 = word2.substring(1);

        String result = word1 + word2;

        System.out.println(result);
    }
}