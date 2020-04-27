package day20_ArraysContinues;

import java.util.Arrays;

public class Array_Sorting {

    public static void main(String[] args) {

     int []arr1={5,4,2,7,9,10,2,43,1} ;
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("first min number is: "+arr1[0]);
        System.out.println("fifth min number is: "+arr1[5]);
        System.out.println("first max number is: "+arr1[arr1.length-1]);
        System.out.println("second max number is: "+arr1[arr1.length-2]);


        char[]ch={'A','T','Q','Y','E'};
          Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));



        String []names={"Deniz","Rustem","Eddi","Google"};
        System.out.println(Arrays.toString(names));
Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println(names);

        System.out.println("================");

       int []arr={3,4,1,5,8,0,-32};
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
int []arrDesc=new int[arr.length];
       int j=0;
        for(int i=arr.length-1;i>=0;i--){
          //  System.out.print(arr[i]+" ");
arrDesc[j]=arr[i];
j++;
        }

        System.out.print(Arrays.toString(arrDesc));


        System.out.println();
        System.out.println("================");

        int []arr2={3,4,5,6,2,1,8,100,-23,04,};
        //          0 1 2 3 4 5 6 7     8  9
       int []arr2Desc=new int[arr2.length];// [0,0,0,0,0,0,0,0,0,0]
                                             //0,1,2,3,4,5,6,7,8,9
        Arrays.sort(arr2);// ascending order

        int k=0;
        for(int i=arr2.length-1;i>=0;i--) {

            arr2Desc[k] = arr2[i];
            k++;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr2Desc));
        //System.out.println(Arrays.equals((arr2.arr1)));


        }





    }
