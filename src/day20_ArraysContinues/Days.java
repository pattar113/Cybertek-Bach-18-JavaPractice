package day20_ArraysContinues;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {


        String[]days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number");
        int num=scan.nextInt();
        int attempts=1;
while (num>7||num<1) {

    System.out.println("Invalid entery ,Please re-enter the number");

    scan.nextInt();
    attempts++;
    if(attempts==3&&(num>7||num<1)){
        System.exit(0);

    }


}

        String result= days[num-1];

        System.out.println(result);










    }
}
