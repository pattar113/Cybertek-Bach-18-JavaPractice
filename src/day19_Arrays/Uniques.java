package day19_Arrays;

public class Uniques {
    public static void main(String[] args) {

  /*
  writing a program that can return the uniques
   */


        String str = "AABCC";// return unique characters;
        String result = "";


        for (int j = 0; j <= str.length() - 1; j++) {
            char ch2 = str.charAt(j);


            int count = 0;// to count the occurrence of the character

            for (int i = 0; i <= str.length() - 1; i++) {
                char ch = str.charAt(i);
                if (ch == ch2) {
                    count++;
                }
            }
            if (count == 1) {//the character at index j is unique, will be concated to the result
                result += ch2;
            }
            System.out.print(count);
            System.out.print(result);


        }

    }
}