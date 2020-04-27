package OfficeHours.OfficeHoursPractice_04_08_2020;

import java.util.Arrays;

public class singleDArray {
    public static void main(String[] args) {



        String []names={"Aron","Jacson","Luoise","Hanjar"};
        int length=names.length;
        String []namesRev=new String[length];

        namesRev[0]=names[3];
        namesRev[1]=names[2];
        namesRev[2]=names[1];
        namesRev[3]=names[0];
        System.out.println(Arrays.toString(namesRev));


int k=length-1;
        for(int i=0;i<length;i++){
            namesRev[i]=names[k];
            k--;
            System.out.println(Arrays.toString(namesRev));

        }














    }
}
