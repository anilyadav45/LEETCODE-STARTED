class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String repeatedWord = word;
        
        while (sequence.contains(repeatedWord)) {
            count++;
            repeatedWord += word;  // Appending word
        }
        
        return count;
    }
}

public class MxRepeatedWord {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        Solution obj = new Solution();
        System.out.println(obj.maxRepeating(sequence, word)); 
    }
}
