package OfficeHours.Practice_04_22_2020;

public class method_OverLoading {

    // using multiple method with the same name but different parameter

    public static void method1(int a){
        System.out.println("hello word");
    }

    public static void method1(double b){
        System.out.println("hello Cybertek");
    }

    public static void method1(int a,int b){
        System.out.println("hello Santa");
    }

    public static void main(String[] args) {
        method1(20.0);
    }
}
