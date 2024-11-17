class MovedZeros {
    public static void moveZeroes(int[] nums) {
        int temp[] = new int[nums.length];
        int j = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[j] = nums[i];
                j++;
                count++; // to see no.of non zero got placed
            }
        }
        // copying the temp arr into original
        j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < count) {
                nums[i] = temp[j];
                j++;
            } else {
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);

    }
}