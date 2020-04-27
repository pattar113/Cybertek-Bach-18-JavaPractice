package day09_NestedIf_Ternary;

public class NestedIf_Age {


    public static void main(String[] args) {
        /*
        teenager = (<21)
        adult=  (>=21&&<55)
        senior= (>=55)
        age cannot be negative or greater than 150
        */

        int age = 27;
        String ageGroup = "";


        if (age > 0 && age < 150) {

            if (age < 21) {
                ageGroup = "teenager";
            } else if (age >= 21 && age < 55) {
                ageGroup = "Adult";
            } else {
                ageGroup = "Senior";
            }
        }else {
            ageGroup = "Invalid Number";


        }System.out.println(ageGroup);
            System.out.println("=====================");
            int age2 = 161;
            String ageGroup2 = "";
            if (age2 > 0 && age2 < 150) {

                ageGroup2 = (age2 < 21) ? "Teenager" : (age2 > 21 && age2 <= 55) ? "Adult" : "Senior";


            } else {
                ageGroup2 = "invalid number";


            }System.out.println(ageGroup2);

        }
    }
