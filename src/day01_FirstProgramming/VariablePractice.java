package day01_FirstProgramming;

public class VariablePractice {


    public static void main(String[] args) {



        int salary = 120000;
        double federaltax = 0.18;
        float statetax = 0.065f;


        // salary after tax = salary(1-sum of taxes)

        double sumtaxes = federaltax + statetax;
        double salaryaftertax = salary * (1-sumtaxes);
        System.out.println(salaryaftertax);

        System.out.println("=========================");


        // area of the circle = r*r*pi


        double r = 5.5;
        System.out.println("================");


        double kg = 90;
        double pound = kg * 2.25;
        System.out.println(pound);
        System.out.println("==========");

        double lira = 1000;
        double liraindouble = lira/6.15;
        System.out.println(liraindouble);

        double rupi = 1000;
        double rupiindollar = rupi*0.014;
        System.out.println(rupiindollar);


        System.out.println("================");




        double liter = 10000;
        double literinGallon = liter/3.7;
        System.out.println(literinGallon);















        }
















    }

