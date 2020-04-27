package day10_Swich_Scanner;

public class SwitchStatement_practice3 {
    public static void main(String[] args) {


        char ch = 'a';
       String result="";
        switch (ch){
            case 'y':
                //System.out.println("A");
                result="A";


            case 'b':
               // System.out.println("B");
                result="b";

            case 'c':
                result="C";
               // System.out.println("C");



            case 'd':
               // System.out.println("D");
                result="D";
                break;

            default:
              //  System.out.println("invalid");
              result="Invalid";

        }
        System.out.println(result);


    }
}