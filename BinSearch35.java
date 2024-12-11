class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }
        return low;
    }
}

public class BinSearch35 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 2;

        Solution obj = new Solution();
        int res = obj.searchInsert(nums, target);
        System.out.println("The position of element " + target + " is: " + res);
    }
}
