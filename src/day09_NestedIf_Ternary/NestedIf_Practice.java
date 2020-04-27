package day09_NestedIf_Ternary;

import com.sun.deploy.security.SelectableSecurityManager;

public class NestedIf_Practice {


    public static void main(String[] args) {


        // Nested if : if the condition can be evaluated to multiple scenario
        // if we have precondition
        // if(pre-condition){
        // statementA
        //if (Condition){
        //  statementB}
        int age = 16;
        boolean USCitizen = true;
        if (USCitizen) {

            if (age >= 17) {

                System.out.println(("You are eligible to vote"));
            } else {
                System.out.println("Must be 18 years old");
            }

        } else {
            System.out.println("only the US citizens are eligible to vote for Donald Trump");
        }
        System.out.println("================================");


        int score = 90;
        String grade = "";
        if (score >= 0 && score <= 100) {

            if (score >= 90) {

                grade = " A";

            } else if (score >= 80) {
                grade = "B";

            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            }else {
            grade="invalid";


        }
        System.out.println(grade);

        int score2= 75;
        String grade1 = (score2>=90)?"A":(score2>=80)?"B":(score2>=70)?"C":(score2>60)?"D":"F";


        System.out.println(grade1);


















    }
}











