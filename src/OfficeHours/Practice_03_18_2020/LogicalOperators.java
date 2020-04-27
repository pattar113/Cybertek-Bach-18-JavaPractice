package OfficeHours.Practice_03_18_2020;

public class LogicalOperators {

    public static void main(String[] args) {


        // ||, &&, !

        boolean r1 = "Pettar" == "Bad guy";//false
        System.out.println(r1);

        boolean r2 = " Pettar" !="Good Guy";// true

        System.out.println(r2);// true

        boolean r3 = 10>=9; // true;
        System.out.println(r3);
        boolean r4 =!false == !true;// false ;
        System.out.println(r4);//false

        boolean result1= 9!= 8||9==8;
        System.out.println(result1);//true



        boolean result2 = 'a'=='A'|| 'A'!='b';
        System.out.println(result2);//false




// && one condition false result will false;

     boolean result3 = 6>5 && 6<4;//false








    }
}