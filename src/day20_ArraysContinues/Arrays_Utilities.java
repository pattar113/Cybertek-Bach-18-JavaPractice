package day20_ArraysContinues;
import java.util.Arrays;
public class Arrays_Utilities {
    public static void main(String args[]) {
   /*
   Arrays.toString(arrayName):
    */

       int[]arr={1,2,3};
      String r =Arrays.toString(arr);


        System.out.println(arr);


        String []names={"Madina","zori","Muzepper"};

        System.out.println(Arrays.toString(names));

        double[]nums={10,20,30,3.0};
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[2]+1);

        System.out.println("==============================");
      /*  practice task:
        write a program that can combine two arrays of any lengths, and return the third array
        arr1 ==> [1,2,3]
        arr2 ==> [4,5,6,7]
        arr3 ==> [1,2,3,4,5,6,7]
       */

         String []arr1={"1","2","3"};

         String []arr2={"4","5","6","7"};
       //System.out.println(Arrays.toString(arr1));
       // System.out.println(Arrays.toString(arr2));

        // System.out.println(Arrays.toString(arr1)+""+Arrays.toString(arr2));//[1, 2, 3][4, 5, 6, 7]

        //System.out.println((Arrays.toString(arr1)+Arrays.toString(arr2)));//[1, 2, 3][4, 5, 6, 7]



        int [] arr3={1,2,3};
        int []arr4={4,5,6,7};

        int []arr5=new int [arr3.length+arr4.length];

        for(int i=0; i<arr3.length;i++){
        arr5[i]=arr3[i];

        }
        for(int i=0;i<arr4.length;i++){

         arr5[arr3.length+i]=arr4[i];

}
        System.out.println(Arrays.toString(arr5));

/*
write a program that can combine two arrays of any lengths, and return the third array

		arr1 ==> [1,2,3]
		arr2 ==> [4,5,6,7]

		arr3 ==> [1,2,3,4,5,6,7]
 */

String str1[]={"Cybertek","Google","Facebook","Yahoo"};

String str2[]={"Pettar","Muhtar","Rinat","Akila"};
String str3[]=new String[str1.length +str2.length];

for(int p = 0; p<str1.length;p++) {
  str3[p]=str1[p];
}
      for(int p=0; p<str2.length;p++){
          //str3[p]=str2[p]
          str3[str1.length+p]=str2[p];
      }
        Arrays.sort(str3);
    System.out.println(Arrays.toString(str3));







    }
}
