/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
  public void sortColors(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return;
    // One pass
    int zeroEndAt = -1;
    int twoStartAt = nums.length;
    for (int i = 0; i < twoStartAt;) {
      if (nums[i] == 1) {
        ++i;
      } else if (nums[i] == 2) {
        --twoStartAt;
        swap(nums, i, twoStartAt);
      } else {
        ++zeroEndAt;
        swap(nums, i, zeroEndAt);
        ++i;
      }
    }
    return;
  }
  private void swap(int[] nums, int ptrA, int ptrB) {
    int temp = nums[ptrA];
    nums[ptrA] = nums[ptrB];
    nums[ptrB] = temp;
    return;
  }
}
// @lc code=end
