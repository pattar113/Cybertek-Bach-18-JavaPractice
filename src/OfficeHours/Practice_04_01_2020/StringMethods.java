package OfficeHours.Practice_04_01_2020;

public class StringMethods {

    public static void main(String[] args) {


        // CharAt(indexNumber) :return the char at then given index, char primitive     ===================

        String  str="Java";
        //           0123

        char ch1= str.charAt(3);
        System.out.println(ch1);

       // length: total number of chars,int

        String str2 = "5320 Case ave";
        int total = str2.length();
        System.out.println(total);

        int maxIndex =str2.length()-1;

        // concat(str): concatenation

        String str3= "Cybertek";
        str3= str3.concat(" School");

        System.out.println(str3);

       String str4="Java";

       str4=str4.concat(" Is fun!!!!!");

        System.out.println(str4);
     // toLowerCase () & toUpperCase(): change the case of string to upper or lower case;


       String  str5= "CYBERTEK";
       str5  = str5.toLowerCase();

        System.out.println("cybertek");

        String str6="muhtar";
       str6= str6.toUpperCase();

        System.out.println(str6);

// trim: take off unused space);

        String str7="  Cybertek ";
        str7 = str7.trim();
        System.out.println(str7);
        System.out.println(str7.length());

        System.out.println("// String beginning index, ending index===================");

String sentence1="I like Java";
String word1=sentence1.substring(7,sentence1.length());

String word2= sentence1.substring(2, 5+1);
        System.out.println(word1);
        System.out.println(word2);


        System.out.println("//substring (beginning index)=============================");
        String sentence2="I like to learn Java";
          //              012345678910........


        String  r1 = sentence2.substring(10);//"learn java"


        System.out.println(r1);


        String r2 ="Java";
        String r3=r2.substring(0,2);// Ja

        String r4 = r2.substring(2,3);//v
        r4=r4.toUpperCase();//V
        String r5 = r2.substring(3);//a
    String result = r3+r4+r5;//jaVa;
        System.out.println(result);


        System.out.println("replace =======================");
        //replace: replaces all the matching one , returns new string;

        String  str12 ="I like C#, C# is cool";
        str12=str12.replace("C#","Java");
        System.out.println(str12);

        // replace first: replaces first matching , returns new string;
        String t1 = "Java is fun, Java is good";

        t1=t1.replaceFirst("Java","C#");

        System.out.println(t1);
        System.out.println("===============================");

        // IndexOf(str): returns the index of first matching character, as an int

        String  y1 = "Today W is wednesday";

        int a1=y1.indexOf("W");
        int a2 = y1.indexOf("wednesday");

        System.out.println(a1);
        System.out.println(a2);

        // lastIndexOf(str):

String y2 = "Cybertek School, School";
int a3 =y2.indexOf("S");
int a4=y2.lastIndexOf("S");

        System.out.println(a4);



    }


















}
