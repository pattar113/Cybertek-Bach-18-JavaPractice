package day8_IfStatement;

public class Practice {

    public static void main(String[] args) {

        int StatusCode = 403;

        boolean result1 = StatusCode == 200;
        boolean result2 = StatusCode == 201;
        boolean result3 = StatusCode == 202;
        boolean result4= StatusCode == 301;
        boolean result5 = StatusCode == 303;
        boolean result6 = StatusCode == 304;
        boolean result7 = StatusCode == 307;
        boolean result8 = StatusCode== 400;
        boolean result9 = StatusCode== 401;
        boolean result10 = StatusCode== 403;
        boolean result11 = StatusCode== 404;
        boolean result12 = StatusCode== 410;
        boolean result13 = StatusCode== 500;
        boolean result14 = StatusCode== 503;

     if (result1){
         System.out.println( "ok");
     }
      else  if( result2) {
            System.out.println("Created");
        }

else if (result3){
            System.out.println("Accepted");
        }
else if (result4){
            System.out.println("Moved Permanently");

        }
else if (result5){
            System.out.println("See other");
        }
else if(result6){
            System.out.println("Not Modified");
        }
else if (result7){
            System.out.println("Temporary Redirect");
        }

else if(result8){
            System.out.println("Bad Request");
        }
else if (result9){
            System.out.println("Unauthorized");
        }
else if (result10){
            System.out.println("Forbidden");
        }
else if (result11){
            System.out.println("Not Found");
        }
else if (result12){
            System.out.println("Gone");
        }


else if (result13) {
            System.out.println("Internal Server Error");
        }
else {
            System.out.println("Service Unavailable ");
        }




    }












}


