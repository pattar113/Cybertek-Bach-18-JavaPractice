package day16_ForLoop;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your word");
        //String str = "ABABccddiijj";
        String str = input.nextLine();
        String result = "";

        for (int i = 0; i <=str.length()-1; i++) {
            if (result.contains("" + str.charAt(i))) {
                continue;
            }

            result += str.charAt(i);

                }
        System.out.print(result);
            }
        }