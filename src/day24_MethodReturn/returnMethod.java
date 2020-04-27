package day24_MethodReturn;

public class returnMethod {
    public static void MaxNum(int a,int b){
        if(a>b) {
            System.out.println("Maximum number is: " + a);

        }else {
            System.out.println("Maximum number is: "+b);

        }

    }
    public static int Addition(int a,int b){
        return a+b;
    }

    public static void main(String []args){
        MaxNum(300,500);
       int result= Addition(100,999);
        System.out.println(result);
        int result2=result+2000;
        System.out.println(result2);


    }

}
