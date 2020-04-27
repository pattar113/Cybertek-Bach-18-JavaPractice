package day20_ArraysContinues;

public class Max_Min {
    public static void main(String[] args) {
/*
  1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T COVERED IN THE

 */

     int[]arr={2,3,4,5,6,7,8,9};
     int lastIndex=arr.length-1;
     int max = arr[0];
     int min=arr[0];




        for(int i=0;i<=lastIndex;i++) {
            if (arr[i] > max) {//array's index are compared with each other, and whichever is
               // greater will be assigned to
                max = arr[i];
                System.out.println(max);
            }
           if(arr[i]<min){
                min=arr[i];
                System.out.println(min);
         }

        }



    }
}
