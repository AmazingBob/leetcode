import java.util.*;

/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
 */

// @lc code=start
class Solution {
  public int kthSmallest(TreeNode root, int k) {
    Queue<Integer> queue = new LinkedList<>();
    kthSmallestHelper(root, queue);
    for (int i = 0; i < k - 1; i++) {
      queue.poll();
    }
    return queue.poll();
  }

  private void kthSmallestHelper(TreeNode parrent, Queue<Integer> queue) {
    if (parrent == null) return;
    kthSmallestHelper(parrent.left, queue);
    queue.add(parrent.val);
    kthSmallestHelper(parrent.right, queue);
    return;
  }
}
// @lc code=end
