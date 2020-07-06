/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
  public int[][] generateMatrix(int n) {
    int[][] res = new int[n][n];
    // Corner case
    if (n == 0) return res;
    // For-loop
    int num = 1;
    int top = 0, bottom = n - 1;
    int left = 0, right = n - 1;
    while (top <= bottom && left <= right) {
      // left -> right
      for (int i = left; i <= right; ++i) {
        res[top][i] = num++;
      }
      ++top;
      // top -> bottom
      for (int i = top; i <= bottom; ++i) {
        res[i][right] = num++;
      }
      --right;
      // right -> left
      for (int i = right; i >= left; --i) {
        res[bottom][i] = num++;
      }
      --bottom;
      // bottom -> top
      for (int i = bottom; i >= top; --i) {
        res[i][left] = num++;
      }
      ++left;
    }
    return res;
  }
}
// @lc code=end
