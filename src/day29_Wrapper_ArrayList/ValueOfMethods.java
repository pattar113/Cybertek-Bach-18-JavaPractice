package day29_Wrapper_ArrayList;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str="123";
       Integer a = Integer.valueOf(str);// Integer,123

        System.out.println(a);

        double b = Integer.valueOf(str);// unboxing
        System.out.println(b);



        String str2 = "15.5";
       double d1 = Double.parseDouble(str2);

       double d2 = Double.valueOf(str2);//unboxing

        System.out.println(d1);

        System.out.println(d2);
        System.out.println( d1==d2);
        System.out.println("=======================");


      int z1= 2000;

     // Long l1 = z1; dose not accept any other primitives except for long ;

      Short sh1 = 3000;

      int z2 = sh1;

        System.out.println(z2);

/*
"True"
"False"
"10000000000" ===> to float;
"123456" ==> to int

 */
String r1 = "true";
String r5 ="True";
  Boolean t1 = Boolean.valueOf(r1); // true

  boolean t2 = Boolean.valueOf(r5);// true   unboxing

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1==t2);

        System.out.println("==============================");

        int maxNum= Integer.MAX_VALUE;
        System.out.println(maxNum);

      double maxNum1 = Double.MAX_VALUE;
        System.out.println(maxNum1);


        int minNum= Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum2= Byte.MAX_VALUE;
        System.out.println(maxNum2);

        System.out.println("==========================");


        int []arr=new int [3];
        System.out.println(Arrays.toString(arr));

        boolean[]arr3= new boolean[3];
        System.out.println(Arrays.toString(arr3));

        Boolean[] arr2 = new Boolean[3];

        System.out.println(Arrays.toString(arr2));
        // default value
        // 0: byte, short, int, long
        // false: boolean;
        // 0.0 : double;
        // [](empty value): char ;


        String[] arr9 = {"1","2.5", "3", "3.5", "4.5"};









    }
}
