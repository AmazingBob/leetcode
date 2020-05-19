/*
 * @lc app=leetcode id=221 lang=java
 *
 * [221] Maximal Square
 */

// @lc code=start
class Solution {
  public int maximalSquare(char[][] matrix) {
    if (matrix.length == 0)
      return 0;
    int maxEdge = 0;
    int[][] dp = new int[2][matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (i == 0 || j == 0)
          dp[1][j] = Character.getNumericValue(matrix[i][j]);
        else if (matrix[i][j] == '1') {
          int min = Math.min(dp[0][j], Math.min(dp[0][j - 1], dp[1][j - 1]));
          dp[1][j] = min + 1;
        }
        maxEdge = Math.max(dp[1][j], maxEdge);
      }
      for (int k = 0; k < dp[0].length; k++) {
        dp[0][k] = dp[1][k];
        dp[1][k] = 0;
      }
    }
    return maxEdge * maxEdge;
  }
}
// @lc code=end

