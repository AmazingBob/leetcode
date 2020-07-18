/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start

class Solution {
  public ListNode rotateRight(ListNode head, int k) {
    // Corner case
    if (head == null || head.next == null) return head;

    ListNode fast = head;
    ListNode slow = head;
    int length = 0;
    // Get list length
    while (fast != null) {
      ++length;
      fast = fast.next;
    }
    // Find pivote
    k %= length;
    fast = head;
    for (int i = 0; i < k; i++) {
      fast = fast.next;
    }
    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    fast.next = head;
    head = slow.next;
    slow.next = null;

    return head;
  }
}
// @lc code=end
