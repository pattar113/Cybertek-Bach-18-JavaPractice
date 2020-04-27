package day24_MethodReturn;

import java.util.Arrays;
import Resources.Library;
public class Test {
    public static void main(String[] args) {

String str="Pettar";

String RevStr=Library.Reverse2(str);
        System.out.println(RevStr);

       int[]arr={1,2,3,4,2,3,5,6,7,-2,-99};
      arr= Library.sortDescending(arr);


        System.out.println(Arrays.toString(arr));



    }
}
