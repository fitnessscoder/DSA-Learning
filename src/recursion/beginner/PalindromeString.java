package recursion.beginner;

public class PalindromeString {

    public static void main(String[] args) {
        String str="MADASM";
        System.out.println(checkPalindrome(str,str.length(),0));
    }

    private static boolean checkPalindrome(String str, int length, int i) {
        if(i>=length/2) return true;
        if(str.charAt(i)!=str.charAt(length-i-1)) return false;
        return checkPalindrome(str,length,i+1);
    }
}
