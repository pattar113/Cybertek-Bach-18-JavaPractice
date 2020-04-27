package day14_StringClass;

import java.util.Scanner;

public class credentials {

     /*
    userName:cybertek
    passWord:cybertekchool

     */

    public static void main(String[] args) {


        String ValidUserName="cybertek";
        String ValidPassword="cybertekschool";
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your user name");

        String inputUserName=input.next();

        System.out.println("Enter your password");

           String inputPassword= input.next();
           //if(inputUserName .equals(ValidUserName) && inputPassword.equals(ValidPassword)){
           if(inputUserName==ValidUserName&&inputPassword==ValidPassword){// invalid
            System.out.println("Log in successfully");


        }else {
            System.out.println("Invalid credentials");

        }
    }





}
