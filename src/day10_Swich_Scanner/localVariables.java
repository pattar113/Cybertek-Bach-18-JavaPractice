package day10_Swich_Scanner;
import java.util.*;
public class localVariables {
    public static void main(String[] args) {



            //YOUR CODE HERE:
            Scanner input = new Scanner(System.in);
            System.out.println("Enter seconds:");
            int inputSeconds = input.nextInt();

        int hours=inputSeconds/3600;
        int minutes=(inputSeconds%3600)/60;
        int seconds=(inputSeconds%3600)%60;

        System.out.println(hours+" hour " + minutes+" minutes and " + seconds);


        }


    }








