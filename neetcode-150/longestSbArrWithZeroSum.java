import java.util.*;
class Solution {
    int maxLength(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];//keep first elm then see exist or not
            if(sum == 0){
                len = i + 1;
            }
           else if(map.containsKey(sum)){
                len = Math.max(len,i - map.get(sum));
            }
            else{
                map.put(sum,i);
            }
            
        }
        return len;
    }
}

