package day8_IfStatement;

public class equalNumber_MultiBranchIf {


    public static void main(String[] args) {

        double n1 = 200.5;
        double n2 = 200.5;
        double n3 = 400.5;

        boolean n1Equaln2= n1==n2 && n1 !=n3;
        boolean n2Equaln3 = n2==n3 && n2 != n1;
        boolean n1Equaln3 = n1==n3 && n1!= n2;
        boolean allEqual = n1==n2 && n1==n3 && n2==n3;
        boolean allNotEqual = n1 !=n2 && n1 !=n3 && n2 != n3;

        String Result = " ";


        if(n1Equaln2){
           // System.out.println("n1 is equal to n2");
            Result = "n1 is equal to n2";
        }else if(n2Equaln3){
          //  System.out.println("n2 is equal to n3");
            Result = "n2 is equal to n3 ";
        }else if(n1Equaln3){
            //System.out.println("n1 equal to n3");
            Result= "n1 equal to n3";
        } else if(allEqual){
           // System.out.println(" all equal");
            Result=" all equal";
        }else {
           // System.out.println("allNotEqual");
            Result=" allNotEqual";
        }
        System.out.println("Result");










    }









}
