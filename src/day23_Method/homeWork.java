package day23_Method;

import java.util.Arrays;

public class homeWork {

    public static void main(String[] args) {

MaximumNumberArray();
MinimumNumber();
Descending();


    }


    public static void MaximumNumberArray() {

        int[] arr = {1, 2,19,5,0,3,6};

        Arrays.sort(arr);

        System.out.println(arr[arr.length-1]);




    }
    public static void MinimumNumber() {


        int[] arr = {2, 4, 32, -1, 88, 100};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
    public static void Descending (){
        int arr []={3,2,1,5,4,32,101,-543};
        Arrays.sort(arr);
        int length=arr.length;
        int[] arr1=new int[length];

        for(int i=0;i<arr.length;i++){
        arr1[i]=arr[length-1-i];



    }
        System.out.println(Arrays.toString(arr1));
    }

}
