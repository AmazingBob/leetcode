/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
class Solution {
  public ListNode removeElements(ListNode head, int val) {
    // Corner case
    if (head == null) return head;
    // Trim head
    while (head != null && head.val == val) {
      head = head.next;
    }
    // Delete target node
    ListNode curr = head;
    while (curr != null && curr.next != null) {
      if (curr.next.val == val) {
        curr.next = curr.next.next;
      } else {
        curr = curr.next;
      }
    }
    
    return head;
  }
}
// @lc code=end
