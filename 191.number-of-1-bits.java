/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    if (n == 0)
      return 0;
    int result = 0;
    for (int i = 0; i < 32; i++) {
      if ((n & 1) == 1)
        result++;
      n >>= 1;
    }
    return result;
  }
}
// @lc code=end