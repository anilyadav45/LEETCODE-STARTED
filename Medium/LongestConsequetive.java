//brute force we know it take O(n^2)

//better - sort and check lastsmaller if equal count++

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
       //step : 1 -- to sort the arr 
       Arrays.sort(arr);
       int count = 0;
       int longest = 1;
       int lastsmaller = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
           if(arr[i] - 1  == lastsmaller){
               count++;
               lastsmaller = arr[i];
           }
           if(arr[i] == lastsmaller){
               //no need to do anything when many occurence come
           }
           
           if(arr[i] != lastsmaller){ // when we lost consequetive sequence go for next options 
               count = 1;
               lastsmaller = arr[i];
           }
           longest = Math.max(count,longest);
       }
       return longest;
    }
        
}