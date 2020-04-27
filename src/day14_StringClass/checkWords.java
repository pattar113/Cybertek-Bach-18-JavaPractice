package day14_StringClass;

import java.util.Scanner;

public class checkWords {
  /* 1. Write a program CheckWords:
    Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
            2. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
            if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
            if they do not match:  print "Buzz - did not match"
            3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
    abba
    Output:
            true
            4. Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
            Input:
    Seriously
    Output:
    really?

   */


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter first word");
        String word1=input.next();

        System.out.println("Enter second word");
        String word2=input.next();

        System.out.println("Enter third word");
        String word3=input.next();

       int  length1= word1.length();
       int length2=word2.length();
       int length3=word3.length();
boolean allNOtSame=length1!=length2&&length2!=length3&&length1!=length3;
// non of them same
       if(length1==length2&&length2==length3){
         // if they are same length: print all words are same length


           System.out.println("print all words are same length  ");




       }else if(allNOtSame){
           System.out.println("all different length");
       }else {
           System.out.println("Not same nor different");
       }





    }







}
