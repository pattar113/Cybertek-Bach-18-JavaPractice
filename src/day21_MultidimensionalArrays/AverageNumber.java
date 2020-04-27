package day21_MultidimensionalArrays;

public class AverageNumber {

    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};

        int length = arr.length;

        int sum = 0;

        for (int i = 0; i < length; i++) {
            int eachNumber = arr[i];
            sum += eachNumber;

        }
        System.out.println(sum);
        System.out.println(sum / length);


    }
    }


