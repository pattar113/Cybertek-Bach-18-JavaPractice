package day16_ForLoop;

public class DivisibleBye3_5 {

    public static void main(String[] args) {

/*
1, WRITE program that can print all odd number between 0~100 &can divided by 3&5 in same time;
 */
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {


                    System.out.print(i + " ");

                }

            }
        }


    }
}
