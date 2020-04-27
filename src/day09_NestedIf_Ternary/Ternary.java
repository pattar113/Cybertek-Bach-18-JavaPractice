package day09_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {


        int num = 100;

        String RESULT = "";
        if (num %2==0){
            RESULT="even";

        }else {
            RESULT="Odd";
        }

    // if the if statement is only returning value and assigning it to variable then we can apply ternary


        // in ternary: ? means "if"  ;  : means "else"

        String result =(num %2==0)?"even" : "odd";

        System.out.println(result);
        System.out.println(RESULT);


        System.out.println("==============================");

        int num1 = 100;
        int num2 = 200;
        int max = 0;
        if(num1>num2){
            max=num1;

        }else {
            max=num2;
        }


        int max2=(num1>num2)?num1:num2;

        System.out.println(max);
        System.out.println(max2);


        System.out.println("==========================");

        String str ="";
        if(true){
            str="Hello";
        }else {
            str="Hola";
        }

        String str2 = (true)?"Hello":"Hola";

        System.out.println(str2);
        System.out.println(str);


        System.out.println("=========================");


      int age = 20;
      boolean eligibility=(age>=21)?true:false;
        System.out.println(eligibility);
        System.out.println("==================");

        int age1= 17;
        String eligibilityToVote=(age1>=18)?"yes":"no";

        /*if(age1>=18){
            eligibilityToVote="yes";

        }else {
            eligibilityToVote="no";

            */


        System.out.println(eligibilityToVote);
        }







      }



























