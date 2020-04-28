package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    //
    public static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);
        int[] RevArr = new int[arr.length];
        /*
        RevArr[0]=arr[3]
        RevArr[1]=arr[2]
        RevArr[2]=arr[1]
        RevArr[3]=arr[0]
         */
        int j = arr.length - 1;

        for (int i = 0; i <= arr.length - 1; i++) {

            RevArr[i] = arr[j];
            j--;

        }

        return RevArr;
    }

    public static String Reverse2(String str) {
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        return Reverse;

    }

    public static String RemoveDuplicates(String str) {

        // REMOVE DUPLICATE "AB";
        String result = "";//"AB"

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;

            }

        }
        return result;


    }
    public static int Frequency(String str1,String str2) {


        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make sure that we are not counting same index over again
        }
        return count;
    }
    public static String FrequencyOfChars(String str) {
        //   String str = "AABBCC";// A2B2C2
        String numDup = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i < numDup.length(); i++) {
            String ch = "" + numDup.charAt(i);//'A'
            int num = Library.Frequency(str, ch);
            result += ch + num;

        }
        return result;
    }
    public static int Frequency(String str, char ch){ // counts the ch' frequency
        char[] arr =  str.toCharArray(); // [A, B, B]
        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }
        return count;
    }
    public static String uniques(String str){ // "AABCDCD"
        String result = ""; //ACD
        for(int i=0; i < str.length(); i++){
            int num = Frequency(str, str.charAt(i) );
            if( num == 1){
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static int max(ArrayList<Integer> list){

        int maximum = Integer.MIN_VALUE;
        //same with above """ int maximum = list.get(0);


        for(int i =0; i <list.size();i++){
            if(list.get(i)>maximum){
                maximum=list.get(i);
            }
        }
        return maximum;



    }



}