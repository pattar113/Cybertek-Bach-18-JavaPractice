package day29_Wrapper_ArrayList;

public class ParseMethods {


    //Parse method converts String to primitive;

    public static void main(String[] args) {

      String str= "123";

     int a = Integer.parseInt(str);

        System.out.println(str+1);//text
        System.out.println(a+1);//number

        //int a = Integer.parsInt(string); // converting string to primitive;


        byte b1 = Byte.parseByte(str);
        System.out.println(b1+6);

          Integer  I1= (int)Byte.parseByte(str);// AutoBoxing
         // primitive to WrapperClass ==>AutoBoxing
        // WrapperClass tp primitive ==>Unboxing

         String str1 ="10.28";
         float f1 = Float.parseFloat(str1+1);//concat

        System.out.println(f1+1);//Addition

       double d1= Double.parseDouble(str1);
        System.out.println(d1+1);//Addition;

String str3 ="3123437373";
long num1 = Long.parseLong(str3);

System.out.println(num1+2);

Long num2=Long.parseLong(str3);
        System.out.println(num2+2);

        String result="true";


         boolean result1 = Boolean.parseBoolean(result);
        System.out.println(result1);



        String result2= "TrUe";
        boolean r3 = Boolean.parseBoolean(result2);
        System.out.println(r3);



    }


}
