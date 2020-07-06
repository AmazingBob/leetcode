/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
  public int uniquePaths(int m, int n) {
    // Corner case
    if (m == 0 || n == 0) return 0;
    // Time: O(min(m, n))
    if (m > n) {
      return combination(m + n - 2, n - 1);
    } else {
      return combination(m + n - 2, m - 1);
    }
  }
  private int combination(int n, int k) {
    long a = 1, b = 1;
    for (int i = 1; i <= k; i++) {
      a *= (n + 1 - i);
      b *= i;
    }
    return (int) (a / b);
  }
}
// @lc code=end
