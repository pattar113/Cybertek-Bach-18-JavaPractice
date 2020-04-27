package day11_Scanner;

public class Browsers {

    public static void main(String[] args) {

/*3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task


 */
String browserName="FireFox";
switch (browserName){
    case "FireFox":
    case "fireFox":
        System.out.println("fire fox is opening...");
        break;
    case "safari":
        System.out.println("safari is opening...");
        break;
    case"Chrome":
        System.out.println("Chrome is opening...");
        break;
    case "Opera":
        System.out.println("Opera is opening...");
        break;
    default:
        System.out.println("invalid browser...");
}




    }





}
