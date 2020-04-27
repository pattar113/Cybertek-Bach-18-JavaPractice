package day22_Arrays_Loops;

public class nestedLoop {
    public static void main(String[] args) {


        //          0  1       0    1   2     0   1    2
        char[][] arr2D = {{'A', 'B',}, {'C','T', 'D', 'E'}, {'F', 'G','O', 'H'}};
        //                0              1               2

        // arr2D[0]==>{'A','B'};

        for (int j = 0; j < arr2D.length; j++) {
            for (int i = 0; i < arr2D[j].length; i++) {
                System.out.print(arr2D[j][i]);

      /*
        }

        System.out.println("==============");
//arr2D[1]==.{'C','D','E'};
        for(int i=0;i<arr2D[1].length;i++){
            System.out.print(arr2D[1][i]);
        }
        System.out.println("==========");
        //arr2D[2]=={'F','G','H'};
        for(int i=0;i<arr2D[2].length;i++){
            System.out.print(arr2D[2][i]);

        }

        System.out.println("============");
        for(int j=0;j<arr2D.length;j++){

        }
*/


            }


        }

    }}
