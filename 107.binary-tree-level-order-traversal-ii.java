import java.util.*;
/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    // Special case
    if(root == null) return res;
    // BFS non recursive implementation
    Queue<TreeNode> buffer = new LinkedList<>();
    buffer.offer(root);
    while(!buffer.isEmpty()){
      List<Integer> level = new ArrayList<>();
      int size = buffer.size();
      for (int i = 0; i < size; i++) {
        TreeNode head = buffer.poll();
        level.add(head.val);
        if(head.left != null) buffer.offer(head.left);
        if(head.right != null) buffer.offer(head.right);
      }
      res.add(0, level);
    }
    return res;
  }
}
// @lc code=end
