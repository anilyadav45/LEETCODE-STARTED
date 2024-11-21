import java.util.*;

class InterSection {
    public  static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store unique elements from nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Use another HashSet to store the intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,2};
        int nums2[] = {2,3,4,4};
        int res[]=intersection(nums1, nums2);
        printArr(res);
        
        
    }
}
