package day26_MethodOverLoding;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy//MMM/dd");
        /*
      year:  YYYY,YY
      Month:MM,MMM(Apr)
      Days:dd

      create a date called BirthDay: month/Days/year;
                                     apr
         */





        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));






        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEE/MMMM/dd/yy");
LocalDate date2=LocalDate.of(1999,12,25);
String  str1=date2.format(dtf2);
        System.out.println(str1);
        LocalDate date3=LocalDate.now();
        System.out.println(date3.format(dtf2));

    }
}
