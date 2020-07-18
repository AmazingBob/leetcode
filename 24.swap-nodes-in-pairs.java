/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */

// @lc code=start

/*
  dummy->1->2->3->4
  back
         front
 */

class Solution {
  public ListNode swapPairs(ListNode head) {
    // Corner case
    if (head == null || head.next == null) return head;
    
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode back = dummy;
    ListNode front = head;

    while (front != null && front.next != null) {
      ListNode temp = front.next.next;
      back.next = front.next;
      front.next.next = front;
      front.next = temp;
      back = front;
      front = front.next;
    }

    return dummy.next;
  }
}
// @lc code=end
