/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
  public int search(int[] nums, int target) {
    int lo = 0, hi = nums.length - 1, mid = (lo + hi) / 2;
    while (lo <= hi) {
      if (nums[mid] == target) return mid;
      if (nums[mid] < target) lo = mid + 1;
      if (nums[mid] > target) hi = mid - 1;
      mid = (lo + hi) / 2;
    }
    return -1;
  }
}
// @lc code=end
