import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> arr = new HashSet<Integer>();//hashset only stores unique values
        for(int i=0; i<nums.length; i++){
        if(arr.contains(nums[i])==true){//agar kabhi duplicate mil jatai true return kara detai natain hashset me add karte jatai
            return true;
        }
        arr.add(nums[i]);

        }
        return false;

    }
}

