package day27_DateTime;

public class uniques_Arrays {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3,};

for(int i=0;i<arr.length;i++){



        int count=0;
        for(int each:arr){
            if(each==arr[i]){
                count++;
            }
        }
        if(count==1){
            System.out.println(arr[i]);
        }
    }
        System.out.println("======================");

int[]arr2={1,2,3,4,3,2,5,6,7,8,9,100};
 uniqueElements(arr2);
        System.out.println("====================");
double[]arr3={10.11,12,13.0,14,15,16,17};
uniqueElements(arr3);



}
    public static void uniqueElements(int[]arr){

        for (int each2 : arr) {
            int count = 0;
            for (int each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(each2);
            }
        }
    }
    public static void uniqueElements(double[]arr) {
        for (double each2 : arr) {
            int count = 0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }


        }

    }
}