package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {


        int number = 100;
        char ch1 = ' ';
        if(number>0){
            ch1='+';

        }else if (number<0){
            ch1='-';
        }else {
            ch1='0';
        }
        System.out.println(ch1);

char ch2=(number>0)?'+':(number<0)?'-':'0';

        System.out.println(ch2);

        System.out.println("======================");

        byte score= -49;
        String grade= "";
        if (score>=90&& score<=100){
            grade= " excellent";

        }else {
            grade=" not eligible";

        }
        System.out.println(grade);

String grade1=(score>=90&& score<=100)?"excellent":(score>=80&& score<=90)?"Great":(score>=70&& score<=80)?"good":
        (score>=60&& score<=70)?"pass":(score<60&& score>0)?"fail":("not valid");


        System.out.println(grade1);
















    }






}
