/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
  public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) return -1;
    int lo = 0, hi = nums.length - 1;
    while (lo + 1 < hi) {
      int mid = (lo + hi) >> 1;
      if (nums[mid] == target) return mid;
      if (nums[lo] < nums[mid]) {
        if (nums[lo] <= target && target <= nums[mid]) {
          hi = mid;
        } else lo = mid;
      } else {
        if (nums[mid] <= target && target <= nums[hi]) {
          lo = mid;
        } else hi = mid;
      }
    }
    if (nums[lo] == target) return lo;
    if (nums[hi] == target) return hi;
    return -1;
  }
}

// @lc code=end
// class Test {
//   public static void main(String[] args) {
//     Solution sltn = new Solution();
//     int[] nums = {5, 1, 3};
//     int target = 5;
//     int res = sltn.search(nums, target);
//     return;
//   }
// }
