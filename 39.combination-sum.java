import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    // Corner case
    if (candidates == null || candidates.length == 0) return res;
    // DFS
    dfs(candidates, target, 0, res, new ArrayList<Integer>());
    return res;
  }

  private void dfs(int[] candidates, int target, int startID, List<List<Integer>> res, List<Integer> subset) {
    if (target == 0) {
      res.add(new ArrayList<Integer>(subset));
      return;
    }
    if (target < 0) {
      return;
    }
    for (int i = startID; i < candidates.length; i++) {
      subset.add(candidates[i]);
      dfs(candidates, target - candidates[i], i, res, subset);
      subset.remove(subset.size() - 1);
    }
  }
}
// @lc code=end
