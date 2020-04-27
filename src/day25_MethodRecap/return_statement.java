package day25_MethodRecap;

public class return_statement {
    public static void main(String[] args) {
    /*
    if(10>9){
    return    ;// exits the current method only
    }
    System.out println("Hello");

     */
    System.out.println("Hello");// will execute
        method2();
        System.out.println("Hello Pattar");// no execute
    }
    public static void method1(){
        if(10>9){

            return;

        }
        System.out.println("Hello Cybertek");

    }
    public  static void method2(){
        if(10>9){
            System.exit(0);
        }
        System.out.println("Hello Cyber");
    }
}
