import java.util.*;

/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    // Corner case
    if (nums == null || nums.length == 0) return false;
    /**
     * Time: O(n)
     * Space: O(n)
     */
    HashMap<Integer, Integer> idxOfElement = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (!idxOfElement.containsKey(nums[i])) {
        idxOfElement.put(nums[i], i); // Record new element
      } else if (i - idxOfElement.get(nums[i]) <= k) {
        return true; // Find target
      } else {
        idxOfElement.put(nums[i], i); // Update idx
      }
    }
    return false;
  }
}
// @lc code=end
