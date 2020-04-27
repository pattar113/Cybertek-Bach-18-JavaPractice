package day20_ArraysContinues;
import java.util.Arrays;
public class StringMethod {
    public static void main(String[] args) {

       String STR="Pettar";

       char[] character =   STR.toCharArray();
        System.out.println(Arrays.toString(character));


        String str1="Cybertek School";
        String str2="School Cybertek";
        char[]ch1=str1.toCharArray();
        char []ch2=str2.toCharArray();
        System.out.println(Arrays.toString(ch1));//[C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        System.out.println(Arrays.toString(ch2));//[S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

    Arrays.sort(ch1);
    Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean equalsStr=Arrays.equals(ch1,ch2);
        System.out.println(equalsStr);




    }
}
