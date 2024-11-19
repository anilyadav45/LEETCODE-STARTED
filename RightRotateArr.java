public class RightRotateArr {

    // static void rotate(int arr[], int k) {
    // int n = arr.length;

    // // Ensure k is within array bounds
    // k = k % n;

    // // Temporary array to store the last k elements
    // int temp[] = new int[k];

    // // Store the last k elements in temp
    // for (int i = 0; i < k; i++) {
    // temp[i] = arr[n - k + i];// storing all right elms after n-k+1 i.e from 4 for
    // k = 3
    // }

    // // Shift the first n - k elements to the right
    // for (int i = n - k - 1; i >= 0; i--) {
    // arr[i + k] = arr[i];
    // }

    // // Copy the elements from temp back to the front
    // for (int i = 0; i < k; i++) {
    // arr[i] = temp[i];
    // }
    // }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArr(int arr[], int low, int high) {
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
        }
    }

    static void rotateOptimal(int arr[], int d) {
        int n = arr.length;
        d = d % n; // In case d > n
        reverseArr(arr, n - d, n - 1); // Reverse last d elements
        reverseArr(arr, 0, n - d - 1); // Reverse first n-d elements
        reverseArr(arr, 0, n - 1); // Reverse entire array
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotateOptimal(arr, 3);
        printArr(arr);

    }
}
