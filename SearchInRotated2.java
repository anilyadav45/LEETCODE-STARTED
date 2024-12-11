class Solution {
    public boolean search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            // If target is found at mid, return true
            if (nums[mid] == target) {
                return true;
            }

            // If the start, mid, and end are equal, it's difficult to determine the sorted
            // half
            // So, we increment si and decrement ei to narrow down the search space
            if (nums[si] == nums[mid] && nums[mid] == nums[ei]) {
                si++;
                ei--;
            }
            // Left half is sorted LIne-1 me exist karta he target
            else if (nums[si] <= nums[mid]) {
                // Check if target is within the sorted left half
                if (nums[si] <= target && target < nums[mid]) {
                    ei = mid - 1;
                } else { // Otherwise, search in the right half
                    si = mid + 1;
                }
            }
            // Right half is sorted i.e line-2 me
            else {
                // Check if target is within the sorted right half
                if (nums[mid] < target && target <= nums[ei]) {
                    si = mid + 1;
                } else { // Otherwise, search in the left half
                    ei = mid - 1;
                }
            }
        }

        // Target not found
        return false;
    }
}

class SearchInRotated2 {
    public static void main(String[] args) {
        int nums[] = {2,5,6,0,0,1,2};
        int target = 0;
        Solution s = new Solution();
        System.out.println(s.search(nums, target));
    }
}