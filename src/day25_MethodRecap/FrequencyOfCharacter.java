package day25_MethodRecap;

import Resources.Library;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AABBCC";// A2B2C2
        String numDup = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i < numDup.length(); i++) {
            String ch = "" + numDup.charAt(i);//'A'
            int num = Library.Frequency(str, ch);
            result += ch + num;

        }

        System.out.print(result);


    }

    public static String FrequencyOfChars(String str) {
        String numDup = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i < numDup.length(); i++) {
            String ch = "" + numDup.charAt(i);//'A'
            int num = Library.Frequency(str, ch);
            result += ch + num;

        }
        return result;
    }
}