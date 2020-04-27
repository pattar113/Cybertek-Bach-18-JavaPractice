package day21_MultidimensionalArrays;

public class zoo {
    public static void main(String[] args) {



        String[] wildAnimal={"Tiger", "Loin", "Monkey", "Turtle","Crocodile"};

        String[]bird={"Egal", "Ducks", "Peacock", "Chicken"};
        String [][]zoo={wildAnimal,bird};
     String kfc  = zoo [1][3];

for(String eachBird:zoo[1]){

    if(eachBird.equals(("Chicken")))
        continue;
    System.out.println(eachBird);


}
        System.out.println("====================");

        for(String each:zoo[0]){
            if(each.equals("Turtle")){
                continue;
            }
            System.out.println(each);

        }





    }
}
