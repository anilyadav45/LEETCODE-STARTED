class SortingArr {
    public void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }
        MergeSort(arr, si, mid); // sort left subArr
        MergeSort(arr, mid + 1, ei);// sort right subArr

        // merge both subArr
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int i = si; // iterator for left
        int j = mid + 1; // iterator for right
        int k = 0; // iterator for temp
        int temp[] = new int[ei - si + 1];
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        // for rem left subArr
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // while rem rigth subAr
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copying temp arr to original arr those elements is 000000 now
        for (k = 0, i = si; i <= ei; k++, i++) {
            arr[i] = temp[k];
        }
    }
}

class Solution {
    SortingArr s = new SortingArr();

    public int missingNumber(int[] nums) {
        s.MergeSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}

public class MissingNumber {
    public static void main(String args[]) {
        int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        Solution res = new Solution();
        SortingArr s = new SortingArr();
        s.printArr(nums);
        
        int out = res.missingNumber(nums);
        System.out.println(out);

    }
}