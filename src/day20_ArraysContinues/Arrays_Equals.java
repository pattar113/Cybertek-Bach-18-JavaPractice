package day20_ArraysContinues;

import java.util.Arrays;

public class Arrays_Equals {
    public static void main(String[] args) {

        int []arr1={1,2,3,4};
        int []arr2={1,2,3,4};

        boolean result1 = Arrays.equals(arr1,arr2);

        System.out.println(result1);






        int []arr5={3,2,1};
        int []arr6={2,1,3};
        Arrays.sort(arr5);
        Arrays.sort(arr6);

        boolean result3=Arrays.equals(arr5,arr6);
        System.out.println(result3);



    }
}
