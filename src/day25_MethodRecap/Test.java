package day25_MethodRecap;
import Resources.Library;

import javax.crypto.spec.PSource;

public class Test {
    public static void main(String[] args) {

        String str3 = "ABSDABSBAB";
        String result = Library.RemoveDuplicates(str3);
        System.out.println(result);

        String str1 = "AABBCDEB";
        String str2 = "B";
        int num1 = Library.Frequency(str1, str2);
        System.out.println(num1);
        String str4="SSSSUUUYYYYAAABBB";

String  Result4 =Library.FrequencyOfChars(str4);
        System.out.println(Result4);
    }
    }
