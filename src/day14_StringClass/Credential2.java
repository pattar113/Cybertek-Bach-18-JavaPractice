package day14_StringClass;

import java.util.Scanner;

public class Credential2 {


      /*
      valid credential are :
      username:cybertek
      password:cybertekschool
precondition
username and password cannot be empty if they are empty ==> please enter credential
     if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */
    String username="Cybertek";
    String password="cybertekschool";
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name");
        String inputUsername = input.next();

        System.out.println("Enter your user password");
        String inputPassword = input.next();

        boolean logedIn = inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");
        boolean invalidUsername = !inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");
        boolean invalidPassword = inputUsername.equals("Cybertek") && !inputPassword.equals("cybertekschool");



        if (!inputUsername.isEmpty() && !inputPassword.isEmpty()) {// username and userpassword are not empty

            if (logedIn) {


            } else if (invalidUsername) {
                System.out.println("User name is incorrect, Password is correct");

            } else if (invalidPassword) {
                System.out.println("User name is correct, Password is incorrect");

            } else {
                System.out.println("both user name and password is incorrect");
            }
        } else {
            System.out.println("Please enter Credential");
        }


    }
}



