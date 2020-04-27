package day18_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        for (int j = 1; j <= 5; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("=======================");


        /*
        a
        a b
        a b c
        a b c d
        a b c d e

         */


        for (char i = 'z'; i >= 'a'; i--) {


            for (char ch = 'a'; ch <= i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();

        }
    }
}