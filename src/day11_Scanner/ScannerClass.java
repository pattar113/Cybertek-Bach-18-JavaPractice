package day11_Scanner;
import javax.crypto.spec.PSource;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        // int a = 99999999;

        System.out.println("enter long number");
        long a =input.nextLong();

        System.out.println("you have entered:"+a);

        System.out.println("enter a decimal:");
        long b= (int)input.nextFloat();

        System.out.println("you have entered:"+b);

        System.out.println("enter decimal number");
        double f= input.nextDouble();
        System.out.println("you have entered: "+f);
        System.out.println("enter true or false");
        boolean t=input.nextBoolean();
        System.out.println("you have entered: "+t);

        System.out.println("enter your sentence:");
        String firstWord=input.next();
        System.out.println("You have entered: "+firstWord);

    }






}
