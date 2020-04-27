package day18_NestedLoop;
/*
print all the even number 0 ~ 100 int same line separated bye a space
 */
public class do_While_Loop3 {
    public static void main(String[] args) {


        int num = 0;
        do {
            if (num % 2 != 0) {

                System.out.print(num + " ");
            }

            num++;
        } while (num <= 100);
        System.out.println();
        int i = 1;
        do {
            System.out.print(i);
            i++;
        } while (i <= 5);
        System.out.println("=========================");

        int z = 1;
        do {
            System.out.print(z);
            if (z == 3) {
                break;
            }
            z++;
        } while (z <= 5);
        System.out.println("===========================");
        int y = 1;
        do {
            if (y == 3) {


                y++;// need to make sure iterator in not skipping,so that the condition will be false;
                continue;
            }
            System.out.println(y);
            y++;
        } while (y <= 5);


        System.out.println("+===================================");

        int t = 1;
        do {
            t++;
            if(t%2!=0) {

                continue;
            }
            System.out.print(t+" ");
            t++;
        } while (t<100);

    }
}