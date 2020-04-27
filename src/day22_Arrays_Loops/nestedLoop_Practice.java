package day22_Arrays_Loops;

public class nestedLoop_Practice {


    public static void main(String[] args) {

        int[][] numbers = {

                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},

        };
// print all even numbers in single line;
// count odd numbers ==> return the total odd numbers

        int countOdd = 0;
        for (int j = 0; j < numbers.length; j++) {

            for (int i = 0; i < numbers[j].length; i++) {

                int num = numbers[j][i];
                if (num % 2 == 0) {
                    System.out.print(num + " ");

                } else
                    countOdd++;
                System.out.println(countOdd);

            }




        }
    }
}