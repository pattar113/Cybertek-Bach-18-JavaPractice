package day10_Swich_Scanner;

import java.util.Scanner;// between package and class//

public class ScannerClass {
    public static void main(String[] args) {
        // Scanner  VariableName = new Scanner(System.in);

        Scanner input = new Scanner(System.in);


        // nextByte(), nextShort(), nextDouble(),nextLong(),

        System.out.println("enter a byte number");
       byte num1= input.nextByte();

        System.out.println("you have entered "+num1);

if(num1%2==0){
    System.out.println(num1+" is even number");

}else {
    System.out.println(num1+" is odd number");
}




    }














}
