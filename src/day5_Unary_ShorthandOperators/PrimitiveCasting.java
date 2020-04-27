package day5_Unary_ShorthandOperators;

public class PrimitiveCasting {


    public static void main(String[] args) {
        //implicit  casting; all done automatically


       int a =10;

       long b = a;
       // b = 10l  implicit casting automatically

        int a1 = 100;
        long b1 = (long)a1;// manually doing the implicit casting


        // int c = b;


        // explicit casting;

        int Inum = 100;

        byte Bnum = (byte)Inum;
        short Snum = (byte)Inum; // smaller or equal;



        double Dnum = 5.5;
        float Fnum= (float) Dnum;
        System.out.println(Fnum);


        double D1 = 10.5;

        long L1 = (int)D1;
        System.out.println(L1);


float F1 = 60.5f;
int i1 = (int)F1;





char ch1 = 'a';

short shi = (byte )ch1;
char ch2 = ch1;
double dbl1 = ch2;

int z1 = 10;
double t1b = z1;

short v1 = (byte)z1;






















        }








double num3 = 23;
    short num2 = (byte)num3;


short y3 = 179;
byte z3 = (byte)y3;














    }








