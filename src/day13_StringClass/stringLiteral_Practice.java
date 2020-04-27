package day13_StringClass;

public class stringLiteral_Practice {

    public static void main(String[] args) {
        String str="cat";// String pool
        String str2= new String("cat");// Java Heap

        System.out.println(str+":"+str2);

        System.out.println(str==str2);//two different object;
        String str3="cat";
        System.out.println(str ==str3);
        String str4=new String("cat");
        System.out.println(str2==str4);
String s1 = " Java";
s1="JavaScript";
s1="Java";
        System.out.println(s1);
String s2="Java";

        System.out.println(s1==s2);







    }



















}
