import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<>();
    // Corner case
    if (matrix.length == 0) return res;
    // 
    int rowBegin = 0, rowEnd = matrix.length - 1;
    int colBegin = 0, colEnd = matrix[0].length - 1;
    while (rowBegin <= rowEnd && colBegin <= colEnd) {
        for (int c = colBegin; c <= colEnd; c++) res.add(matrix[rowBegin][c]);
        for (int r = rowBegin + 1; r <= rowEnd; r++) res.add(matrix[r][colEnd]);
        if (rowBegin < rowEnd && colBegin < colEnd) {
            for (int c = colEnd - 1; c > colBegin; c--) res.add(matrix[rowEnd][c]);
            for (int r = rowEnd; r > rowBegin; r--) res.add(matrix[r][colBegin]);
        }
        rowBegin++;
        rowEnd--;
        colBegin++;
        colEnd--;
    }
    return res;
  }
}
// @lc code=end
