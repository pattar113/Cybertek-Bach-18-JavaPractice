package day17_WhileLoops;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

for(int i=0;i<1;){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=input.nextInt();


        System.out.println("Enter second number");
        int num2=input.nextInt();

        System.out.println("Math operator: ");
       // char operator=input.next().charAt(0);
        String operator=input.next();


       if(operator.equals("+")){
           System.out.println("Addition is: "+(num1+num2));
       }else if(operator.equals("-")){
           System.out.println("Subtraction is: "+(num1-num2));
       }else if(operator.equals("*")){
           System.out.println("Multiplication is: "+(num1*num2));
       }else if(operator.equals("/")){
           System.out.println("Division is: "+(num1/num2));
       }else if(operator.equals("%")) {
           System.out.println("Remainder is: " + (num1 % num2));
       }else {
           System.out.println("Invalid Operator");
       }

        System.out.println("Do you want to continue");
       String answer=input.next();



    if(answer.equalsIgnoreCase("No")) {
        System.out.println("Thank you for using calculator");
        break;

    }







    }














}
}
