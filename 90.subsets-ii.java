import java.util.*;

/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    // Corner case
    if (nums == null || nums.length == 0) return res;
    // DFS
    Arrays.sort(nums);
    dfs(nums, 0, res, new ArrayList<>());
    return res;
  }

  private void dfs(int[] nums, int idx, List<List<Integer>> res, List<Integer> subset) {
    res.add(new ArrayList<>(subset));
    for (int i = idx; i < nums.length; i++) {
      if (i > idx && nums[i] == nums[i - 1]) continue;
      subset.add(nums[i]);
      dfs(nums, i + 1, res, subset);
      subset.remove(subset.size() - 1);
    }
    return;
  }
}
// @lc code=end
