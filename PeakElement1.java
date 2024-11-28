class Solution {
    public int findPeakElement(int[] nums) {
        // Case: nums has at least 3 elements
        if (nums.length >= 3) {
            // Check explicitly if the first or last element is a peak
            if (nums[0] > nums[1]) {
                return 0;
            }
            if (nums[nums.length - 1] > nums[nums.length - 2]) {
                return nums.length - 1;
            }
            // Check the middle elements
            for (int i = 1; i < nums.length - 1; i++) {
                int left = i - 1;
                int right = i + 1;
                if (nums[left] < nums[i] && nums[right] < nums[i]) {
                    return i;
                }
            }
        } 
        // Case: nums has exactly 2 elements
        else if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return 0;
            } else {
                return 1;
            }
        }
        // Case: nums has only 1 element
        return 0;
    }
}
