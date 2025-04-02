import java.util.*;

class Solution {
    // using two pointer approach
    public int maxArea(int[] height) {
        int maxWater = 0, li = 0, ri = height.length - 1;
        while (li < ri) {
            // calculation
            int curHeight = Math.min(height[li], height[ri]);
            int width = ri - li;
            int currWater = curHeight * width;
            maxWater = Math.max(maxWater, currWater);
            // controls pointers
            if (height[li] < height[ri]) {
                li++;
            } else if (height[li] >= height[ri]) {
                ri--;
            }

        }
        return maxWater;
    }
}

class ContainerWithMostWater {
    public static void main(String args[]) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Solution res = new Solution();
        System.out.println(res.maxArea(height));
    }
}