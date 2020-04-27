package day24_MethodReturn;

import javax.crypto.spec.PSource;

public class StringReverse {
    public static void main(String[] args) {

        Reverse("United States Of America");
        String name= Reverse2("East Turkistan");
        System.out.println(name);
    }
    public static void Reverse(String str){
        String Reverse="";
        for(int i=str.length()-1;i>=0;i--){
            Reverse+=str.charAt(i);

        }
        System.out.println(Reverse);
    }
    public static String Reverse2(String str){
        String Reverse="";
        for(int i=str.length()-1;i>=0;i--){
            Reverse+=str.charAt(i);
        }
        return Reverse;

    }
}
