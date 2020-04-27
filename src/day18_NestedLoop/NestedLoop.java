package day18_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int j = 0; j <5; j++) {
            for (int i = 1; i <=5; i++) {
                System.out.print(i+" ");

            }
            System.out.println();

        }
        System.out.println("===================");

        /*
        1234567
        *******
        *******
        *******
        *******
        *******
        *******
        *******
         */

for(int i=0;i<3;i++){
    int a=1;
    while (a<=3){
        System.out.print("*");
        a++;
    }
    System.out.println();

}



}
}