package day6_Shorthand_LogicOpratores;

public class IfStatementPractice {
    public static void main(String[] args) {


        int a = 100;

        int b = 200;

        // identify which one in the greater number


    if(a >b) {

        System.out.println(a + " is greater than " + b);
    }

        if (b>a){

            System.out.println( b +" is grater than "+ a);




        }

        System.out.println("=====================");
        int x = 200;
        int y = 300;

        boolean xGreater = x> y ;

        boolean yGreater = y>x;

        if(xGreater){

            System.out.println(x+" is greater than "+b);

        }
           int age = 18;
           if(age >=18){
            System.out.println("You are eligible to vote");
        }


           int a1 = 4;
           int a2 = 8;
           int a3 = 1;

           boolean a1Greater = a1 > a2 && a1 > a3;
           boolean a2Greater = a2 > a1 && a2 > a3;
           boolean a3Greater = a3 > a1 && a3 > a2;


        if(a1Greater){
            System.out.println(a1+" is greater");
        }if(a2Greater){
            System.out.println(a2+" is greater");

        }if(a3Greater){
            System.out.println(a3+" is greater");
        }









    }




    }



















