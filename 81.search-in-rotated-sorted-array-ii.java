/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
  public boolean search(int[] nums, int target) {
    // Corner case
    if (nums == null || nums.length == 0) return false;
    // Time: O(n)
    int start = 0, end = nums.length - 1;
    while (start + 1 < end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) return true;
      if (nums[mid] > nums[start]) {
        if (nums[mid] >= target && nums[start] <= target) end = mid;
        else start = mid;
      } else if (nums[mid] < nums[start]) {
        if (nums[mid] <= target && nums[end] >= target) start = mid;
        else end = mid;
      } else {
        ++start;
      }
    }
    if (nums[start] == target || nums[end] == target) return true;
    return false;
  }
}
// @lc code=end
