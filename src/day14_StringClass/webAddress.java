package day14_StringClass;

import com.sun.deploy.security.SelectableSecurityManager;

public class webAddress {

    public static void main(String[] args) {


        /*
write a program that can validate if a web address is valid

valid web address:
Must start with www.
Must ends with .com, or,.edu, or .net,or . gov;


 */

        String website= "WWW.cyBErtek.Gov";
        website=website.toLowerCase();

        boolean validending = website.endsWith(".com")||website.endsWith(".edu")||
                website.endsWith(".gov");

        if(website.startsWith("www.")&& validending){

            System.out.println("valid: started with www.");

        }else {
            System.out.println("invalid Address");
        }





            }


        }

