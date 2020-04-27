package day21_MultidimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

      String [] DevTeam={"Zeyneb","Ruslan","Kasim","Pettar"};
      String [] Tester={"Rahman","Aishan","Osman","Ali"};
      String[]PO={"Donald","Barzy"};
        String [] Tester1={"Mahire","Mustafa","Waili","Parhat"};
String[][] ScrumTeam={ DevTeam,Tester,PO};
    ScrumTeam[0][3]="Jean";




        System.out.println( ScrumTeam[0][3]);
    String info=ScrumTeam[1][2];
        System.out.println(info);


for(String eachEmployee:ScrumTeam[0]){
    System.out.println(eachEmployee);
    System.out.println(ScrumTeam[2][1]);
}











    }
}
