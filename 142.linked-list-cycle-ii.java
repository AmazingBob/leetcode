/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start

public class Solution {
  public ListNode detectCycle(ListNode head) {
    // Corner case
    if (head == null) return null;

    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) break;
    }

    if (fast == null || fast.next == null) return null;

    fast = head;
    while (slow != fast) {
      fast = fast.next;
      slow = slow.next;
    }

    return slow;
  }
}
// @lc code=end
