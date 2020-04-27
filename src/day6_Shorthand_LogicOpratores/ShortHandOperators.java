package day6_Shorthand_LogicOpratores;

public class ShortHandOperators {
    public static void main(String[] args) {




        int x = 20;
        x += 10;// x= 30
        String schoolName =  "CyberTek";
        schoolName+= 12345;
        System.out.println(schoolName);



        int a1 = 100;
        int b1 =(a1*2) + ++a1;

        System.out.println(b1);

        int x1= 10;
        int y = x1 += 10*2;//30

        System.out.println(x1);//30 why x1 = 30 ?????
        System.out.println(y);//30

int q = 20;
int p = q*=20*3;
        System.out.println(p);//1200
        System.out.println(q);//1200

int num1 = 100;
num1/=20+10;
        System.out.println(num1);
int num2= 400;
num2/=20+10;

int num3 = 300;
num3 %= 10+20;

        System.out.println(num3);//0
        System.out.println(num2);


















    }















}
