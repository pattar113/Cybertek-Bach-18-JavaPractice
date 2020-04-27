package day22_Arrays_Loops;

import java.util.Arrays;

/*
 1. write a program that can reverse the array
    2. write a program that sort the array in descending order
    3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop

 */
public class ReverseArray {
    public static void main(String[] args) {


int []arr={1,2,3,4,5};
for(int i=arr.length-1;i>=0;i--) {
    int eachNum = arr[i];
    System.out.print(eachNum);
}System.out.print("================");


   /* revArr[0]=arr[4];
    revArr[1]=arr[3];
    revArr[2]=arr[2];
    revArr[3]=arr[1];
    revArr[4]=arr[0];


    */
    int []revArr=new int[arr.length];//0,0,0,0,0
  revArr[0]=arr[4];
    revArr[1]=arr[3];
    revArr[2]=arr[2];
    revArr[3]=arr[1];
    revArr[4]=arr[0];



    int j=arr.length-1;
    for(int i=0;i<arr.length;i++){
        revArr[i]=arr[j];
        j--;
    }
    System.out.println(Arrays.toString(revArr));
















    }
}
