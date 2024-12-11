import java.util.HashSet;

class Solution {
    // Helper function to check if a substring has all unique characters
    static boolean hasUniqueCharacters(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return false; // Character repetition found
            }
            set.add(c);
        }
        return true; // All characters are unique
    }

    // Function to return the length of the longest substring with unique characters
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Generate all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);

                // Check if the substring has all unique characters
                if (hasUniqueCharacters(substring)) {
                    maxLength = Math.max(maxLength, substring.length());
                }
            }
        }
        return maxLength;
    }
}

class LongestSbStr2 {
    public static void main(String args[]) {
        String str = "abcabcbb";
        Solution solution = new Solution();

        int result = solution.lengthOfLongestSubstring(str);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
