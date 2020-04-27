package OfficeHours.OfficeHoursPractice_04_08_2020;

public class do_WhileLoop {

    public static void main(String[] args) {

/*
do{
statement:
}while(condition);
execution order: i. statement, 2. condition if true: repeats statement, if false exit the loop
 */

        boolean b = false;
        while (b) {
            System.out.println("Hello world");

        }
        System.out.println("==============");

        do {
            System.out.println();

        } while (b);
        System.out.println("Hello Cybertek");
        System.out.println("================");

        int o = 0;
        do {
            if (o % 2 == 0&&o%5==0) {


                System.out.print(o + " ");

            }

            o++;
        }while (o <= 100) ;

    }
}