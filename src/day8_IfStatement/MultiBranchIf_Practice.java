package day8_IfStatement;

public class MultiBranchIf_Practice {


    public static void main(String[] args) {


        double score= 71;
        boolean AGrade = score >= 90 && score <=100;
        boolean BGrade = score >= 80&& score <=90;
        boolean CGrade = score >= 70&& score <=80;
        boolean DGrade = score >= 60&& score <=70;

        char Grade = ' ';


        if(DGrade){
            Grade = 'D';
        }else if(CGrade){
        Grade = 'C';
        }else if(BGrade){
          Grade = 'B';
        }else if(AGrade){
            Grade = 'A';
        } else {
           Grade = 'F';
        }
        System.out.println("score "+score+" is "+Grade);











    }








}
