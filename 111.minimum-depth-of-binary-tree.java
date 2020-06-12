import java.util.*;

/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// @lc code=start
class Solution {
  public int minDepth(TreeNode root) {
    // Corner case
    if (root == null) return 0;
    // BFS
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int level = 1;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode curNode = queue.poll();
        if (curNode.left == null && curNode.right == null) return level; // Find the nearest leaf node
        if (curNode.left != null) queue.offer(curNode.left);
        if (curNode.right != null) queue.offer(curNode.right);
      }
      level++;
    }
    return level;
  }
}
// @lc code=end
