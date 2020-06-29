/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
  public void nextPermutation(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return;
    /** Time: O(n) Space: O(1) */
    int isMaxAfter = nums.length - 2;
    while (isMaxAfter >= 0) {
      if (nums[isMaxAfter] >= nums[isMaxAfter + 1]) {
        --isMaxAfter;
      } else {
        break;
      }
    }
    if (isMaxAfter == -1) {
      reverse(nums, 0, nums.length - 1);
      return;
    }
    int swapPosition = nums.length - 1;
    while (swapPosition > isMaxAfter && nums[swapPosition] <= nums[isMaxAfter]) {
      --swapPosition;
    }
    swap(nums, isMaxAfter, swapPosition);
    reverse(nums, isMaxAfter + 1, nums.length - 1);
  }

  private void reverse(int[] nums, int start, int end) {
    if (nums == null || nums.length == 0) return;
    while (start < end) {
      swap(nums, start++, end--);
    }
    return;
  }

  private final void swap(int[] nums, int ptr1, int ptr2) {
    int temp = nums[ptr1];
    nums[ptr1] = nums[ptr2];
    nums[ptr2] = temp;
    return;
  }
}
// @lc code=end
