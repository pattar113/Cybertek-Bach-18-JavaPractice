package day25_MethodRecap;

public class return_method {
    // a ,b
    public static void main(String[] args) {

        System.out.println(   Max(100,900));
        System.out.println( Max2(250,11));
    }

    public static int Max(int a, int b ){
        int Max=0;
        if(a>=b){
            Max=b;
        }else {
            Max=a;
        }
        return Max;
    }
    public static int Max2(int a,int b){
        if(a>=b){
            return a;
        }
        return b;
    }
}
