package day24_MethodReturn;

import java.util.Arrays;

public class ReturnMethod_Practice {
    public static void main(String[]args){
        int []arr={9,7,4,6,0,11,33};
        int max=maxNumber(arr);
        System.out.println(max);
        int min=minNumber(arr);
        System.out.println(min);
    }
    public static int maxNumber(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int minNumber(int[]arr){
        Arrays.sort(arr);
        return arr[0];

    }

}
