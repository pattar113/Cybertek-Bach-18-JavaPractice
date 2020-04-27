package day23_Method;

/*
4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
	[1,2,3] == > [3,2,1]


 */

public class Practice {
    public static void main(String[] args) {
Even();
odd();

    }

    public static void Even() {


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("all even numbers" + i);
            }
        }
    }


    public static void odd() {


            for (int j = 0; j<=100;j++){
                if(j % 2!=0){
                    System.out.print("all Odd numbers"+j);
        }
            }
    }


    public static void MaximumNumberArray (){

        int []arr={1,2,3,4,5,6};
        int max=arr[0];



            for(int i=0;i<arr.length;i++){
          max=arr[i];
                System.out.println(max);



        }



    }

    public static void MinimumNumberArray() {
        int []arr={1,2,3,4,5,6};
        int min=arr[0];
        for(int i=0;i>arr.length;i--){
            min=arr[i];
            System.out.println(min);
        }

    }

}
