/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
  public double myPow(double x, int n) {
    if (n > 0) {
      return myPowHelper(x, n);
    } else {
      return 1 / myPowHelper(x, n);
    }
  }

  private double myPowHelper(double x, int n) {
    if (n == 0) return 1.0;
    double y = myPowHelper(x, n / 2);
    if (n % 2 == 0) {
      return y * y;
    } else {
      return y * y * x;
    }
  }
}
// @lc code=end
