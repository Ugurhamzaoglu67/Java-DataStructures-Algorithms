package o5.com.Recursion.Interview.Questions;

public class IsPalinDromeStr {
    public static void main(String[] args) {

        System.out.println( isPalindrome("kek"));
    }

    public static boolean isPalindrome(String myStr) {
        if(myStr.length() == 0 || myStr.length() == 1){
                return true;
        }

        if(myStr.charAt(0) == myStr.charAt(myStr.length() -1)){
            return isPalindrome(myStr.substring(1, myStr.length()-1));
        }

        return false;
    }
}
