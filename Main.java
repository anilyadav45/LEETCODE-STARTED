import java.util.*; // JavaFX Pair

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int uniqueIndex = 0; // pointer to compare and traverse
        for (int i = 0; i < nums.length; i++) {
            if (nums[uniqueIndex] != nums[i]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // update the unique element to the same array
            }

        }
        return uniqueIndex+1; //return no.of uniques element count exists after removed
    }
}

class Main {
    public static void main(String args[]) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int arr[] = {1,1,2};
        Solution s = new Solution();
        // System.out.println(s.removeDuplicates(arr));
        int unique = s.removeDuplicates(arr); // invoke the function to remove from this array
        System.out.println(unique);
        System.out.println();

        // printing the array after called removed the array elements remains unique
        // only
        System.out.print("[" + arr[0]);
        for (int i = 1; i < unique; i++) {
            System.out.print("," + arr[i]);
        }
        System.out.print("]");
        System.out.println();
    }
}