package day22_Arrays_Loops;

public class nestedLoop2 {
    public static void main(String[] args) {
        //                0 1 2   0 1 2 3 4   0 1  2  3   4
        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13,}};
        //                 0       1                2

        // numbers[0]==>{1,2,3}  numbers[0][i]
        //numbers[1]==>{4,5,6,7,8}  numbers[1][i]
        //numbers[2]==>{9,10,11,12,13}  numbers[2][i]

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                System.out.print(numbers[j][i] + " ");
            }

            System.out.println();


        }
    }
}