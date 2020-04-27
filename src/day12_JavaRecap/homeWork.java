package day12_JavaRecap;
import java.util.Scanner;
public class homeWork {

/*Home work due by monday::::::: write a program that asks to enter 5 numbers and prints the in ascending order
ex:
5,4,1,
out put:
1,4,5,
 */
public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1= input.nextInt();

    System.out.println("Enter the second number");
    int num2=input.nextInt();

    System.out.println("Enter the third number");
    int num3=input.nextInt();


    if(num1<num2&&num1<num3&&num2<num3){
        System.out.println(num1+","+num2+","+num3);

}else if(num2<num3&&num2<num1&&num3<num1){
        System.out.println(num2+","+num3+","+num1);

}else if(num3<num2&&num3<num1&&num2<num1){
        System.out.println(num3+","+num2+","+num1);


}else if(num2<num1&&num2<num3&&num1<num3){

    }else if (num3<num1&&num3<num2&&num1<num2){
        System.out.println(num3+","+num1+","+num2);
    }else {
        System.out.println(num1+","+num3+","+num2);



    }

    System.out.println("***********************************************");












}







}