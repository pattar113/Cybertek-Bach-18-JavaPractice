package day23_Method;

public class method_WithParameter2 {
    public static void main(String[] args) {
        String name1="Pettar";
        ReverseString(name1);
        System.out.println("Hello");
        String name2="Cybertek";
        ReverseString(name2);

    // create a function that can reverse any string
    // "Muhtar"==> rathuM, "Cybertek"==> ketrebyC
}

    public static void ReverseString(String str){
    for(int i=str.length()-1;i>=0;i--){
        System.out.println(str.charAt(i));
    }
        System.out.println();
    }
}