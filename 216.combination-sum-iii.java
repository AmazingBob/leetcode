import java.util.*;

/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

// @lc code=start
class Solution {
  public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> res = new ArrayList<>();
    // Corner case
    if (k <= 0 || n < 1) return res;
    dfs(k, n, res, new ArrayList<Integer>(), 1);
    return res;
  }

  private void dfs(int k, int target, List<List<Integer>> res, List<Integer> subset, int index) {
    if (target == 0 && subset.size() == k) {
      res.add(new ArrayList<Integer>(subset));
      return;
    }
    if (target < 0 || subset.size() > k) return;
    for (int i = index; i < 10; i++) {
      subset.add(i);
      dfs(k, target - i, res, subset, i + 1);
      subset.remove(subset.size() - 1);
    }
    return;
  }
}
// @lc code=end
