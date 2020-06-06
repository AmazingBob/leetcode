/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) return 0;
    int temp = 2;
    for (int i = 2; i < nums.length; i++) {
      if (nums[i] != nums[temp - 2]) {
        nums[temp++] = nums[i];
      }
    }
    return temp;
  }
}
// @lc code=end
