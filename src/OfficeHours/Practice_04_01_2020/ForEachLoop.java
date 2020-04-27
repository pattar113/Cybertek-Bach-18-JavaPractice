package OfficeHours.Practice_04_01_2020;

public class ForEachLoop {
   /*
   for each loop :
   for(dataType variableName: Array){
    */
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4};


       for (int each : arr) {
           if (each == 3) {
               continue;
           }
           System.out.print(each + " ");
       }
       System.out.println("=================");

       int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 12, 14};

       for (int each1 : arr2) {

           if (each1 % 2 == 0) {
               if (each1 == 0) {
                   continue;


               }

               System.out.print(each1);


           }
       }}}















