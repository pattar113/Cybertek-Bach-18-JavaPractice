package day16_ForLoop;

public class Continue_Practice {

    public static void main(String[] args) {

        // skip print Pettar;

        for (char ch = 'z'; ch >= 'a'; ch--) {
            if (ch == 'e' || ch == 't' || ch == 'a' || ch == 'r') {
                continue;
            }
            System.out.print(ch + " ");
        }

        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i%2==0 || i%3==0 ) {
                continue;


            }
            System.out.print(i+" ");


        }


    }
}