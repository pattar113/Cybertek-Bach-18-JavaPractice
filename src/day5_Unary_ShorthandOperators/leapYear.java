package day5_Unary_ShorthandOperators;

public class leapYear {


    public static void main(String[] args) {


        //  short year = 2020;


        //boolean leapYear = year% == 0; // if the year can be devided by 4 without any remainder. then it's leap year ;
        //System.out.println( year + "is leap year: "+ leapYear);


        int year =2015;

        boolean leapYear = year %4 == 0;
        System.out.println(leapYear);

        int number =65;
        boolean divisibleBy2= number % 2 == 0;

boolean divisibleBy4= number %4 ==0;
boolean divisibleBy3= number%3==0;
boolean divisibleBy5 = number %5 ==0;


        System.out.println(divisibleBy2);
        System.out.println(divisibleBy4);
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);


        //double a, b, c, = 10.5;

       // System.out.println(b);





    }


}


