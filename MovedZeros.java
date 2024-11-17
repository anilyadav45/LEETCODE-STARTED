class MovedZeros {
    public  static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void moveZeroes(int[] nums) {
        int j = -1;
        // loop to find one pointer where we got our first 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        // loop to swap and move zeros
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                // swap bcoz as we know nums[j] = 0 so move to next
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        printArr(nums);

    }
}