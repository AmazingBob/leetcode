import java.util.Arrays;

/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
  public int findDuplicate(int[] nums) {
    int minNum = 1, maxNum = nums.length - 1;
    while (minNum < maxNum) {
      int midNum = minNum + (maxNum - minNum) / 2;
      int smallerNumCounter = 0, midNumCounter = 0;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] < midNum) {
          ++smallerNumCounter;
        } else if (nums[i] == midNum) {
          ++midNumCounter;
        }
      }
      if (midNumCounter > 1) {
        return midNum;
      } else if (smallerNumCounter < midNum) {
        minNum = midNum + 1;
      } else {
        maxNum = midNum - 1;
      }
    }
    return minNum;
  }
}
// @lc code=end