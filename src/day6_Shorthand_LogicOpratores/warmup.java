package day6_Shorthand_LogicOpratores;

public class warmup {

    public static void main(String[] args) {


        double numberofGallons = 5;
        double gallonsToLiters = numberofGallons*3.785;

        String result = numberofGallons +" gallons is equal to: "+gallonsToLiters+"liters";

        System.out.println(result);

        System.out.println("================================");

double numberOfliters = 100;
double LitersToGallons = numberOfliters/3.785;

String result2 = numberofGallons + "gallons equal to "+ LitersToGallons+"galons";

        System.out.println(result2);


        System.out.println("======================");





        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        System.out.println(b);
        System.out.println(a);


        int x = 300;
        int y = 400;
        int  z = x+y-x*y+x/y;

        // z= 300+400-300*400+300/400;
        // z= 700-120000+0
        //z= - 119300;
        System.out.println(z);






















}









    }











