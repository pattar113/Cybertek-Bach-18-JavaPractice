package day14_StringClass;

public class practice {
    public static void main(String[] args) {

        String gmail = "Cybertekschool@gmail.com";


        String gmail1 = "CYberTekSchool@Gmail.cOm";


        System.out.println(gmail == gmail1);//false

        System.out.println(gmail.equalsIgnoreCase(gmail1));// false
        System.out.println("++++++++++++++++++++++++++++++++++");
/*

valid password Must contain a special characters such as(!,_,$)
valid password should not contain spaces



 */
        String PassWord = "Pettar!";
        if (PassWord.contains(" ")) {
            System.out.println("PassWord cannot have space in it ");
        } else {
            System.out.println("valid PassWord");
        }
        System.out.println("==============================");
/*
every website address has "http" at the beginning ;
 */

        String webAddress = "WWW.amazon.com";
        if (webAddress.startsWith("WwW.")) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }


        System.out.println("+=================================");
        String email = "Cybertekscholl@yahoo.com";
        if (email.endsWith("@gmail.com")) {
            System.out.println("valid email address");
        } else {
            System.out.println("Invalid Gmail");
        }



            }

        }




