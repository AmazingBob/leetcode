import java.util.*;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums == null || nums.length == 0) return res;
    Arrays.sort(nums);
    dfs(nums, 0, res, new ArrayList<>());
    return res;
  }

  private void dfs(int[] nums, int startID, List<List<Integer>> res, List<Integer> subset) {
    res.add(new ArrayList<>(subset));
    for (int i = startID; i < nums.length; i++) {
      subset.add(nums[i]);
      dfs(nums, i + 1, res, subset);
      subset.remove(subset.size() - 1);
    }
    return;
  }
}
// @lc code=end
