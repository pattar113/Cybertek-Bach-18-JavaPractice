package day21_MultidimensionalArrays;

public class longest_Shortest_words {
    public static void main(String[] args) {

        String[] names = {"Reem", "Omer", "Muhter", "Emrah", "Mooh", "Dilmurat"};
        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();
        String longestWord = "";
        String shortestWord = "";

        for (int i = 1; i <= names.length - 1; i++) {
            if (names[i].length() > maxLengthString) {


                maxLengthString = names[i].length();
                longestWord = names[i];

            }
            if (names[i].length() > maxLengthString) {
                minLengthString=names[i].length();
                shortestWord=names[i];
            }


            }

        System.out.println(longestWord);
        System.out.println(shortestWord);
    }


}