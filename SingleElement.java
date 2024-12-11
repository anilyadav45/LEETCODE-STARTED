class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num; 
        }
        return unique;
    }
}


class SingleElement{
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        Solution obj = new Solution();
        int res = obj.singleNumber(nums);
        System.out.println("the single element present  in array is : "+ res);
    }
}