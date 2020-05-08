/*
 * @lc app=leetcode id=69 lang=cpp
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
 public:
  int mySqrt(int x) {
    if (x == 0) return 0;
    long left = 1, right = x;
    while (left < right) {
      long middle = (left + right) >> 2;
      if (middle * middle > x)
        right = middle - 1;
      else
        left = middle;
    }
    return left;
  }
};
// @lc code=end
