/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
  public int[] twoSum(int[] numbers, int target) {
    // Double pointer;
    int ptrL = 0;
    int ptrR = numbers.length - 1;
    while (ptrL < ptrR) {
      int sum = numbers[ptrL] + numbers[ptrR];
      if (sum < target) {
        ++ptrL;
      } else if (sum > target) {
        --ptrR;
      } else {
        break;
      }
    }
    return new int[] {ptrL + 1, ptrR + 1};
  }
}
// @lc code=end
