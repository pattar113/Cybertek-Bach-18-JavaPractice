package day26_MethodOverLoding;

public class methodOverloading3 {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static double sum(double a, double b) {

return a+b;
    }



    public static void main(String[] args) {

sum(10,20);
double num=sum(10,20.9);
        System.out.println(num);
    }
}