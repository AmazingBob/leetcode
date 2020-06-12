/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

// @lc code=start

class Solution {
  public boolean hasPathSum(TreeNode root, int sum) {
    // Corner case
    if (root == null) return false;
    // Exit 
    if (root.left == null && root.right == null) return root.val == sum;
    return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
  }
}
// @lc code=end
