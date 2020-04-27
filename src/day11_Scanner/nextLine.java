package day11_Scanner;
import java.util.Scanner;
public class nextLine {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("enter your full name: ");
        String fullName=input.nextLine();
        System.out.println("your full name is: ");

        System.out.println(fullName);
        System.out.println("enter your sentence: ");
String sentence= input.nextLine();
        System.out.println("you entered: "+sentence);





    }







}
