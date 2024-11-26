public class SearchMatrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (isFound(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                           { 5, 13, 14 },
                           { 4, 11, 19 },
                           { 6, 8, 10 } };
        int target = 5;
        System.out.println(searchMatrix(matrix, target));

    }
}
