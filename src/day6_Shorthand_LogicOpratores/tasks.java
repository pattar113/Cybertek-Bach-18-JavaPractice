package day6_Shorthand_LogicOpratores;

import org.omg.CORBA.ORB;

public class tasks {


    public static void main(String[] args) {


        int ApplesCount = 20;
        int OrangesCount = 30;
        int PearsCount= 30;
        boolean comp = ApplesCount<OrangesCount || OrangesCount>= PearsCount;
        System.out.println(comp);

      String OutsideWeather;
      int Degree;
      OutsideWeather="Shinny";
      Degree= 70;
      boolean comp2 = (!(OutsideWeather=="Rainy" || Degree==70));
      System.out.println(comp2);


           int b = 2;
           boolean res = ++b == 2 || --b ==2 && --b == 2;
                       // 3 == 2 || 2==2 && 1 == 2;
                       //  false || true && false;
                       //  false || false;
                       // true;

        System.out.println(res);


        boolean x = true, z = true;
        int y = 20;
        x= (y!=10)|| (z=false);
        //x=(20!=10)|| (true=false);
        // x= true || false;
        // x= true;
        System.out.println(x);

        double A = 20;
        double B = 80;
        double C=(A+B)*25;
        double D = C%40;
        boolean Result = D <=20;

        System.out.println(Result);














    }







}
