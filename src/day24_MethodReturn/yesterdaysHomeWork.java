package day24_MethodReturn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class yesterdaysHomeWork {

/*
create function that can print maximum number from any given array


 */

    public static void MaximumNumber(int[] array) {

        Arrays.sort(array);
        System.out.println("Maximum Number is: "+array[array.length - 1]);

    }

    public static void MinimumNumber(int[]array){
        Arrays .sort(array);//Ascending order
        System.out.println(" Manimum Number is: "+array[0]);


    }
    public static void Descending(int[]array){
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {


        int[] arr = {10, 32, 4, 2, 9, 76};
        MaximumNumber(arr);

        MinimumNumber (arr);

        Descending(arr);



    }




    }
