import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> res = new ArrayList<>();
    // Corner case
    if (nums == null || nums.length == 0) return res;
    int start = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] - 1 != nums[i - 1]){
        if (i - 1 == start) res.add(nums[start] + "");
        else res.add(nums[start] + "->" + nums[i - 1]);
        start = i;
      }
    }
    if (start == nums.length - 1) {
      // Compeletely not continuous
      res.add(nums[start] + "");
    } else {
      // Compeletely continuous
      res.add(nums[start] + "->" + nums[nums.length - 1]);
    }
    return res;
  }
}
// @lc code=end
