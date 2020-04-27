package day24_MethodReturn;

import java.util.Arrays;

public class Array_DescendingOrder {
    public static void main(String[] args) {
        int []arr1={1,10,27,43,15};
        int []arr2={100,300,500,432,123,888,821,0};
        int []arr3={1000,2000,5000,200,};

arr1=sortDescending(arr1);
arr2=sortDescending(arr2);
arr3=sortDescending(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr1[0]);
    }
    public static int[] sortDescending(int []arr){
        Arrays.sort(arr);
        int[]RevArr=new int[arr.length];
        /*
        RevArr[0]=arr[3]
        RevArr[1]=arr[2]
        RevArr[2]=arr[1]
        RevArr[3]=arr[0]
         */
        int j=arr.length-1;

        for(int i=0;i<=arr.length-1;i++){

            RevArr[i]=arr[j];
            j--;

        }

        return RevArr;
    }

}
