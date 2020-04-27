package day24_MethodReturn;

public class BirthYear {
    public static void Age(short birthYear) {
        int currentYear = 2020;
        int age = currentYear - birthYear;
        if (age > 0 && birthYear > 1900) {
            System.out.println(age);

        } else {
            System.out.println("Invalid");

        }
    }

    public static void printHello() {
        System.out.println("Hello world");


    }

    public static void cyberTek() {
        System.out.println("Cybertek");

    }

    public static void printHelloCybertek() {
        printHello();
        cyberTek();
    }
        public static void main (String[]args){
            Age((short) 2012);
            printHello();
            cyberTek();
            printHelloCybertek();
        }

    }
