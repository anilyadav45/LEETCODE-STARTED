class Solution {
    public int missingNumber(int[] nums) {
        int ActualSum = 0;
        int n = nums.length;
        int expectedS = n * (n+1)/2;
        for (int i = 0; i < nums.length; i++) {
            ActualSum = ActualSum + nums[i];
        }
        int MisN = expectedS - ActualSum; // missing number
        return MisN;
    }
}

public class MissingN {
    public static void main(String args[]) {
        int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        Solution res = new Solution();
        SortingArr s = new SortingArr();
        s.printArr(nums);

        int out = res.missingNumber(nums);
        System.out.println(out);

    }
}