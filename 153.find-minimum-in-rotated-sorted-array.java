/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
  public int findMin(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return 0;
    // Binary search
    int lo = 0, hi = nums.length - 1;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] > nums[hi]) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }
    return Math.min(nums[lo], nums[hi]);
  }
}
// @lc code=end

// class Test {
//   public static void main(String[] args) {
//     int[] nums = {4};
//     Solution sltn = new Solution();
//     sltn.findMin(nums);
//     return;
//   }
// }
