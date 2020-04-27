package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {


      String str="JAva is fun,JaAAAva,Java,Java is cool".toLowerCase();


        int count=0;
        String  word="a".toLowerCase();

       while (str.contains("a")){
           count++;
           str=str.replaceFirst("a","");//after counting first "e", we need to remove it from the Str;
       }
        System.out.println(count);








    }













}
