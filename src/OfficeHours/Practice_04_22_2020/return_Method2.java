package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class return_Method2 {
    // write a return method that can return second Max number form any given Array;
    public static void main(String[] args) {

        int[] arr = {100, 20, 45, 67, 99, 900, 55, 500};
     int num2= secondMax(arr);

    }
public static int secondMax(int[]arr){



    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int secondLastIndexNum=arr.length-2;

    int secondMaxNum=arr[secondLastIndexNum];
    System.out.println(secondMaxNum);

     return secondMaxNum;

}
}
