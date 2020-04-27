package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_nextLine {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        //String  name= input .next();
        int num= input.nextInt();
        System.out.println(num);

        input.nextLine();// taking out the enter
        System.out.println("Enter your name");
        String name= input.nextLine();
        System.out.println(name);












    }













}
