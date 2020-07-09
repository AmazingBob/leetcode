/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
  public void setZeroes(int[][] matrix) {
    // Corner case
    if (matrix == null || matrix.length == 0) return;
    // Time: O(m * n)
    // Space: O(1)
    int MODIFIED = Integer.MAX_VALUE - 1;
    int n = matrix.length;
    int m = matrix[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] == 0) {
          for (int k = 0; k < n; k++) {
            if (matrix[k][j] != 0) {
              matrix[k][j] = MODIFIED;
            } else {
              matrix[k][j] = 0;
            }
          }
          for (int k = 0; k < m; k++) {
            if (matrix[i][k] != 0) {
              matrix[i][k] = MODIFIED;
            } else {
              matrix[i][k] = 0;
            }
          }
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] == MODIFIED) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
// @lc code=end
