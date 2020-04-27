package OfficeHours.Practice_04_22_2020;

import javax.crypto.spec.PSource;

public class Return_Method {
    public static void sum(int a,int b){
        System.out.println(a+b);

    }

    public static int sum2(int a,int b){


        return a+b;


}

    public static String reverse(String str) {
    String result = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        result += str.charAt(i);

    }
    return result;
}


    public static void main(String[] args) {
        sum(10,45);
      int num1=  sum2(5,9);
        System.out.println(num1);

        String name="Pettar";

        String name2=reverse(name);
        System.out.println(name2);

        System.out.println(name.equals(name2));

    }


}
