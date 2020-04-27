package day15_Forloop;

public class reverseString {
    public static void main(String[] args) {


     /*   String str = "United States Of America";
        int lastIndexNum = str.length() - 1;

        for (int i = lastIndexNum; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

/* write a program to identify a string palindrome or not , if yes==> true. otherwise==>false
level==> level==>palindrome

 */

      String str1 = "level";
      int LastIndexNumber=str1.length()-1;
      String result = "";
      for (int reverse=LastIndexNumber; reverse>=0; reverse-- ){
          result += str1.charAt(reverse);
      }
        System.out.println(result);

        if(str1.equalsIgnoreCase(result)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


            }
        }






