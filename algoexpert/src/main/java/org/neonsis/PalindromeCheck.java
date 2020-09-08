package org.neonsis;

/*
    Check if string is palindrome
 */
public class PalindromeCheck {

    public static void main(String[] args) {
        String palindrome = "abccba";
        System.out.println(isPalindrome(palindrome));
    }

    // Simple solution (n) - time, (1) - space
    public static boolean isPalindrome(String palindrome) {
        int pointerR = palindrome.length() - 1;
        int pointerL = 0;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (!(palindrome.charAt(pointerL++) == palindrome.charAt(pointerR--))) {
                return false;
            }
        }
        return true;
    }
}
