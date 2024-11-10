class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for binary search optimization
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int halfLength = totalLength / 2;
        
        int left = 0;
        int right = m;
        
        while (left <= right) {
            int partition1 = (left + right) / 2;
            int partition2 = halfLength - partition1;
            
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];
            
            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];
            
            // Check if we have found the correct partitions
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If total length is odd, median is the middle element
                if (totalLength % 2 == 1) {
                    return Math.min(minRight1, minRight2);
                } else { 
                    // If total length is even, median is the average of the two middle elements
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            } else if (maxLeft1 > minRight2) {
                // Move towards left in nums1
                right = partition1 - 1;
            } else {
                // Move towards right in nums1
                left = partition1 + 1;
            }
        }
        
        // If the arrays are not sorted or the input is invalid, throw an exception
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int num1[] = {1, 3, 4};
        int num2[] = {2, 5, 6};
        Solution obj = new Solution();
        double res = obj.findMedianSortedArrays(num1, num2);
        System.out.println("The median of two sorted arrays is : " + res);
    }
}
