class Solution {
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // mid on line-1
            if (nums[si] <= nums[mid]) {
                // left on line-1
                if (nums[si] <= target && target <= nums[mid]) {
                    ei = mid - 1;
                }
                // right on line-1 and whole line-2
                else {
                    si = mid + 1;
                }
            }
            // mid on line-2
            else {
                // right on line-2
                if (nums[mid] <= target && target <= nums[ei]) {
                    si = mid + 1; //right side
                }
                // left on line-2 and whole line-1
                else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
}

public class SearchInRotArr {
    public static void main(String args[]) {
        int nums[] = {5,1,3}, target = 2; // ex out : 4
        Solution s1 = new Solution();
        int res = s1.search(nums, target);
        System.out.println("The target found at pos : " + res);
    }

}
