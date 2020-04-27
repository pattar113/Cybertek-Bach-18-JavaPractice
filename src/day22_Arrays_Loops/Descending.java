package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
/*
2. write a program that sort the array in descending order
 */
      int []arr={10,11,12,14,16,-3,100};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[]revArr=new int[arr.length];

        int j = arr.length-1;
        for(int i=0;i<arr.length;i++){
            revArr[i]=arr[j];
            j--;
        }


        System.out.println(Arrays.toString(revArr));





    }
}
