
/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
  public int divide(int dividend, int divisor) {
    // Corner case
    if (divisor == 0) return Integer.MAX_VALUE;
    if (dividend == Integer.MIN_VALUE) {
      if (divisor == -1) return Integer.MAX_VALUE;
      else if (divisor == 1) return Integer.MIN_VALUE;
    }

    long long_dividend = (long) dividend;
    long long_divisor = (long) divisor;
    int sign = 1;
    if (long_dividend < 0) {
      long_dividend = -long_dividend;
      sign = -sign;
    }
    if (long_divisor < 0) {
      long_divisor = -long_divisor;
      sign = -sign;
    }
    int res = 0;
    while (long_dividend >= long_divisor) {
      int shift = 0;
      while (long_dividend >= long_divisor << shift) ++shift;
      res += (1 << (shift - 1));
      long_dividend -= (long_divisor << (shift - 1));
    }

    return sign * res;
  }
}
// @lc code=end
