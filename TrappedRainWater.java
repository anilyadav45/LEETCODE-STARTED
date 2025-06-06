import java.util.*;

class Solution {
    int trap(int height[]) {
        int units = 0;
        // to find prefix max for leftMax
        int prefixMax[] = new int[height.length];
        prefixMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]); // fill the prefixMax arr from left - right store max one only
        }
        // to find suffixMax for rightMax
        int n = height.length;
        int suffixMax[] = new int[height.length];
        suffixMax[n - 1] = height[n - 1]; // last element
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]); // fill the suffixMax arr from right - left store all greater value only
        }
        // this is how prefix and suffix arr look and compare with the height arr
        // 0 1 1 2 2 2 2 3 3 3 3 3
        // 3 3 3 3 3 3 3 3 2 2 2 1
        // to find units
        for (int i = 0; i < height.length; i++) {
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];
            if (height[i] < leftMax && height[i] < rightMax) {
                units += Math.min(leftMax, rightMax) - height[i];
            }
        }
        return units;
    }
}

public class TrappedRainWater {
    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        Solution obj = new Solution();
        int res = obj.trap(height);
        System.out.println("The trapped rain water units is : " + res);
    }

}
