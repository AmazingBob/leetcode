/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

// @lc code=start
class Solution {
  public boolean isPalindrome(ListNode head) {
    // Corner case
    if (head == null) return true;

    // Use fast-slow pointer to find the middle node
    ListNode fast = head;
    ListNode slow = head;
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    // Edge-to-middle
    ListNode backward = reverse(slow.next);
    ListNode forward = head;
    while(backward != null && forward != null) {
      if (backward.val != forward.val) return false;
      backward = backward.next;
      forward = forward.next;
    }

    return true;
  }

  private ListNode reverse(ListNode head) {
    ListNode backwardHead = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = backwardHead;
      backwardHead = head;
      head = next;
    }
    return backwardHead;
  }
}
// @lc code=end
