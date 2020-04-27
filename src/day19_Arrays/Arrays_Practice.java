package day19_Arrays;

public class Arrays_Practice {

    public static void main(String[] args) {

        String friends[] = {"Mehmut", "Malika", "Noha", "Gulnur", "Akila"};
        for (int j = 0; j <= 5; j++) {
            String name = friends[j];
            System.out.println(name);
        }


            System.out.println("===================");
            System.out.println();
            String[]emails={"dpattar@gmail.com","pattar.dilm@yahoo.com","pattar.ediqut@qq.com"};
            //who registered with gmail.
            //max:4

            for(int i =0;i<=3;i++){
                String email=emails[i];


                if(email.endsWith("@gmail.com")){


                    System.out.println(email);
                }


            }

        }


    }




