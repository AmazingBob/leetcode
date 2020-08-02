/*
 * @lc app=leetcode id=96 lang=java
 *
 * [96] Unique Binary Search Trees
 */

// @lc code=start
class Solution {
  public int numTrees(int n) {
    // Corner case 
    if (n < 2) return 1;
    // Dynamic Programming
    int[] dp = new int[n + 1];
    dp[0] = dp[1] = 1; // Initiating
    for (int i = 2; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        dp[i] += (dp[i - j - 1] * dp [j]);
      }
    }
    return dp[n];
  }
}
// @lc code=end
