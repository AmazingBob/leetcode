/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
  public String longestPalindrome(String s) {
    if (s.length() < 2)
      return s;
    if (s.length() < 4 && s.charAt(0) == s.charAt(s.length() - 1))
      return s;
    boolean[][] dp = new boolean[s.length()][s.length()];
    String result = Character.toString(s.charAt(0));
    for (int i = 0; i < s.length(); ++i) {
      for (int j = i; j < Math.min(i + 2, s.length()); ++j) {
        if (i == j)
          dp[i][j] = true;
        if (j - i == 1)
          dp[i][j] = s.charAt(i) == s.charAt(j);
      }
    }
    int maxLength = 1;
    for (int j = 0; j < s.length(); ++j) {
      for (int i = 0; i < j + 1; ++i) {
        if (j >= i + 2)
          dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
        if (dp[i][j] && j - i + 1 > maxLength) {
          result = s.substring(i, j + 1);
          maxLength = j - i + 1;
        }
      }
    }
    return result;
  }
}
// @lc code=end

