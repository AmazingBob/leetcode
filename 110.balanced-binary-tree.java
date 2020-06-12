/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start

class Solution {
  private boolean res = true;

  public boolean isBalanced(TreeNode root) {
    dfs(root);
    return res;
  }

  private int dfs(TreeNode root) {
    if (root == null) return 0;
    int leftDegree = dfs(root.left);
    int rightDegree = dfs(root.right);
    if (Math.abs(leftDegree - rightDegree) > 1) {
      res = false;
      return -1;
    }
    return Math.max(leftDegree, rightDegree) + 1;
  }
}
// @lc code=end
