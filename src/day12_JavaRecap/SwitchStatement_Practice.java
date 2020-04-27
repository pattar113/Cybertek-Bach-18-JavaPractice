package day12_JavaRecap;

public class SwitchStatement_Practice {
    public static void main(String[] args) {


        //
        switch (3){

            case 1:
                System.out.println("case 1");
                break;// exits the switch statement;
            case 2:
                System.out.println("case 2");
                break;
            default:

                System.out.println("invalid case");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
//boolean,long,double, float not accepted in switch statement
int statusCode=404;
switch (statusCode){
    case 200:
        System.out.println("ok");
        break;
    case 201:
        System.out.println("creative");
        break;
    case 404:
        System.out.println("Not founded");
        break;
    default:
        System.out.println("invalid status code");

}






    }










}
