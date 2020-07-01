import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    // Corner case
    if (candidates == null || candidates.length == 0) return res;
    // Sort remove duplicates
    Arrays.sort(candidates);
    // DFS
    dfs(candidates, target, 0, res, new ArrayList<Integer>());
    return res;
  }

  private void dfs(int[] candidates, int target, int startID, List<List<Integer>> res, List<Integer>subset) {
    if (target == 0) {
      res.add(new ArrayList<Integer>(subset));
      return;
    }
    if (target < 0) return;
    for (int i = startID; i < candidates.length; i++) {
      if (i > startID && candidates[i] == candidates[i - 1]) continue;
      subset.add(candidates[i]);
      dfs(candidates, target - candidates[i], i + 1, res, subset);
      subset.remove(subset.size() - 1);
    }
    return;
  }
}
// @lc code=end
