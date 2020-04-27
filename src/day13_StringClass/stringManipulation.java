package day13_StringClass;

public class stringManipulation {

    public static void main(String[] args) {

        String  str = "Cybertek";
        //             01234567
        char ch1=str.charAt(5);
        System.out.println(ch1);
        System.out.println(ch1=='A');
        System.out.println(ch1=='t');

        System.out.println("*********************************");

           int totalLength=   str.length();
        System.out.println(totalLength);
        System.out.println(totalLength>250);

String str2="Today is great day, Java is fun";
int  maxIndexNum=str2.length()-1;
// maxIndex: length()-1
        System.out.println(maxIndexNum);

String  s1= "Cybertek";
      s1= s1.concat(" School");
        System.out.println(s1);
     String s2="Java";
    s2= s2.concat(" is a programming language");
        System.out.println(s2);

        String  r1= "Java is fun";
       r1= r1.concat(", and its easy");
       System.out.println(r1);

        String name="CYBERTEK";
        name=name.toLowerCase();
        System.out.println(name);

        String name1="pattar dilmurat";
        name1=name1.toUpperCase();
        System.out.println(name1);
String num2 = "   Today is great day, and very warm  ";
num2=num2.trim();
        System.out.println(num2);

        System.out.println("==================================");

        String str6 = "Javaabcde";
                     //012345678
        System.out.println(str6.substring(4));



    }








}
