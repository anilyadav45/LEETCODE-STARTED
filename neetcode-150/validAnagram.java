import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
//made string to array of chars so that we can sort and compare each
    char[] sChar = s.toCharArray();
    char[] tChar = t.toCharArray();

//since all chars splitted we can use sort 
    Arrays.sort(sChar);
    Arrays.sort(tChar); 

for(int i=0; i<s.length(); i++){
    if(sChar[i] != tChar[i]){
        return false;
    }
} 
return true;

    }
}
