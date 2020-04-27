package day8_IfStatement;

public class MultiBranchIfStatementIf {


    public static void main(String[] args) {

        int a = 100;

      /*  boolean zero = a==0;
        boolean negative = a<0;
        boolean positive = a>0;

        if(zero){
            System.out.println("Negative");
        }
        if (positive){
            System.out.println("Positive");
        }
        if(negative){
            System.out.println("Negative");
        }
*/
       if(a==0){
           System.out.println("zero");
       }else if(a>0){
           System.out.println("positive");
       }else {
           System.out.println("Negative");
       }


    }


    }
