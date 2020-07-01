/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
  public int[] searchRange(int[] nums, int target) {
    int[] res = {-1, -1};
    // Corner case
    if (nums == null || nums.length == 0) return res;
    // Middle -> edge: find target
    int ptrL = 0;
    int ptrR = nums.length - 1;
    int mid = ptrL + (ptrR - ptrL) / 2;
    while (ptrL < ptrR) {
      if (nums[mid] == target) {
        break;
      } else if (nums[mid] > target) {
        ptrR = mid - 1;
      } else {
        ptrL = mid + 1;
      }
      mid = ptrL + (ptrR - ptrL) / 2;
    }
    if (nums[mid] != target) return res;
    // Edge -> middle: find boundary
    ptrL = ptrR = mid;
    while (ptrL > 0 && nums[ptrL - 1] == target) {
      --ptrL;
    }
    while (ptrR < nums.length - 1 && nums[ptrR + 1] == target) {
      ++ptrR;
    }
    res[0] = ptrL;
    res[1] = ptrR;
    return res;
  }
}
// @lc code=end