package day07_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        double a= 100;
        double b = 200;
        double c = 400.5;

        boolean aMain = a<b && a<c;
        boolean bMain = b<a && b<c;
        boolean cMain = c<a && c<b;

        if(aMain){

            System.out.println(a+" is the minimum number");
        }
         if(bMain){

             System.out.println(b+" is the minimum number");

         }
     if(cMain){

         System.out.println(c+" is the minimum number");
     }




    }


















}
