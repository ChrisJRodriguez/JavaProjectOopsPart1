package OopsProject;

public class Q4 {
    public static void main(String[] args) {
        //Check if a String is Palindrome: Determine whether a given string is a palindrome, which means
        //it reads the same forwards and backward. For example, "madam" is a palindrome.

        //StringBuilder to remove spaces for multiple words like "race car"
        StringBuilder sb = new StringBuilder("madam");
        String result = sb.toString().replaceAll(" ", "");
        sb.setLength(0);
        sb.append(result).toString();

        StringBuilder palindromeChecker = new StringBuilder(sb);
        palindromeChecker.reverse();
        if((palindromeChecker.toString()).equals(result)){
            System.out.println(sb + " IS a Palindrome");
        } else{
            System.out.println(sb + " is NOT a Palindrome");
        }
    }
}
