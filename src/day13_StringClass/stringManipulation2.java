package day13_StringClass;

public class stringManipulation2 {

    public static void main(String[] args) {
//Substring**********************

        String str = "Cybertek School is the best";

        String schoolName=str.substring(0,8);



        System.out.println(schoolName);

        String fullName="Kuzzat Altay";
        String firstName=fullName.substring(0,6);
        String lastName=fullName.substring(7,7+5);

        System.out.println(firstName);
        System.out.println(lastName);


        // from the full name =first name+last name
// Gmail: lastName_firstName@gmail.com
        String Murtiza="Murtiza Hassan";
        String firstname=Murtiza.substring(0,7);
        String  lastname=Murtiza.substring(8,14);
        System.out.println(firstname);
        System.out.println(lastname);


        String gmail=lastname.concat("_").concat(firstname).concat("@gmail.com");
        //String gmail=lastname+"_"+firstname+"@gmail.com";
        System.out.println(gmail);
 String s1= "I love Java programming language";
 //          0123456789.......


        String  className= s1.substring(7);
        System.out.println(className);

// Replace*******************
        String s2="I like C# Programming";

       s2= s2.replace("C#","Java");
        System.out.println(s2);

String num="He is 69 years old single man";
num=num.replace("He","Mehsut");
        System.out.println(num);



        // first replace

        String r1="i like C# , C# is fun, C# is cool";
        r1=r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2=" Tomorrow is Monday, Tomorrow is Tuesday";
        r2=r2.replaceFirst("Tomorrow","Today");

        System.out.println(r2);





















    }






}
