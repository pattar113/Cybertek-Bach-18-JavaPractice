package OfficeHours.Practice_03_25_2020;

import com.sun.deploy.security.SelectableSecurityManager;

public class MultiBranchIf_Practice {


    public static void main(String[] args) {


        int number=0;

        if(number>0){
            System.out.println("its positive number");

        }else if (number<0){
            System.out.println("its negative number");

        }else {
            System.out.println("its zero");
        }


        int num1 =100;
        int num2=200;
        if(num1>num2){
            System.out.println(num1 +"is greater than "+ num2);

        }else if(num2>num1){
            System.out.println(num2 +"is greater than "+ num1);

        }else {
            System.out.println(num2 +"equal to"+ num1);

        }


        String browserName="Chrome";
        if (browserName=="FireFox"){
            System.out.println("Firefox browser is opening");

        }else if (browserName=="Chrome") {
            System.out.println("Chrome browser is opening");
        }else if (browserName=="Internet Explorer"){
                System.out.println("Internet browser browser is opening");
        }else if (browserName=="Safari Explorer"){
            System.out.println("Safari Explorer browser is opening");
        }else if (browserName=="Opera browser"){
            System.out.println("Opera browser is opening");

        }else {
            System.out.println(" invalid browser name");
        }






    }








}
