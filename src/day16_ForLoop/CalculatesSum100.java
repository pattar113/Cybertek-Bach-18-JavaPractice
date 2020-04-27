package day16_ForLoop;

public class CalculatesSum100 {

    public static void main(String[] args) {
    /*
    write program that can calculate the sum of all thee odd numbers between 1~100;
     */
        double sum =0;
        double sum2=0;

        for (int i=0;i<=100;i++){

if(i%2!=0){//odd number
    sum+=i;

}else {//even number
   sum2+=i;
}
        }
        System.out.println("Sum of all odd numbers: "+sum);;
        System.out.println("Sum of all even numbers: "+sum2);







    }







}
