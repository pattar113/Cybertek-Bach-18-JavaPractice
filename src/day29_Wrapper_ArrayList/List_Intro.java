package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {


 // Syntax of ArrayList:
 //ArrayList<DataType> name = new ArrayList<DataType>();(does not support primitive; only support non primitive;


ArrayList<Integer> scores = new ArrayList<Integer>();//size 0


        scores.add(10);//autoBoxing  size will be 1 now.
        scores.add(20);// autoBoxing size will be 2 now.
        scores.add(30);// autoBoxing size will be 3 now.

        System.out.println(scores);

       int d = scores.get(2);// unboxing


        Integer d1 =scores.get(1);

        double d3 = scores.get(0);//unboxing


        System.out.println(d);
        System.out.println(d1);
        System.out.println(d3);

/*
1.create a list of Integers
2.add 5 Integers to it
3. return the maximum number from the list
4. don't use any sorting
 */






      /*  ArrayList<Integer>numbers = new ArrayList<Integer>();


        numbers.add(10);//autoBoxing  size will be 1 now.
        numbers.add(20);// autoBoxing size will be 2 now.
        numbers.add(30);// autoBoxing size will be 3 now.
        numbers.add(40);// autoBoxing size will be 4 now.
        numbers.add(50);// autoBoxing size will be 5 now.

        int numbers= Integer.MAX_VALUE;
        System.out.println(numbers);

       */








    }
}
