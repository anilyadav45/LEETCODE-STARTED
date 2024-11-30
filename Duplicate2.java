import java.util.HashMap;

class Duplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // Check if the difference between indices is at most k
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the index of the current number
            map.put(nums[i], i);
        }
        
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,3,4,5,5};
        int key = 3;
        System.out.println(containsNearbyDuplicate(nums, key));
    }
}
