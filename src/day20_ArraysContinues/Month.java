package day20_ArraysContinues;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
/*int[]n=new int[3];
        n[0]=0;
        n[1]=1;
        n[2]=2;
        n[3]=3;


 */


        String[] months = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        //String []month2=new String[12];
        // month2[0]="Jan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();


       /*
        if(num==1){

        // result= months[num-1];

         */
        int attempts = 1;
        while (num > 12 || num < 0) {
            System.out.println("Invalid Number");
            System.out.println("Please re=enter the number");
            num = scan.nextInt();
            attempts++;
            if (attempts == 3 && (num > 12 || num <= 0)) {
                System.out.println("Invalid entry,you already have 3 attempts");
                System.exit(0);
            }
        }
        String result = months[num - 1];

        System.out.println(result);

    }


}