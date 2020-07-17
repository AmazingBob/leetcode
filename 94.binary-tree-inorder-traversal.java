import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start
class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> res = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode curr = root;

    while (curr != null || !stack.empty()) {
      // Push root into stack
      while (curr != null) {
        stack.add(curr);
        curr = curr.left;
      }
      // Put node into res
      curr = stack.pop();
      res.add(curr.val);
      curr = curr.right;
    }

    return res;
  }
}
// @lc code=end
