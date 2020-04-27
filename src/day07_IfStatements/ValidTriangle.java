package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {


        double angel1 = 30.5;
        double angel2 = 50;
        double angel3 = 60;

        short sumOfAngels = (short) (angel1 + angel2 + angel3);

        boolean validTriangle = sumOfAngels == 180;

        if (!validTriangle){
            System.out.println("The shape is a triangle");

        }








    }

}

