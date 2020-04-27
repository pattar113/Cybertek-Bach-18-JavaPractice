package day8_IfStatement;

public class equalNumber {
    public static void main(String[] args) {


        double n1 = 300.5;
        double n2 = 400.5;
        double n3 = 500.5;
        boolean n2Equaln3= n2==n3 && n2!=n1 && n1!=n3;
        boolean n1Equaln2= n1==n2 && n1 !=n3;//
        boolean n1Equaln3=  n1==n3 && n1 !=n2;
        boolean allEqual = n1 == n2 && n1 == n3;
        boolean nonOfThemEqual =n1!=n2 && n1!=n3 && n2!= n3;
        if(allEqual){
            System.out.println("all equal");
        }

if (n1Equaln2){
    System.out.println(n1+ " is equal to "+ n2);

}
if (n1Equaln3){
    System.out.println(n1 + " is qual to "+ n3);
}


if(nonOfThemEqual){
    System.out.println("non of the are equal");
}

if (n2Equaln3){
    System.out.println(n2+ " is equal to "+n3);
}


    }









}
