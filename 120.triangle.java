import java.util.*;

/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

// @lc code=start
class Solution {
  public int minimumTotal(List<List<Integer>> triangle) {
    // Corner case
    if (triangle.size() == 0) return 0;
    // DP
    int TRIANGLE_ROW = triangle.size();
    int[][] dp = new int[2][TRIANGLE_ROW];
    dp[0][0] = triangle.get(0).get(0);
    for (int i = 1; i < TRIANGLE_ROW; i++) {
      int currRow = i & 1;
      int prevRow = i - 1 & 1;
      for (int j = 0; j <= i; j++) {
        if (j == 0) dp[currRow][j] = triangle.get(i).get(j) + dp[prevRow][j];
        else if (j == i) dp[currRow][j] = triangle.get(i).get(j) + dp[prevRow][j - 1];
        else
          dp[currRow][j] =
              Math.min(
                  triangle.get(i).get(j) + dp[prevRow][j - 1],
                  triangle.get(i).get(j) + dp[prevRow][j]);
      }
    }
    return Arrays.stream(dp[TRIANGLE_ROW - 1 & 1]).min().getAsInt();
  }
}
// @lc code=end

// class Test {
//   public static void main(String[] args) {
//     List<List<Integer>> triangle = Arrays.asList(
//             Arrays.asList(2),
//             Arrays.asList(3, 4),
//             Arrays.asList(6, 5, 7),
//             Arrays.asList(4, 1, 8, 3));
//     Solution sltn = new Solution();
//     sltn.minimumTotal(triangle);
//     return;
//   }
// }
