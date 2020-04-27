package day26_MethodOverLoding;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(1983,10,01);
        System.out.println(date1);


        LocalDate Birthday=LocalDate.of(2012,05,15);
        System.out.println(Birthday);

        // isAfter(date2)

       boolean result= date1.isAfter(Birthday);

        System.out.println(result);


        // isBefore(date2)

        boolean result2=date1.isBefore(Birthday);
        System.out.println(result2);
        // isEqual(date2)
        boolean result3=date1.isEqual(Birthday);
        System.out.println(result3);

        // isLeapYear();

        boolean result4=date1.isLeapYear();
        System.out.println(result4);
        System.out.println("===============");

        LocalDate now=LocalDate.now();
        System.out.println("Today is : "+now);
        String str=now.toString();
        System.out.println(str.replace("-","**"));





    }

}
