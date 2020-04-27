package OfficeHours.OfficeHoursPractice_04_08_2020;

public class ForLoop_task {

    public static void main(String[] args) {

        /*
        print all the numbers between 0~100 that can be divisible by 3 or 5 ;
         */
        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

        System.out.println("=======================================");

        String name = "Dammit im mad";
//            012345
        String result = "";
        int totalLength = name.length() - 1;

        for (int n = totalLength; n >= 0; n--) {
            //result+= name.charAt(n);
            result += name.substring(n, n + 1);
        }
        System.out.println(result);

            if (name.equalsIgnoreCase(result)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }

        }



}