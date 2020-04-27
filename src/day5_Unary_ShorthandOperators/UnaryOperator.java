package day5_Unary_ShorthandOperators;

public class UnaryOperator {


    public static void main(String[] args) {

        int a = 10; // positive 10;
        int b = -a; // positive 10;



        int a2 = -10;
        boolean result1 = a2>0;
        System.out.println(b);
        System.out.println(result1);

int x1 = -10;
int y1 = -x1;
int t3 = ++y1;

boolean result2 = x1>0;

        System.out.println(y1);
        System.out.println(result2);

        boolean result4 = y1 ==0;


        System.out.println(result4);


        int z = 100;
//
        System.out.println(z);// 100
        System.out.println(++z);// 101
        System.out.println(--z);//100
        System.out.println(z++);// 100
        System.out.println(z);//101


//
        int p =300;
        System.out.println(++p);
        System.out.println(p);
        System.out.println(--p);


    }
    }
