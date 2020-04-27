package day10_Swich_Scanner;
import java.util.Scanner;
public class RateCalculator_scanner {

//write a program for the rate calculator: rateCalculator
//                        1. asks the user to enter salary (as integer)
//                        2. asks the user how many hours does she/he works in a week
//                        3. print the hourly rate
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the salary");

        int salary= input.nextInt();
        System.out.println("How many hours do you work per week");
        byte weeklyHours=input.nextByte();
        System.out.println("How many weeks do you work in years");
        byte numberOfWeek=input.nextByte();
        // how do you calculate hourly rate hourlyRate=(salary/numberOfWeeks)/weeklyHours;
        int hourlyRate=(salary/numberOfWeek)/weeklyHours;
        System.out.println("your hourly rate is : "+hourlyRate);











    }











}
