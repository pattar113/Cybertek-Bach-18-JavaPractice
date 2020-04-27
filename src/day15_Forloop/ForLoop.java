package day15_Forloop;

public class ForLoop {

    public static void main(String[] args) {


//      1. initialization: starting point
//      2. condition if condition is true
//      3.statement
//      4.iterate ( Must be capable enough to make condition false
//
        //for (int i = 0; i < 5;i++) {
        // System.out.println("Hello World");
        //}

        for (int i = 1; i < 101; i++) {// i=3, i=5,i=7,i=9
            if (i % 2 == 0 && i%3==0) {


                System.out.print(i);
            }



        }


    }
}