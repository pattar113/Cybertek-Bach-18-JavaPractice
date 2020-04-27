package day14_StringClass;

public class stringManipulations2 {




/*is Empty()": identifies


}

 */
public static void main(String[] args) {

    String str= "  ";

    str.isEmpty();

    boolean bool1=str.isEmpty();
    System.out.println(bool1);


    String  userName="";

    if(userName.isEmpty()){
        System.out.println("Please provide your user name first");
    }

String s1= "Cat";
    String s2 = new String("Cat");

    System.out.println(s1==s2);//in different location ;

    System.out.println(  s1.equals(s2));//true


    String z1 ="Tiger";
    String z2= new String("Tiger");
    String z3= "Tiger";

    //==

    System.out.println(z1==z2);//false , different location ;

    System.out.println(z2==z3);//false
    System.out.println(z3==z1);//true

    // equals
    System.out.println(z1.equals(z2));//true

    System.out.println(z2.equals(z3));//true

    System.out.println(z3.equals(z1));//true













}





}