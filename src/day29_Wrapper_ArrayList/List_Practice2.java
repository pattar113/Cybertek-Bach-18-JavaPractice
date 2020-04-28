package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {

/*
Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find the maximum and minimum numbers
		NOTE: Do not use sort method

 */
public static void main(String[] args) {

    ArrayList<Integer>list = new ArrayList<>();

    list.add(100);
    list.add(120);
    list.add(220);
    list.add(50);
    list.add(300);

       int maximum = Integer.MIN_VALUE;
    //same with above """ int maximum = list.get(0);


    for(int i =0; i <list.size();i++){
        if(list.get(i)>maximum){
            maximum=list.get(i);
        }
    }


    System.out.println(maximum);


    ArrayList<Integer>list2 = new ArrayList<>();
    list2.add(100);
    list2.add(200);
    list2.add(900);

    int maximum3= max(list2);
    System.out.println(maximum3);








    int maximum2 = Integer.MIN_VALUE;
    for(Integer each : list){
        if(each>maximum2){
         maximum2 = each;
        }
    }
    System.out.println(maximum2);

}
public static int max(ArrayList <Integer>list){

    int maximum = Integer.MIN_VALUE;
    //same with above """ int maximum = list.get(0);


    for(int i =0; i <list.size();i++){
        if(list.get(i)>maximum){
            maximum=list.get(i);
        }
    }
    return maximum;



}
}
