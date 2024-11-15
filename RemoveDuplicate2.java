class RemoveDuplicate2 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1; // Pointer to track the position of unique elements
        int count = 1; // Count the occurrences of each number
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // Reset the count for the new number
            }
            
            // If count is <= 2, we keep the element
            if (count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k; // k is the number of unique elements (with at most 2 occurrences)
    }

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("]");
    }
}
