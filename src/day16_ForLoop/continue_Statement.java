package day16_ForLoop;

public class continue_Statement {

    public static void main(String[] args) {


        for (int y = 1; y <= 50; y++) {

            if (y % 2 == 0) {
                continue;

            }
                System.out.print(y + " ");


            }
        }


    }