package day6_Shorthand_LogicOpratores;

public class SingleIfStatement {


    public static void main(String[] args) {

        boolean coldWeather = true;

        if (coldWeather) {
// only true
            System.out.println("wear your hat");
            System.out.println("wear your jacket");

            boolean CoronaDetected = false;

            if (CoronaDetected) {


                System.out.println("Buy more toilet papers");
                System.out.println("stay at home ");
                System.out.println(" do more Java coding");

            }


            System.out.println("===========================");


            int a = 101;

            boolean evenNumber = a % 2 == 0; //if number can be divided by 2 the remainder


            if (evenNumber) {
                System.out.println(a + " is even number ");
            }

            if (!evenNumber) {
                System.out.println(a + " is not odd number");


            }


        }


    }
}