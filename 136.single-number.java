/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
import java.util.*;

class Solution {
  public int singleNumber(int[] nums) {
    int res = 0;
    for (int i = 0; i < nums.length; ++i) {
      res ^= nums[i];
    }
    return res;
  }
}
// @lc code=end
