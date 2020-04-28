package day30_ArrayList;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {


        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(1,6);
        list1.add(0,4);


        list1.set(3,9);

        System.out.println(list1);

        System.out.println(list1.get(2));
        int [] arr = {1,2,3,4};
        arr[3]=5;
        System.out.println(Arrays.toString(arr));


ArrayList<String>list2= new ArrayList<>();
list2.add("A");
list2.add("D");
list2.add(1,"C");
list2.add(1,"B");// "A","B","C","D"
list2.set(2,"E");//"A","B","E","D"  replacing index2
list2.set(3,"F");//"A","B","E","F"   replacing index3

        System.out.println(list2);
        System.out.println("==================================");

        ArrayList<Integer>list3=new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
       //list3 =  12345

        list3.remove(3);//removing index 3
       // list3 = 1,2,3,5

        Integer a = 1;
        list3.remove(a);// removing object 1
        System.out.println(list3);


        ArrayList<Integer>list4 = new ArrayList<>();

        list4.add(10);
        list4.add(20);
        list4.add(30);
       // 10,20,30
       // list4.remove(1);// removing 20;

      Integer c = 20;
        list4.remove(c);     // removing 20;  also can be assigned to boolean, if the object is there will be return true


        System.out.println(list4);









    }
}
