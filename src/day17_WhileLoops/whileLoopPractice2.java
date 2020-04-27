package day17_WhileLoops;

public class whileLoopPractice2 {

    public static void main(String[] args) {


        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.print(i);
            }
        }
        System.out.println("===================");
        int i=0;
        int sum=0;
        while (i<=10){
            if(i%2==0){
              //  System.out.print(i);
                sum+=i;
                System.out.print(i);
            }
            i++;
        }







    }









}
