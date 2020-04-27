package OfficeHours.Practice_04_01_2020;
import javax.crypto.spec.PSource;
import java.util.Arrays;
public class ArrayUtility {
    /*
    Arrays.sort(); sorts array in ascending order
    Arrays.equals(); arr1==arr2
    Arrays.toString(); single Dimentional
    Arrays.deepToString();multi Dimentional
     */
    public static void main(String[] args) {



        int[] arr = {1, 3, 21, 45, 32, 89, 94, 43, -3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

int salaries[]={100000,32,4600000,567,321,2222,90000};
int length=salaries.length;
int lastIndex=length-1;
Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        System.out.println("Minimum salaries: "+salaries[0]);
        System.out.println("Maximum salaries: "+salaries[salaries.length-1]);

        System.out.println("==================");

        int[]arr1={1,2,3};
        int []arr2={2,1,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));

    }
}