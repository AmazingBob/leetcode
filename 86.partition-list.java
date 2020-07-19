/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
 */

// @lc code=start
class Solution {
  public ListNode partition(ListNode head, int x) {
    // Corner case
    if (head == null || head.next == null) return head;
    // Add dummy node
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    
    ListNode idx = dummy;
    ListNode curr = dummy;
    while (curr != null) {
      if (curr.next != null && curr.next.val < x) {
        // Move curr to idx.next
        if (idx != curr) {
          ListNode temp = curr.next;
          curr.next = curr.next.next;
          temp.next = idx.next;
          idx.next = temp;
          idx = idx.next;
          continue;
        }
        idx = idx.next;
      }
      curr = curr.next;
    }

    return dummy.next;
  }
}
// @lc code=end
