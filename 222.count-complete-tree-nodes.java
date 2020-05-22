import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=222 lang=java
 *
 * [222] Count Complete Tree Nodes
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
  public int countNodes(TreeNode root) {
    if (root == null) return 0;
    int left_depth = getDepth(root.left);
    int right_depth = getDepth(root.right);
    if (left_depth == right_depth) {
      return (1 << left_depth) + countNodes(root.right);
    } else {
      return (1 << right_depth) + countNodes(root.left);
    }
  }

  private int getDepth(TreeNode root) {
    int depth = 0;
    while (root != null) {
      ++depth;
      root = root.left;
    }
    return depth;
  }
}
// @lc code=end
