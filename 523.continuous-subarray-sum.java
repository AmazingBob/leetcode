import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=523 lang=java
 *
 * [523] Continuous Subarray Sum
 */

// @lc code=start
class Solution {
  public boolean checkSubarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int subarraySum = 0;
    map.put(0, -1);
    for (int i = 0; i < nums.length; i++) {
      subarraySum += nums[i];
      if (k != 0) {
        subarraySum %= k;
      }
      Integer prev = map.get(subarraySum);
      if (prev != null) {
        if (i - prev > 1) {
          return true;
        }
      } else {
        map.put(subarraySum, i);
      }
    }
    return false;
  }
}
// @lc code=end
