class Solution {
    public int search(int[] nums, int target, int si, int ei) {
        // to find mid
        int mid = si + (ei - si) / 2;
        // base case
        if (si > ei) {
            return -1;
        }
        // if key found at first attempty
        if (nums[mid] == target) {
            return mid;
        }

        // checking lines
        // case 1 : mid on Line - 1
        if (nums[si] <= nums[mid]) {
            // case a : left on line1
            if (nums[si] <= target && target <= nums[mid]) {  //if tar between si to mid 
                return search(nums, target, si, mid - 1);
            }
            // case b : right of line-1 and whole line-2
            else {
                return search(nums, target, mid + 1, ei);
            }
        }

        // case-2 : mid on line-2
        else {
            // case c: right on line-2
            if (nums[mid + 1] <= target && target <= nums[ei]) {
                return search(nums, target, mid + 1, ei);
            }
            // case d: left on line-2 and whole line-1
            else {
                return search(nums, target, si, mid - 1);
            }

        }

    }
}

class SearchRotArr {
    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 }, target = 0; // ex out : 4
        Solution s1 = new Solution();
        int res = s1.search(nums, target, 0, nums.length);
        System.out.println("The target found at pos : " + res);
    }
}