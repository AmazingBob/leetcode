/*
 * @lc app=leetcode id=70 lang=cpp
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
 public:
  int NCR(int n, int r) {
    if (r == 0) return 1;
    if (r > n / 2) return NCR(n, n - r);
    long res = 1;
    for (int k = 1; k <= r; ++k) {
      res *= n - k + 1;
      res /= k;
    }
    return res;
  }
  int climbStairs(int n) {
    int max = n / 2;
    int result = 0;
    for (int i = 0; i <= max; i++) {
      result += NCR(n - i, i);
    }
    return result;
  }
};
// @lc code=end
