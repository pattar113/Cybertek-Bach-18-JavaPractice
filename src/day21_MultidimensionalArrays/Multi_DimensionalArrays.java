package day21_MultidimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {


         int[] arr={1,2,3};

         int [][]arr2d={{4,7,6,5},arr};
        System.out.println(arr2d.length);
       int []arr3d=arr2d[0];
         Arrays .sort(arr2d[0]);
         System.out.println(Arrays.toString(arr2d[0]));



         char [][]ch2d={{'A','B','C','D'},{'E','H','F'},{'G','H','I'}};

         char c1=ch2d[0][1];
        System.out.println(c1);

        char [] c2=ch2d[1];
        System.out.println(Arrays.toString(c2));

String [][] str2D={{"A,B,C,D"},{"E,F,G,H"},{"I,J,K,L"}};
String C3=str2D[3][2];
        System.out.println(C3);
    }
}
