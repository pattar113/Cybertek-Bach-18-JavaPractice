package day18_NestedLoop;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class NestedLoop_Practice {
    public static void main(String[] args) {
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer=scan.next();

            while (!(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid Entry Please Re-Enter yes or no");
                answer=scan.next();
            }


            if(answer.equalsIgnoreCase("No")) {
                System.out.println("Thank you for using calculater");
                break;

            }
        }
/*
write program for reservation for room;
king bed=$120
queen bed=$100
single bed=$80

should ask witch do you want to reserve

if user provide invalid entry ==> please re-enter;

calculate total price
do you want to reserve another room;

if =yes==> repeat the previous steps
if = no ==> your total price:$$$

if your answer either yes or no ==> please re-enter
 */









    }
}