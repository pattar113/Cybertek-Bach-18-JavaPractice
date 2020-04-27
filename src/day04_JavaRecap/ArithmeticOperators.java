package day04_JavaRecap;

public class ArithmeticOperators {


    public static void main(String[] args) {



        double d = 10.0/4.0;//

        double d2 = 10/4 ;

        System.out.println(d);// 2.0

        float f1 = 10/4; // 2;
        //float f2 = 10.0 / 4.0; why false ;




        // 25

        boolean evenNumber=25%2==0;
        System.out.println(evenNumber);//

        boolean oddNumber = 22%2 !=0;

        System.out.println(oddNumber);

        System.out.println(22%2);
        // 0 does equal to 0 , so its false ;


        System.out.println("25 is odd number"+ (25%2!=0));
        System.out.println("25 is even number"+ (25%2==0));

        System.out.println("25 is even number:" +!(25%2!=0));

// 49 is not even number ;

        System.out.println("49 is not even number:"+(49%2!=0));

        System.out.println(49%2);































    }







}
