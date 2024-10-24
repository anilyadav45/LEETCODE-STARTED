class Solution {
    public String longestPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        String newStr = "";
        while (high >= low) {
            newStr = s.substring(low, high);
            if (newStr.charAt(low) != newStr.charAt(high)) {
                break;
            } else {
                // low++;
                high--;
            }
        }
        return newStr;
    }
}

public class LongestSubStr {
    public static void main(String[] args) {
        String s = "babad"; // like here bab and aba is longest palld.
        Solution obj = new Solution();
        obj.longestPalindrome(s);
    }

}
