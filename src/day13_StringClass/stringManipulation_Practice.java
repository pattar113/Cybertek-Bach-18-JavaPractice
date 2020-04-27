package day13_StringClass;
import java.util.Scanner;
public class stringManipulation_Practice {

    /* if input : cyBerTek sChool
    out put
     Cybertek
     School
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println(" Enter your full name");
        String fullName= input.nextLine();// Cybertek School
        String firstName= fullName.substring(0,fullName.indexOf(" "));
        String lastName= fullName.substring(fullName.indexOf(" ")+1);

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        //              (0 1) FIRST character will be upper case,            (1)from the second character will be lower case;

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();




        System.out.println("Your first name is "+firstName);
        System.out.println("Your last name is "+lastName);




        /*
         Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */


             Scanner scan = new Scanner((System.in));
        System.out.println("Enter your first name");
        String firstNume= scan.next();


        System.out.println("Enter your last name");
        String lastNume=scan.next();

        char ch1=firstName.charAt(0);
        char ch2= lastName.charAt(0);

        System.out.println(ch1+""+ch2);
    }



}
