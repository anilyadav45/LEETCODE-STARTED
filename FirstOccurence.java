class Solution {
  public int strStr(String haystack, String needle) {
      int i=0;
    for( i=0; i<=haystack.length()-needle.length(); i++){
      String sb = haystack.substring(i,i+needle.length());
       if(needle.equals(sb)){
          return i;
       }
    }
    return -1;
  }
}

class FirstOccurence{
    public static void main(String a[]){
        String str = "a";
        String key = "a";
        Solution s = new Solution();
        System.out.println(s.strStr(str,key));
    }
}