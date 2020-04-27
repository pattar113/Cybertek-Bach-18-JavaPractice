package day14_StringClass;
/*
Ask user to enter two words, print first word without its character then print the second word without  its first character

input :
apple
banana
out put:
ppleanana


 */
import java.util.Scanner;

public class combiningTwoString2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1= input.next();

      // word1=word1.substring(1, word1.length()-1+1);//pple
        word1=word1.substring(1);//pple
        System.out.println("Enter second word");
        String word2=input.next();
        word2=word2.substring(1,word2.length()-1+1);//anana

        String result= word1+word2;

        System.out.println(result);

        String str5 = "Cybertek";
        System.out.println(str5.substring(0,2));





















    }




















}
