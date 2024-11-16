public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int indexes[] = new int[2];
        int n = numbers.length;
        // two pointers
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                indexes[0] = low;
                indexes[1] = high;
                return indexes;
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return indexes;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 ,17,19};
        int target = 22;
        int arr[] = twoSum(nums, target);
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1] + "]");
        System.out.println();
    }
}
