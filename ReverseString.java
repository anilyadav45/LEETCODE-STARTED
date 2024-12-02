class Solution {
    public void reverseString(char[] s) {
       char temp;
       int n = s.length;
       int len = s.length;
       for(int i=0; i<len/2; i++){
         temp = s[i];
         s[i] = s[n-1];
         s[n-1] = temp;
         n--;
       }
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Solution obj = new Solution();
        char [] s  = {'a','b','c','h','e'};
        obj.reverseString(s);
    }
}
