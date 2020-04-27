package day07_IfStatements;

public class If_Else_Statement {

    public static void main(String[] args) {


        int number = 190 ;



        if(number>=190){


            System.out.println(number+" is positive");
        }

        if(number<190){

            System.out.println(number+ " is negative ");
        }
if (number<=190){
    System.out.println(number +" is positive ");

}else {
    System.out.println(number+ " is negative");
}
// else block only gets excuted if block is false;


        int number2 = 100;

        if(number2 %2!=0){

            System.out.println(number2+ " is odd number");
        }
        if(number2 %2==0) {


            System.out.println(number2+ " is even number");

        }
if(number2 % 2== 0 ){
    System.out.println(number2+" is even number");

} else {


    System.out.println(number2+ " is odd number");
}





int age =17;
if(age>=21){
    System.out.println("here is your vodka");
}else {
    System.out.println(" go home kid");


}


   boolean testPositiveForWuhanVirus = false;

if(testPositiveForWuhanVirus){
    System.out.println("Buy more toilet papers and stay at home");
}else {
    System.out.println("do more coding");
}


    }












}
