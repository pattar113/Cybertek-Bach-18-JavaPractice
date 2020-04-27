package day16_ForLoop;
import java.util.*;
public class replit {





        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            // YOUR CODE HERE

            int totalLength=word.length()-1;

            int middleNumber=totalLength/2;

            if(totalLength>=5 || totalLength%2!=0){

                System.out.print(word.charAt(middleNumber-1)+""+word.charAt(middleNumber)+word.charAt(middleNumber+1));

            }else {
                System.out.println("invalid");
            }



        }





    }







