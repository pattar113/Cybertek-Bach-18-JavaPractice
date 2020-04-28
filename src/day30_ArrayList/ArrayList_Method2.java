package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method2 {
    public static void main(String[] args) {


        ArrayList<String >list = new ArrayList<>();
        list .add("A");//0
        list .add("B");//1
        list .add("C");//2
        //list.remove(1); // "A","C"

  boolean r1 = list.remove("B");

        System.out.println(list);
        System.out.println(r1);


//list.clear();
       // System.out.println(list);
     //   System.out.println(list.size()); // clearing all the Object;

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);

    int num1 = list2.indexOf(1);
        System.out.println(num1);

        int num2 = list2.indexOf(1);
        System.out.println(num2);

        int num3 = list2.lastIndexOf(1);
        System.out.println(num3);




    }

    }

