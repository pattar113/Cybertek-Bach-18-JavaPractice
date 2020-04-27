package day22_Arrays_Loops;

public class count_Odd_Even {
    public static void main(String[] args) {
/*
 4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop

 */
int []arr={1,2,4,6,5,3,8,9,7};
int countOddNumbers=0;
int countEvenNumber=0;

for(int each:arr){
    if(each%2!=0){
        countOddNumbers++;

    }else {
        countEvenNumber++;


    }



}
        System.out.println("Even numbers: "+countEvenNumber);
        System.out.println("Odd numbers: "+countOddNumbers);












    }
}
