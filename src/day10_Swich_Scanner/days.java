package day10_Swich_Scanner;

public class days {
// write a program that can display the days based on the number 1-7,
    //MUST BE NESTED IF
    // PRE CONDITION :VALID NUMBER FOR THE DAY

    public static void main(String[] args) {

        int num = 5;
        String result="";

        if(num>=1&& num<=7) {

            if (num == 1) {
                result = "monday";
            } else if (num == 2) {
                result = "tuesday";
            } else if (num == 3) {
                result = "wednesday";
            } else if (num == 4) {
                result = "thursday";
            } else if (num == 5) {
                result = "friday";

            } else if (num == 6) {
                result = "saturday";

            } else if (num == 7) {
                result = "sunday";
            }



        }else {
            result = "invalid number";
        }  System.out.println(result);
            String result2="";
            result2 = (num == 1) ? "Monday" : (num==2)?"tuesday":(num==3)?"wednesday":(num==4)?"thursday":(num==5)?"friday":(num==6)?"saturday":(num==7)?"sunday":"invalid number";

        System.out.println(result2);


        String result3="";
        if(num>=1&&num<=7) {
            result3 = (num == 1) ? "Monday" : (num == 2) ? "tuesday" : (num == 3) ? "wednesday" : (num == 4) ? "thursday" : (num == 5) ? "friday" : (num == 6) ? "saturday" :"sunday";


        }else {
            result3="invalid";
        }


        System.out.println(result3);
















    }




}
