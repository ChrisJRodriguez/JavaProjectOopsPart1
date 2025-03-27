package OopsProject;

public class Q1 {
    public static void main(String[] args) {
        // Write a program to swap 2 String without a temporary variable?
        String str1 = "A";
        String str2 = "B";

        str1 = str1 + str2;
        str2 = str1.replace(str2,"");
        str1 = str1.replace(str2,"");

        System.out.println(str1);
        System.out.println(str2);

    }
}
