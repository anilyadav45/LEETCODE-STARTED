class Solution {
    public int romanToInt(String s) {
        // Define values for each Roman numeral
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            // Get the integer value of the current Roman numeral
            int currentVal = getValue(s.charAt(i)); //like for "LVII" it will give 'L'

            // Check if this is the last character or and interger value compare return by getValue func
            if (i < length - 1 && currentVal < getValue(s.charAt(i + 1))) {
                result -= currentVal; // Subtract current value if it's smaller than the next one
            } else {
                result += currentVal; // Otherwise, add the current value
            }
        }

        return result;
    }

    int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

class RomanToInteger {
    public static void main(String[] args) {
        String roman = "LVII";
        Solution obj = new Solution();
        int res = obj.romanToInt(roman);
        System.out.println("The roman " + roman + " is : " + res);
    }
}