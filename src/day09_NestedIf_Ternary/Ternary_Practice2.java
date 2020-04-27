package day09_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {


        int num1= 100;
        int num2 = 200;
        int min=(num1<num2)?num1:num2;
        System.out.println(min);

        System.out.println("==================");

        int hours =14;
       String result=(hours>12)?"good afternoon":(hours<12&&hours>=18)?"good morning":"good evening";


        System.out.println(result);

        System.out.println("======================");
int number= 120000;
boolean divisibleBy1And5=(number %3==0 &&number%5==-0)?true:false;
        System.out.println(divisibleBy1And5);

        }





    }













