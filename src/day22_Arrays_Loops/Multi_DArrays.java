package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {
        // n dimensional array contains(n-1)dimensional arrays
        int[]arr={1,2,3};
                //0 1 2

        // 2D array;    0 1 2   3 4 5 6
        int [][]arr2D={{1,2,3},{4,5,6,7}};
                        // 0      1

        int []arr1D=arr2D[0];

        System.out.println(Arrays.toString(arr1D));

        System.out.println(Arrays.toString(arr2D[0]));

        System.out.println(arr2D[0][2]);

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));

for(int each :arr2D[0]){
    System.out.println(each);
}
for(int i=0;i<arr2D[0].length;i++){
int num=arr2D[0][i];

    System.out.print(num);
}



    }
}
