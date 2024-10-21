
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int high = s.length() - 1;
        int low = 0;
        while (high >= low) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;

        }

        return true;
    }
}

public class PallindromeCheck {
    public static void main(String args[]) {
        String str = "A man, a plan, a canal: Panama";
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(str));
    }
}