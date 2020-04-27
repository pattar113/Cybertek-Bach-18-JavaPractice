package day5_Unary_ShorthandOperators;

public class PostPre {


    public static void main(String[] args) {

        //pre

        int a = 100;
        System.out.println(++a); //101
        System.out.println(a); //101


        int b = 100;



        System.out.println(--b);//99;
        System.out.println(-b);//-99;
        System.out.println(b);//99;


        //post first passes the current value, then eventually  changes the variable value


        int A = 100;
        System.out.println(A++);  //100
        System.out.println(A); // 101


        int B = 100;
        System.out.println(B--);//100
        System.out.println(B--);//99
        System.out.println(B);// 98


// post & pre
        int z = 10;
        int x = 10;

        int X = ++x;
        System.out.println(X);// pre 11
        System.out.println(z);// 11

        int s = 10;
        int f =s++;
        System.out.println(f);//10
        System.out.println(f);//10
        System.out.println(s);//11


        double t1 = 3.5;
        double t2 = t1--;
        System.out.println(t2);
        System.out.println(t1);
        System.out.println(t2);

int num = 35;

        System.out.println(num++);//35

        System.out.println(num--);//36
        System.out.println(num);
       //
       int a12 = 1;


        int  a9= -a12-- + a12++ / -a12-- * a;
// a=-1-0/-1*0;
        System.out.println(a9);

        
//*************************************************










        }












    }







