package day26_MethodOverLoding;

public class Frequency {
    /*
    1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
     */
    public static void main(String[] args) {
        String str="AAASSUUAATTRFFFAA";
        char ch='A';
   int num=frequency(str,ch);
        System.out.println(num);

    }

   public static int frequency(String str,char ch){
       char []arr=str.toCharArray();//[A,B,B]
       int count=0;
       for(char each :arr){//1
           if(each==ch){
               count++;
           }
       }
        return count;
   }



}
