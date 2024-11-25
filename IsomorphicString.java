class IsomorphicString {
    public String reverseVowels(String s) {
        // Convert the string to a character array
        char[] chars = s.toCharArray();
        
        // Two pointers: one starting from the beginning, the other from the end
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer until a vowel is found
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            
            // Move right pointer until a vowel is found
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            
            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move both pointers
            left++;
            right--;
        }
        
        // Convert the character array back to a string
        return new String(chars);
    }
    
    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        // Check both upper and lower case vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
