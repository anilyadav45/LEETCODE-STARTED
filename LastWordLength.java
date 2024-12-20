class LastWordLength {
    public static int lengthOfLastWord(String s) {
        String newstr = ""; // Initialize the variable to avoid scope issues
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') { 
                if (!newstr.isEmpty()) { // Check if newstr already has content to avoid breaking logic
                    break;
                }
            } else {
                newstr = s.substring(i, s.length()).trim();  //trim the last word 
            }
        }
        return newstr.length();
    }
    public static void main(String[] args) {
        String s = "I am begginer Software Engineer";
        System.out.println("The length of last word is : "+ lengthOfLastWord(s));
    }
}
