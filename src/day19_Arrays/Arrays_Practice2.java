package day19_Arrays;

import java.util.Arrays;

public class Arrays_Practice2 {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30};

        System.out.println(arr.length);

        System.out.println("================");

        /*
        initializing the size of the array;
        1. giving the values: size will be initialized automaticliy]
         */

        int[] arr1 = new int[5];

        System.out.println(arr1[0]);

        System.out.println(arr1[2]);

        String[] Testers = new String[3];
        System.out.println(Arrays.toString(Testers));
        Testers[0] = "Reem";
        Testers[1] = "Pettar";
        Testers[2] = "Muhtar";
        System.out.println(Testers[0]);
        System.out.println(Testers[1]);
        System.out.println(Testers[2]);
        System.out.println(Testers[2]);
        System.out.println();
        System.out.println("============");


// write program that asks"enter a name" 10 times, and store each of the names in the array student




        String [] Students = new String[11];
        Students[0]= "Pettar";
        Students[1]= "Yasin";
        Students[2]= "Jappar";
        Students[3]= "Ayshamhan";
        Students[4]= "Aynur";
        Students[5]= "Elahun";
        Students[6]= "Gerniyashan";
        Students[7]= "Osman";
        Students[8]= "Patigul";
        Students[9]= "Aytilla";
        Students[10]="Omer";
        System.out.println(Students[6]);


        }
    }
