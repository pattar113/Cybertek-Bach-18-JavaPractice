package day11_Scanner;
import java.util.Scanner;

public class nextLine_Practice {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age: ");
        byte age= input.nextByte();// 30+enter
        System.out.println("your age is: "+age);


        System.out.println("enter your full name");
        input.nextLine();

        String fullName=input.nextLine();
        System.out.println("your full name: "+fullName);













    }







}
