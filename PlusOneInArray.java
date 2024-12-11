class Solution {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] plusOne(int[] digits) {
        int i = 0; // iterator for newarr
        // int newArr[] = new int[digits.length];
        int n = digits.length;
        // int arr[] = new int[digits.length];
        for (i = n-1; i >= 0; i--) {
            if (digits[i] < 9 || digits[i] != 9) {
                digits[i] += 1; // increment last element
                return digits;
            }
            // Set current digit to 0 and continue to the next most significant digit
            digits[i] = 0;

        }
        // what if all the elements are 9999

        // we need to add an extra digit at the beginning
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the first digit to 1, others are already 0
        return newDigits;

    }
}

class PlusOneInArray {
    public static void main(String[] args) {
        int digits[] = { 1, 9, 9 }; // ex. ou [1,3,4,5,7]
        Solution s = new Solution();
        s.plusOne(digits);
        s.print(digits);
    }

}