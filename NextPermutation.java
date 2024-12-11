public class NextPermutation{
    static void printArrr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) { // If the array is not in descending order
            // Step 2: Find the element just larger than nums[i]
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 4: Reverse the elements to the right of index i
        reverse(nums, i + 1, n - 1);
    }

    // Helper function to swap two elements
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper function to reverse part of the array
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        nextPermutation(arr);
        printArrr(arr);
    }
}