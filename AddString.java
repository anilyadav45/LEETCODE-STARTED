class AddString {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1; // Pointer for num1
        int j = num2.length() - 1; // Pointer for num2
        int carry = 0; // Carry for addition
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0; // Get digit from num1 or 0
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0; // Get digit from num2 or 0
            
            int sum = digit1 + digit2 + carry; // Sum of digits and carry
            result.append(sum % 10); // Append the last digit of the sum
            carry = sum / 10; // Update carry
            
            i--; // Move to the next digit in num1
            j--; // Move to the next digit in num2
        }
        
        return result.reverse().toString(); // Reverse and return the result
    }
   public static void main(String[] args) {
    String s1 = "123";
    String s2 = "2";
    System.out.println(addStrings(s1, s2));
   }
}


