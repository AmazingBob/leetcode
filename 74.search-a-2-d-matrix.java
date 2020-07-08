/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    // Corner case
    if (matrix == null || matrix.length == 0) return false;
    // Binary search
    int lo = 0;
    int hi = matrix.length * matrix[0].length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      int row = mid / matrix[0].length;
      int col = mid % matrix[0].length;
      if (matrix[row][col] == target) {
        return true;
      } else if (matrix[row][col] < target) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return false;
  }
}
// @lc code=end