package day21_MultidimensionalArrays;
import java.text.DecimalFormat;
public class Formatting_Decimal {
    public static void main(String[] args) {

       DecimalFormat DF=new DecimalFormat("0.00");// rounding the decimal;
       double a = 10.0/3;

        System.out.println(a);
        System.out.println(DF.format(a));













    }
}
