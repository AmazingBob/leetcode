/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode();
    ListNode front = dummy;
    ListNode back = dummy;
    dummy.next = head;

    // Let front move n times before back moving.
    for (int i = 0; i <= n; i++) {
      front = front.next;
    }
    while (front != null) {
      front = front.next;
      back = back.next;
    }
    // Remove target node.
    back.next = back.next.next;

    return dummy.next;
  }
}
// @lc code=end
