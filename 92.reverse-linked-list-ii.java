import sun.util.resources.cldr.ext.CurrencyNames_xh;

/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
 */

// @lc code=start
class Solution {
  public ListNode reverseBetween(ListNode head, int m, int n) {
    // Corner case
    if (head == null) return head;
    // Add dummy node
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    
    ListNode curr = head;
    ListNode prev = dummy;

    for (int i = 0; i < m - 1; i++) {
      prev = prev.next;
    }
    curr = prev.next;
    for (int i = m; i < n; i++) {
      // Put curr next to prev next;
      ListNode next = curr.next;
      curr.next = next.next;
      next.next = prev.next;
      prev.next = next;
    }

    return dummy.next;
  }
}
// @lc code=end
