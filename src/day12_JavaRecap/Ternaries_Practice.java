package day12_JavaRecap;
import java.util.Scanner;
public class Ternaries_Practice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter status code");
        int statusCode=input.nextInt();

        String result="";

        if(statusCode==200){
            result="ok";




        }else if(statusCode==201){
            result="created";

        }else if(statusCode==202){
            result="accepted";

        }else {
            result="invalid status code";
            System.out.println(result);

        }
        System.out.println("enter status code");
        int statusCode2=input.nextInt();

String result2=(statusCode2==202)?"ok":(statusCode2==204)?"accepted":"invalid";
        System.out.println(result2);






    }







}
