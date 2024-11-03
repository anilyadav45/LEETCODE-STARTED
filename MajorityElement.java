class Solution {
    public void printlist(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public void mergeSort(int nums[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(nums, si, mid);// left sort
        mergeSort(nums, mid + 1, ei); // right sort
        merge(nums, si, mid, ei); // merge both sorted part
    }

    public static void merge(int nums[], int si, int mid, int ei) {
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr
        int temp[] = new int[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i]; // smaller will placed 1st
                i++;
                k++;
            } else {
                temp[k] = nums[j];
                j++;
                k++;
            }
        }
        // for remaining left and right element which is not added to temp arr above
        // loop sorted the unsorted part but it doesn't added already sorted so lets we
        // have more two condition
        // 1.rem left part
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        // 2.rem right part
        while (j <= ei) {
            temp[k++] = nums[j++];
        }
        // now all element passed to temp that is sorted array now and nums is empty now
        // so copying the temp arr
        // into original nums arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

       public int majorityElement(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        int curr = 0;
        int count = 1;
        int len = nums.length / 2;

        for (int i = 1; i < nums.length; i++) {
            if (nums[curr] == nums[i]) {
                count++;
                if (count > len) {
                    return nums[curr];
                }
            } else {
                curr = i;
                count = 1; // Reset count for the new element
            }
        }
        return nums[curr]; // Return value because we already assumed array have n/2 mojority el
    }
}


public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        Solution s1 = new Solution();
        System.out.println("The array before sorted : ");
        s1.printlist(arr);
        System.out.println();
        System.out.println("The array after sorted :");
        s1.mergeSort(arr, 0, arr.length - 1);
        s1.printlist(arr);
        System.out.println();
        System.out.println("To find majority element :");
       int majEl =  s1.majorityElement(arr);
       System.out.println(majEl);
    }
}
