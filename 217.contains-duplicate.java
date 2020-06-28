import java.util.*;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
  public boolean containsDuplicate(int[] nums) {
    return sortSolution(nums);
  }

  private boolean hashSetSolution(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return false;
    /*
     * Time: O(n)
     * Space: O(n)
     */
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; ++i) {
      if (set.contains(nums[i])) {
        return true;
      } else {
        set.add(nums[i]);
      }
    }
    return false;
  }

  private boolean sortSolution(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return false;
    /*
     * Time: O(nlogn)
     * Space: O(1)
     */
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) return true;
    }
    return false;
  }
}
// @lc code=end
