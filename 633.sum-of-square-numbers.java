
/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */

// @lc code=start
class Solution {
  public boolean judgeSquareSum(int c) {
    // Corner case
    if (c < 0) return false;
    /*
     * Double Pointer
     * Time: O(sqrt(n))
     * Space: O(1)
     */
    int ptrL = 0, ptrR = (int) Math.sqrt(c);
    while (ptrL <= ptrR) {
      int sum = ptrL * ptrL + ptrR * ptrR;
      if (sum < c) {
        ++ptrL;
      } else if (sum > c) {
        --ptrR;
      } else {
        return true;
      }
    }
    return false;
  }
}
// @lc code=end
