package day21_MultidimensionalArrays;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {


        String name="Java";
        char[]chars=name.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);


        String str="I like java";
       String []arr= str .split(" ");

        System.out.println(Arrays.toString(arr));

        System.out.println("==========================");

String sentence="Today is a great day";
String []words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

String result="";
for(int i=words.length-1;i>=0;i++){

    String eachWords=words[i];
    result+=eachWords+"";

}
        System.out.println(result);

String str2="ABCD";
String arr2[]=str2.split("");
char[]ch2=str.toCharArray();
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));


    }
}
