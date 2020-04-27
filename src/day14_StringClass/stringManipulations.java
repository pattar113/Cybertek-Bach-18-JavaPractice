package day14_StringClass;

public class stringManipulations {


    public static void main(String[] args) {


        String str = " I like to learn Java. I like to watch movie Jumanji";


int a1=str.indexOf("J");//returning first matching one


        System.out.println(a1);
int a2=str.indexOf("Jum");
        System.out.println(a2);

int a3= str.indexOf("a. I")+3;
        System.out.println(a3);


// lastIndexOf

        int a4=str.lastIndexOf("I");

        System.out.println(a4);






        String z= "I like C#, C# is cool";

        int c1 = z .lastIndexOf("C#");

        System.out.println(c1);
        String x= " I like Java, Java is fun,";

        int d1=x.lastIndexOf("Java is fun");

        System.out.println(d1);

int d3=x.indexOf("Java i");
        System.out.println(d3);



        char ch1= x.charAt(20);

        System.out.println(ch1);







    }




}
