package OfficeHours.OfficeHoursPractice_04_08_2020;

import java.util.Scanner;

public class findingMaxAndMin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2133333333;
        int min =  2133333333;

        int j = 1;
        while (j < 4) {

            j++;
            System.out.println("Enter number");
            int num1 = scan.nextInt();

            if (num1 > max) {
                max = num1;
            }
            if(num1<min){
                min=num1;
            }

        }

        System.out.println("Maximun number is: "+max);
        System.out.println("Minimum number is: "+min);
    }
}

