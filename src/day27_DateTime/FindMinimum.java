package day27_DateTime;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {5, 22, 4, 7, 1, -21, -999, -1009};
        minimum(arr);
        System.out.println(minimum(arr));

        double[]arr2={10,20,30,40,50,-10,-20,-30,-40,50};
        minimum(arr2);
        System.out.println(minimum(arr2));
    }


    public static int minimum(int[] arr) {
        int minimum = arr[0];
        for (int each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr) {
        double minimum = arr[0];


        for (double each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }
}