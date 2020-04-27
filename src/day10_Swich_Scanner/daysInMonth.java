package day10_Swich_Scanner;

public class daysInMonth {
/*    write a program that can find the number of days in a month
      (Assume that Feb has 28 days)
            28 days: 2
            30 days: 4,6, 9, 11
            31 days: 1,3,5,7,8,10,12
 */

    public static void main(String[] args) {

        byte num3=12;
        boolean days28= num3==2;
        boolean days30= num3==4 || num3==6 || num3==9 || num3==11;
        String word="";
        if (num3>0 && num3<=12) {
            word= (days28)? "The month has 28 days." : (days30)? "The month has 30 days." : "The month has 31 days.";
        }
        else {
            word="Invalid Entry";
        }
        System.out.println(word);










    }












}
