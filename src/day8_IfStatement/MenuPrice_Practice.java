package day8_IfStatement;

public class MenuPrice_Practice {

    public static void main(String[] args) {

    /*    double DishPrice = 8;

       String DishName = " ";

       if (DishPrice == 22.5){
           DishName="Polo";
       }else if ((DishPrice==8)){
           DishName= " Kawap";
       }else if(DishPrice==3.99){
           DishName= " SAMSA";

       }else {

           DishName= "Invalid Price";
       }
        System.out.println(DishName);
*/

//****************


        double dishPrice = 4.99;
        String dishName = "kawap";
        String result = " ";
        if (dishName == "Laghman") {
            result = dishName + " price is $" + dishPrice;
        } else if (dishName == "kawap") {
            result = dishName + " price is $" + dishPrice;
        } else if (dishName == "Big plate chicken") {
            result = dishName + " price is " + dishPrice;
        } else {
            result = dishName + " price is $" + dishPrice;
        }


        System.out.println(result);


    }


}


