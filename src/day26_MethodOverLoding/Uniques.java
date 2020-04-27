package day26_MethodOverLoding;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

public class Uniques {
    public static void main(String[] args) {


        String str="ABBCDESS";
        String result="";

        for(int i=0;i<str.length();i++){

            int num=  frequency(str,str.charAt(i));

            if(num==1){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
       /* String str2="Cybertek";
        uniques(str2);
        System.out.println(str2);

        */
    }
    public static String uniques(String str){
        String result="";

        for(int i=0;i<str.length();i++){

            int num=  frequency(str,str.charAt(i));

            if(num==1){
                result+=str.charAt(i);
            }
        }
        return result;


    }

    public static int frequency(String str, char ch) {
        char[] arr = str.toCharArray();//[A,B,B]
        int count = 0;// to count the uccurence of
        for (char each : arr) {//1
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}