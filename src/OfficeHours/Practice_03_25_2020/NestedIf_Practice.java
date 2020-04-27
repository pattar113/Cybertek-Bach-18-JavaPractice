package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice {

    public static void main(String[] args) {



        byte weekday=9;
        boolean ValidNumber=weekday>0&&weekday<8;
        if(ValidNumber){
            String result="";
            if(weekday==1){
                result=("its monday");

            }else if (weekday==2){
                result="its tuesday";

            }else if (weekday==3) {
                result = "its wednesday";
            }else if (weekday==4) {
                result = "its thursday";
            }else   if (weekday==5) {
                result = "its friday";
            }else if (weekday==6) {
                result = "its saturday";
            }else {
                result = "its Sunday";
            }

            System.out.println(result);



        }else {
            System.out.println("Invalid entry");
        }










    }

















}
