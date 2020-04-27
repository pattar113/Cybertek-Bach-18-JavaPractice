package day11_Scanner;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {


        /* write program that can calculate the salary after tax needed information

        employee salary
        state tax
        federal tax
         Must use Scanner

         */


        Scanner input= new Scanner(System.in);

        System.out.println("Enter your salary");
        int salary=input.nextInt();


        System.out.println("Enter the state tax");
        byte stateTax=input.nextByte();
        double stateTaxPercentage=stateTax/100.0;

        System.out.println("Enter the federal tax");
        byte federalTax=input.nextByte();
        double federalTaxPercentage=federalTax/100.0;
        //totalTax=(federalTaxPercentage+stateTaxPercentage)*salary;
        double totalTax=(federalTaxPercentage+stateTaxPercentage)*salary;

        //salary after tax =salary-totalTax;
        double salaryAfterTax=salary-totalTax;

        System.out.println("your salary after tax is: $"+salaryAfterTax);











    }












}
