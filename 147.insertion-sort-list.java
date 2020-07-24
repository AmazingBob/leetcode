/*
 * @lc app=leetcode id=147 lang=java
 *
 * [147] Insertion Sort List
 */

// @lc code=start

class Solution {
  public ListNode insertionSortList(ListNode head) {
    // Corner case
    if (head == null || head.next == null) return head;

    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode curr = head;
    ListNode prev = null;
    ListNode temp = null;
    while (curr != null && curr.next != null) {
      if (curr.val <= curr.next.val){
        curr = curr.next;
      } else {
        temp = curr.next;
        curr.next = curr.next.next;
        prev = dummy;
        while (prev.next.val <= temp.val) prev = prev.next;
        temp.next = prev.next;
        prev.next = temp;
      }
    }

    return dummy.next;
  }
}
// @lc code=end
