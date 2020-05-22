/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
  public int findPeakElement(int[] nums) {
    if (nums == null || nums.length == 1)
      return 0;
    int lo = 0, hi = nums.length - 1;
    while (lo < hi) {
      int mid = (lo + hi) >> 1;
      if (nums[mid] < nums[mid + 1]) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }
    return lo;
  }
}
// @lc code=end

