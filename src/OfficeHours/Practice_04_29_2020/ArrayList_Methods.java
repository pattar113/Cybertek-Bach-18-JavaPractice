package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {

  /*
  add(),set(),size(),get(),remove(),clear(),indexOf(),lastIndexOf()

  ArrayList size is Dynamic, it can auto-adjusted
  ArrayList has Index Number
   */


    public static void main(String[] args) {


        ArrayList<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1,30);


        System.out.println(list);

        System.out.println(list.size());
        //[10,30,20]
     int  num1 =  list.get(0);

        System.out.println(num1);

         ArrayList<String >list2 = new ArrayList<>();
         list2.add("A");
         list2.add("B");
         list2.add("C");
         list2.add("D");
         list2.add(2,"E");


        for(int i  = 0; i<list2.size();i++) {
            String str = list2.get(i);


            System.out.print(str+", ");
        }

for(String each : list2){
    System.out.println(each);

}

//A,B,E,C,D
list2.set(3,"F");
        System.out.println(list2);
      
      boolean r1 = list2.remove("A");
      System.out.println(list2);
      boolean r2 =list2.remove("Z);
                               
       System.out.println(r2);
        System.out.println(list2.size());                       
                               

    }



}
