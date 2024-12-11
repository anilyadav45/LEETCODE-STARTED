class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;    //num of rows and colm
        int c = matrix[0].length;     

        // Iterate through each row to find in which row our target exist
        for (int i = 0; i < r; i++) {
            // checking if this target exist in this row so we can take this as 1-d and apply binsearch of 1-d arr
            if (target >= matrix[i][0] && target <= matrix[i][c - 1]) {
                // Apply binary search within this row like 1-d arr
                int low = 0, high = c - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (matrix[i][mid] == target) {
                        return true;   // Target found
                    } else if (matrix[i][mid] < target) {
                        low = mid + 1; // Search right
                    } else {
                        high = mid - 1; // Search left
                    }
                }
            }
        }
        return false; //not found
    }
}

public class BinSearch74 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        Solution res = new Solution();
        System.out.println(res.searchMatrix(matrix, target));
    }
}
