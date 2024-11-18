public class RightRotateArr {

    static void rotate(int arr[], int k) {
        int n = arr.length;

        // Ensure k is within array bounds
        k = k % n;

        // Temporary array to store the last k elements
        int temp[] = new int[k];

        // Store the last k elements in temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];// storing all right elms after n-k+1 i.e from 4 for k = 3
        }

        // Shift the first n - k elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy the elements from temp back to the front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
