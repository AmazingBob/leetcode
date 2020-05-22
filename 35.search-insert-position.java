/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
  public int searchInsert(int[] nums, int target) {
    int lo = 0, hi = nums.length - 1;
    while (lo < hi) {
      int mid = (lo + hi) >> 1;
      if (nums[mid] < target) lo = mid + 1;
      else hi = mid;
    }
    return nums[lo] >= target ? lo : ++lo;
  }
}
// @lc code=end
