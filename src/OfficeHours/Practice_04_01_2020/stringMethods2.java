package OfficeHours.Practice_04_01_2020;

public class stringMethods2 {

    public static void main(String[] args) {
        // isEmpty(): checks if the string is empty, returns boolean;


        String  str1="Pettar";

        boolean r1=str1.isEmpty();// false
        boolean r2=!str1.isEmpty();// true

        System.out.println(r1);
        System.out.println(r2);

// equals(str): checks if the two strong of texts are equal or not , returns boolean;

        String s1 ="cat";
        String s2= new String("cat");
      String s3="Cat";

        System.out.println(s1==s2);// false
        System.out.println(s1.equals(s2));//true
        System.out.println(s3.equals(s2));//false
// equalsIgnoreCase(str):
        System.out.println(s3.equalsIgnoreCase(s1));//true

        System.out.println("=====================");
// contains(str): checks if the str is included in the string, boolean
        String sentences="I lika Java ";
        System.out.println(sentences.contains("Java"));//true

        String sentences2= "Top 3 Viruses are : 1. Corona, 2.Hanta, 3. Ebola";

        System.out.println(sentences2.contains("Corona"));//True
        System.out.println(sentences2.contains("Java"));//false

        System.out.println("=================================");
        //startsWith(str): checks if the string started with given str// returns boolean

        // endsWith(str): checks if the string ended with given str/ /returns boolean
        String webAddress = "www.amazon.com";
        System.out.println(webAddress.startsWith("www"));// true

        String  gmail="DPATTAR@gmail.com";
        System.out.println(gmail.endsWith(".com"));







    }












}
