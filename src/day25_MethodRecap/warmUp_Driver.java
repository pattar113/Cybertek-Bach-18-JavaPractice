package day25_MethodRecap;

import java.security.PublicKey;
/*
Method decleration;

Access-Modifier:
Specifier: Static ,Final,
Return Type: void Any data type;

 */
public class warmUp_Driver {
    public static void main(String[] args) {

        String str = getDriver1("FireFox");
        System.out.println(str);
        String str2=getDriver2("Edge");
        System.out.println(str2);
        String srt3=getDriver3("safari");
        System.out.println(srt3);
    }

    public static String getDriver1(String browserName) {

        switch (browserName.toLowerCase()) {
            case "chrome":return "Chrome Driver";

            case"firefox":return "Firefox Driver";

            case"safari":return "Safari Driver";

            case"opera":return "Opera Driver";

            case"edge":return "Edge Driver";

            default:return "Invalid Driver";


        }


    }
    public static String getDriver2(String browserName){

        browserName.toLowerCase();

        if(browserName.equals("chrome")) {
     return "Chrome Driver";
        }else if(browserName.equals("FireFox Driver")) {
      return  "FireFox Driver";
        }else if(browserName.equals("safari")) {
     return "Safari Driver";
        }else if (browserName.equals("Edge")) {
            return "Edge Driver";
        }else if(browserName.equals("Opera")) {
        return"Opeara Driver";
        }else {
           return "Invalid Driver";
        }


    }
    public static String getDriver3(String browserName){

        browserName.toLowerCase();

   return (browserName.equals("Chrome"))?"Chrome Driver"
                :(browserName.equals("FireFox"))?"FireFox Driver"
                :(browserName.equals("Safari"))?"Sfara Driver"
                : browserName.equals(("Edge"))?"Edge Driver"
                :(browserName.equals("Opera"))?"Opera Driver"
                :"Invalid Driver";


    }

}