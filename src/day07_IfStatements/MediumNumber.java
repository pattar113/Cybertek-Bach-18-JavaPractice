package day07_IfStatements;

public class MediumNumber {

    public static void main(String[] args) {


        double a = 800;
        double b = 75000;
        double c = 700;


        boolean aMediumNumber = a < b && a > c;
        boolean bMediumNumber = b > a && b < c;
        boolean cMediumNumber = c > a && c < b;

        if (aMediumNumber) {
            System.out.println(a + " is Medium Number");
        }
if(bMediumNumber){
    System.out.println(b+" is Medium Number");
}
if(cMediumNumber){
    System.out.println(c+" is Medium Number");
}
    }

}
