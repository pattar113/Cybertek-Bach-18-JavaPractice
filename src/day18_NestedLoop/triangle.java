package day18_NestedLoop;

public class triangle {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *

         */
        int t=7;
        while(t>=1) {


            int a = 1;
            while (a <= t) {

                System.out.print("* ");
                a++;
            }
            System.out.println();
            t--;
        }

    }




}
