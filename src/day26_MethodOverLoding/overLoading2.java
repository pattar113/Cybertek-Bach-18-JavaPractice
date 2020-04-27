package day26_MethodOverLoding;

import java.util.Arrays;

public class overLoading2 {
    /*
    first method: print the sum of two int numbers;

    second method: print the sum of three int numbers
    third method: print the sum of four int number
     */
    public static void main(String[] args) {
        sum2Numbers(10,5);
        sum3Numbers(12,13,14);
        sum4Numbers(20,40,60,80);
        System.out.println("==================================");
        //a+b
        sum(10,5);
        // a+b+c
        sum(12,13,14);
        //a+b+c+d
        sum(20,40,60,80);
        int []arr1={1,2,3,4,5};
        char []arr2={'a','b','c','d'};
        double[]arr3={20,20,30,40};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
    }

    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void sum4Numbers(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public static void sum(double a,double b){
        System.out.println(a+b);

    }
}
