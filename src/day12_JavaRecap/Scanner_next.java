package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_next {

    public static void main(String[] args) {
      //declare scanner;

        Scanner scan=new Scanner(System.in);

       // String str= scan.next();
       // System.out.println(str);
// 5148 golden road Pleasanton CA, 94566
          String fullAddress="";
          System.out.println("Enter the number of the building");
          short BuildingNumber=scan . nextShort();
          fullAddress+=BuildingNumber+" ";//fullAddress= fullAddress+Bulding Name+" ";

          System.out.println("Enter the street name: ");
          String streetName= scan.next();
          fullAddress+=streetName+" ";
          System.out.println("enter the type of road");
          String roadType=scan.next();
          fullAddress+=roadType+", ";
          System.out.println("Enter city name,state,zipCode");
          String cityName=scan.next();
          fullAddress+=cityName+" ";
          String state= scan.next();
          fullAddress+=state+" ";
          int zipCode=scan.nextInt();
          fullAddress+=zipCode;
          System.out.println("Your address is: "+fullAddress);









    }





















}
