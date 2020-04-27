package MyPractice;

import sun.lwawt.macosx.CSystemTray;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class MethodOverLoading {
    /*
    warmUp task:
	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in descending order
	6. write a double[] return method that can sort a double array in descending order
	7. write a char[] return method that can sort a char array in descending order
			NOTE: MUST apply method overloading
     */
    public static int MaxNumber(int[]arr){
        Arrays.sort(arr);
        int MaxNumber=arr[arr.length-1];
        return MaxNumber;
    }

    public static double MaxNumber(double[]arr){
        Arrays.sort(arr);

        double MaxNumber=arr[arr.length-1];
        return MaxNumber;
    }

    public static int MinNumber(int[]arr) {
      /*  int[] arr1 = {2, 3, 5, 6, 4,};
        int lastIndex = arr1.length - 1;
        int MinNumber = arr1[0];
        for (int i = 0; i <= lastIndex; i++) {
            if (arr1[i] < MinNumber) {
                MinNumber = arr1[i];

       */
      Arrays.sort(arr);

int MinNumber=arr[0];


        return MinNumber;
    }

    public static double MinNumber(double[]arr){
        Arrays.sort(arr);
        double MinNumber=arr[0];
        return MinNumber;


    }

    public static String RevArr(int[] arr) {

        Arrays.sort(arr);

        int RevArr[] = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;

        }
        return Arrays.toString(RevArr);
    }

    public static String RevArr(double[]arr){
        Arrays.sort(arr);
        double RevArr[]=new double[arr.length];
        double j =arr.length-1;
        for(double i = 0 ; i<arr.length;i++){
            RevArr[(int)i]=arr[(int)j];
            j--;
        }
       return Arrays.toString(RevArr);

    }
    public static char[] RevArr(char[]arr) {
        Arrays.sort(arr);

        char RevArr[] = new char[arr.length];
       int j=arr.length-1;
       for(int i=0;i<arr.length;i++){
           RevArr[i]=arr[j];
           j--;
       }
       return RevArr;
    }


    public static void main(String [] args) {
        int []arr2={1,4,2,8,100,-12};

        double[]arr1={10,2,3,5,100,22.0};

        System.out.println(MaxNumber(arr2));
        System.out.println(MaxNumber(arr1));
        System.out.println(MinNumber(arr2));
        System.out.println(MinNumber(arr1));
        System.out.println(RevArr(arr2));
        System.out.println(RevArr(arr1));

        char ch []={'A','b','E','T'};
        ch=RevArr(ch);
        System.out.println(Arrays.toString(ch));
    }

}
