package day12_JavaRecap;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Scanner_nextLine_Practice {
    public static void main(String[] args) {


    Scanner input =new Scanner(System.in);
    // 1719 decoto road,Union City CA, 94587

    // fullAddress; building number street, city, state zipCode

        System.out.println("Building Number: ");
        String Bnumber= input.next();// 1719
        input.nextLine();// used for taking out the Enter from scanner;
        System.out.println("Street");
        String  street = input.nextLine();
        System.out.println("Street is: "+street);
        System.out.println("enter the zipCode:");
        int zipCode=input.nextInt();
        input.nextLine();
        System.out.println("enter the city name nad state seprated by comma and space");
        String cityState=input.nextLine();
        String fullAddress = Bnumber+" "+street+", \n"+cityState+" "+zipCode;


        System.out.println(fullAddress);







}








}
