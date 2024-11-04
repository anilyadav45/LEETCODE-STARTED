class Solution {
    public int majorityElement(int[] nums) {
        int curr = nums[0]; // Set the first element as the initial candidate
        int count = 1; // Start the count at 1 

        // Determine the most frequent candidate
        // Algorithm
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == curr) {
                // If the current element is the same as our candidate, increase the count
                count++;
            } else {
                // If not decrease the count
                count--;
                if (count == 0) {
                    // When count reaches zero select a new candidate
                    curr = nums[i];
                    count = 1; // Reset count for the new candidate
                }
            }
        }

        //Verify the candidate to ensure it appears more than n/2 times
        count = 0; // Reset count for validation
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == curr) {
                count++; // Count occurrences of the candidate
            }
        }

        //Return the candidate if it's the majority element
        if (count > nums.length / 2) {
            return curr;
        }
 //assume it alteast have 1 majority element 
        return 1;
    }
}

public class MajorityWithoutSorting {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        Solution s1 = new Solution();
        System.out.println("To find majority element:");
        int majEl = s1.majorityElement(arr);
        System.out.println(majEl);
    }
}
