package day10_Swich_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
// variable:long,double,float,boolean not accepted;

        switch (4){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("invalid case");
                break;
        }

        System.out.println("=====================================");
// find owner according to room number;
      //  room 15,25,33,45,55, 60;

        int room1=15;
        int room2=25;
        int room3=33;
        int room4=45;
        int room5=55;
        int room6=60;

        int roomNumber=55;

     switch (roomNumber){
         case 25:
             System.out.println("Dilxat");
             break;
         case 15:
             System.out.println("Mehmut");
             break;
         case 33:
             System.out.println("Pettar");
             break;
         case 45:
             System.out.println("Hemit");
             break;
         case 55:
             System.out.println("Mustafa");
             break;
         case 60:
             System.out.println("Abdurahman");
             break;
         default:
             System.out.println("invalid number");

     }









    }
















}
