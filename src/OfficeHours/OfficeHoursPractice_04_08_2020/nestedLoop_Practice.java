package OfficeHours.OfficeHoursPractice_04_08_2020;

public class nestedLoop_Practice {
    public static void main(String[] args) {


        /*
        nested loop: loop inside another loop inner loop & outer loop
         */


        for (int i = 10; i <= 11; i++) {

            for (int j = 10; j <= 20; j++) {

                System.out.print(j + ", ");
            }


        }
        System.out.println("===============");

        int j = 3;
        while (j < 4) {
            for (int k = 1; k < 5; k++) {

                System.out.print(k + ", ");
            }

            j++;
        }


        System.out.println("==========");

        for (int v = 1; v < 9; v++) {


            for (int h = 1; h < v; h++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=================");
        for (int v = 9; v > 1; v--) {


            for (int h = 1; h < v; h++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


