package OfficeHours.Practice_04_01_2020;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
      /*
      String method
      toCharArray():returns char array
     spilt(): splits the string by given str ,dataType Array


       */

        String str=" Cybertek";
        char[]ch=str.toCharArray();//['c','y','b','e','r','t','e','k']

        System.out.println(str.length()==ch.length);//true

        /*
        str1="a,b,c", str2="cab"
         */
        String str1="ABC";
        String str2="BAC";

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("==================");

        String sentence="I like learn java";
      String []word= sentence.split(" ");
        System.out.println(Arrays.toString(word));
        int totalNumberOfWord=word.length;
        System.out.println(totalNumberOfWord);
       // String revSentence[]=
       // revSentence[]=
for(int i=word.length-1;i>=0;i--){
    System.out.print(word[i]+" ");





}
    }
}
