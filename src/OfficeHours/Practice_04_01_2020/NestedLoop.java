package OfficeHours.Practice_04_01_2020;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        char[][] arr2D = {{'A', 'B'}, {'C', 'D'}, {'E', 'F', 'G'}};

        //arr2d[0]
        for (int j = 0; j < arr2D.length; j++) {
            for (int i = 0; i < arr2D[j].length; i++) {
                System.out.println(arr2D[j][i]);
                //System.out.println(arr2D[1][i]);
                //  System.out.println((arr2D[2][i]));

            }
            System.out.println("==================");

            for(char[] each1DArray:arr2D){
                for(char eachElement:each1DArray){

                System.out.print(eachElement);
            }








        }
    }
}}