package day17_WhileLoops;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {


/*
1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will need for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number





 */

        Scanner input=new Scanner(System.in);

      //  System.out.println("Enter a number");
        //int num = input.nextInt();


int MinNumber=299999999;

        for(int i=1; i <6; i ++){

            System.out.println("Enter a number");

            int num1=input.nextInt();


            int MaxNumber = 3;// any number user provided will b greater then this numb


             if(num1>MaxNumber) {


                 MaxNumber = num1;
                 System.out.println(MaxNumber);
             }
            if(num1>MinNumber) {
                MinNumber = num1;
                System.out.println(MinNumber);

            }



        }

    }
}
