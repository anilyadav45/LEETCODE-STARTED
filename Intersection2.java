class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Temporary array to store intersection elements
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0; // Index for temp array

        // Flag array to mark already used elements in nums2
        boolean[] used = new boolean[nums2.length];

        // Compare each element in nums1 with nums2
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !used[j]) {
                    temp[k++] = nums1[i];
                    used[j] = true; // Mark nums2[j] as used
                    break; // Move to the next element in nums1
                }
            }
        }

        // Copy the results to an output array of appropriate size
        int[] result = new int[k];
        System.arraycopy(temp, 0, result, 0, k);

        return result;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        int res[] = intersect(nums1, nums2);
        System.out.println(res);

    }
}
