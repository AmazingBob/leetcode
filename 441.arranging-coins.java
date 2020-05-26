/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
  public int arrangeCoins(int n) {
    long lo = 0, hi = n, mid = (lo + hi) / 2, temp = 0;
    while (lo <= hi) {
      temp = (mid + 1) * mid >> 1;
      if (temp == n)
        return (int) mid;
      if (temp < n)
        lo = mid + 1;
      else
        hi = mid - 1;
      mid = (lo + hi) / 2;
    }
    return (int) mid;
  }
}
// @lc code=end
