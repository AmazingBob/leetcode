/*
 * @lc app=leetcode id=109 lang=java
 *
 * [109] Convert Sorted List to Binary Search Tree
 */

// @lc code=start

class Solution {
  public TreeNode sortedListToBST(ListNode head) {
    // Corner case
    if (head == null) return null;
    
    return dfs(head, null);
  }

  private TreeNode dfs(ListNode head, ListNode tail) {
    // Exit
    if (head == tail) return null;
    // Fast-slow pointer to find middle node
    ListNode fast = head;
    ListNode slow = head;
    while (fast != tail && fast.next != tail) {
      fast = fast.next.next;
      slow = slow.next;
    }
    TreeNode node = new TreeNode(slow.val);
    node.left = dfs(head, slow);
    node.right = dfs(slow.next, tail);
    return node;
  }
}
// @lc code=end
