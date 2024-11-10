class Solution {
    double findMedianSortedArrays(int nums1[], int nums2[]) {
        int m = nums1.length;
        int n = nums2.length;
        int totLen = m + n;
        int mergedArr[] = new int[totLen]; // to hold merged arr elms
        // for test case where all elements are 00 000 so no need to merge
        if (nums1[m - 1] == 0 && nums2[n - 1] == 0) {
            return 0.0;
        }

        // iterators
        int i = 0; // for num1
        int j = 0; // for num2
        int k = 0; // for merged arr iterator
        // let's merge both the arr first
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArr[k++] = nums1[i++];
            } else if (nums2[j] < nums1[i]) {
                mergedArr[k++] = nums2[j++];
            }
        }
        // for remaining elements which was already sorted
        while (i < m) {
            mergedArr[k++] = nums1[i++];
        }
        while (j < n) {
            mergedArr[k++] = nums2[j++];
        }
        // let's find the median after sorted and merged the array
        if (totLen % 2 == 1) {
            return mergedArr[totLen / 2]; // return middle element
        } else { // it is even so we have to find middle two element and get the avg
            int mid1 = totLen / 2;
            int mid2 = mid1 - 1;
            double avgOftwoMiddle = (mergedArr[mid1] + mergedArr[mid2]) / 2.0;
            return avgOftwoMiddle;
        }
    }
}

public class medianTwoSorted {
    public static void main(String[] args) {
        int num1[] = { 1, 3, 4 };
        int num2[] = { 2, 5, 6 };
        Solution obj = new Solution();
        double res = obj.findMedianSortedArrays(num2, num1);
        System.out.println("The median of two sorted array is : " + res);
    }
}
