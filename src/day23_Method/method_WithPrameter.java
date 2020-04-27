package day23_Method;

import java.util.Scanner;

public class method_WithPrameter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        byte age=scan.nextByte();
        EligibleToBuyAlcohol(age);
    }

    public static void EligibleToBuyAlcohol(byte age) {

        if(age>=21) {
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Eligible to buy Milk");

        }

    }
}
