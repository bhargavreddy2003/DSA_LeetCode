class Solution {
    public boolean isMatch(String s, String p) {
         int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // Empty string matches empty pattern

        // Initialize the first row (empty string)
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                // If the current character is '', we can ignore the preceding character and ''
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char currentPatternChar = p.charAt(j - 1);
                if (currentPatternChar == '.' || currentPatternChar == s.charAt(i - 1)) {
                    // If the current characters match or the pattern has '.', carry over the result
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (currentPatternChar == '*') {
                    // If the current character is '*', handle zero or more occurrences
                    dp[i][j] = dp[i][j - 2]; // Zero occurrence of the preceding element
                    char precedingPatternChar = p.charAt(j - 2);
                    if (precedingPatternChar == '.' || precedingPatternChar == s.charAt(i - 1)) {
                        // If the preceding character matches, consider one or more occurrences
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];

    }
}