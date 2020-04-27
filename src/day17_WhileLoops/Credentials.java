package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {
        /*
        user:cybertek
        pass:cybertek123
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name");
        String userName = input.next();
        System.out.println("Enter pass Word");
        String passWord = input.next();
        boolean valid = (userName.equals("cybertek") && passWord.equals("cybertek123"));
        int count=1;
        while (!valid) {
            System.out.println("Please re-enter your credential");
            System.out.println("Enter user name");

            userName = input.next();

            System.out.println("Enter pass word");
            passWord = input.next();

            valid=(userName.equals("cybertek")&&passWord.equals("cybertek123"));

            count++;
            if(count==3&&!valid){
                System.out.println("Your account is locked");
                break;
            }

        }

        System.out.println("Logged in");

        }


    }