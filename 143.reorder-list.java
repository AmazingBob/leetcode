/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
 */

// @lc code=start

class Solution {
  public void reorderList(ListNode head) {
    // Corner case
    if (head == null || head.next == null) return;
    // Find mid node
    ListNode mid = findMid(head);
    ListNode list_2 = mid.next;
    mid.next = null;
    list_2 = reverse(list_2);
    ListNode list_1 = head;
    while (list_1 != null && list_2 != null) {
      ListNode next = list_1.next;
      list_1.next = list_2;
      list_2 = list_2.next;
      list_1.next.next = next;
      list_1 = next;
    }
  }
  
  private ListNode findMid(ListNode head){
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  private ListNode reverse(ListNode head) {
    ListNode newHead = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = newHead;
      newHead = head;
      head = next;
    }
    return newHead;
  }
}
// @lc code=end
