package day13_StringClass;

public class stringManipulation3 {
    public static void main(String[] args) {


// indexOf();

        String str = "I like Java programming Java T";

    int num1 = str.indexOf("Java");
        System.out.println(num1);
String  str2=" Cybertek school is awsome";

int fistS=str2.indexOf("s");
int secondS= str2.indexOf("is")+1;
        System.out.println(fistS);
        System.out.println(secondS);
int maxIndexNumber="Cybertek".length()-1;
        System.out.println(maxIndexNumber);

        String names= "Pettar";
        int a1=names.indexOf("");
        System.out.println(a1);



// lastIndexOf();*********************


        String fulllName= "Pettar Dilmurat";
        String firstName=fulllName.substring(0,fulllName.indexOf(" "));
        String lastName= fulllName.substring(fulllName.indexOf(" ")+1);

        System.out.println(firstName);



    }






}
