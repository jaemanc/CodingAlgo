package leetcode;


public class isPalindrome {
    // Given an integer x, return true if x is a palindrome , and false otherwise.
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int len = str.length();
        if (str.length()==1){
            return true;
        }
        for (int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }

}
