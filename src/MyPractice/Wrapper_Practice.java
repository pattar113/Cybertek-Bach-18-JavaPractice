package MyPractice;

import java.util.ArrayList;

public class Wrapper_Practice {
    public static void main(String[] args) {
  /*
  warmUp TASKS:
	1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits

    4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
   */

// 2. 2. write a program that can print the list of integers in reversed order
//		ex:
//			list=> {1,2,3,4,5}
//			output: 5 4 3 2 1

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (Integer i = list.size() - 1; i >= 0; i--) {

            int result = list.get(i);
            System.out.print(result);
        }
        System.out.println("==============================");
        System.out.println();
/*
 write a program that can print out the unique elements from an int array
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
 */
ArrayList<Integer> list1 = new ArrayList<>();
        int arr[] = {1, 1, 2, 3, 3, 4, 5};


  ArrayList<Integer>unique = new ArrayList<>();

for(int i = 0 ; i < arr.length; i ++){
    int count =0 ;
    for (int j=0; j<arr.length; j++){
        if(arr[j]==arr[i]){
         count++;
        }
    }
if(count==1){
unique.add(arr[i]);
}
}
        System.out.println(unique);

    }

}
