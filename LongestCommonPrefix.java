class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // taken first word in string array

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] example1 = { "flower", "flow", "flight" };
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(example1));

        String[] example2 = { "dog", "racecar", "car" };
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(example2));
    }
}
