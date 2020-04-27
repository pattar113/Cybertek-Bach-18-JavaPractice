package day21_MultidimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
//for(Date type variableName:ArrayName

        int nums[] = {1, 2, 3, 4};

        for (int eachElement : nums) {

            System.out.println(eachElement);
        }


        String[] students = {"Muhtar", "Asia", "Murodul"};
        for (String names : students) {

            System.out.println(names);
        }


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int each : arr1) {
            if (each < 5) {
                continue;
            }

            System.out.println(each);


        }

        String[] word = {"Mamet","Yasin", "heroin"};
        for (String each : word) {

            System.out.println(word[0]);


        }
    }
}