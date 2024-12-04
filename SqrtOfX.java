class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 0, right = x, result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid <= x / mid) {
                result = mid; // Update the result
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        
        return result;
    }
}

public class SqrtOfX {
    public static void main(String[] args) {
        int x =  4;
        Solution obj = new Solution();
        int res = obj.mySqrt(x);
        System.out.println("The sqrt of give x is :" + res);
    }
}
