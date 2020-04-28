package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {
        /*
        write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(list);
        ArrayList<Integer>uniques = new ArrayList<>();
        // list.get(0)==>1

       // for(int i= 0; i<list.size(); i++) {
        for(int each2:list){
            int count = 0 ;

            for(Integer each : list){
                if(each == list.get(each2)){

                    count++;

                }
            }
            if(count ==1 ){
                uniques .add(list.get(each2));
        }

        }
        System.out.println(uniques);



    }
}
