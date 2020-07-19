/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
 */

// @lc code=start
class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    // Corner case
    if (head == null || head.next == null) return head;
    // Add dummy node
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    // Two pointer
    ListNode curr = head;
    ListNode prev = dummy;
    while (curr != null) {
      while (curr.next != null && curr.val == curr.next.val) {
        curr = curr.next;
      }
      // Update prev
      if (prev.next != curr) prev.next = curr.next;
      else prev = prev.next;
      // Update curr
      curr = prev.next;
    }

    return dummy.next;
  }
}
// @lc code=end
