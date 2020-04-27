package day12_JavaRecap;
import java.util.Scanner;
public class salaryCalculator {
    /* ask the user enter salary
    ask the user enter full name
    ask the user enter company name
    ask the user enter SSN
    ask the user to enter jobTitle

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        System.out.println("enter your salary");
        double salary = scan.nextDouble();//100000enter
        scan.nextLine();//take out enter
        System.out.println("Enter your full name");
        String fullName= scan.nextLine();

        System.out.println("Enter your company name");
        String companyName= scan.nextLine();

        System.out.println("Enter your SSN");
        long SSN= scan.nextLong();

        scan.nextLine();

        System.out.println("Whats your job title");
        String jobTitle=scan.nextLine();

        System.out.println("full name is: "+fullName);
        System.out.println("job title: "+jobTitle);
        System.out.println("SSN: "+SSN);
        System.out.println("salary is: $"+salary);

    }











}
