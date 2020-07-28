/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
 */

// @lc code=start
class Solution {
  public ListNode sortList(ListNode head) {
    // Exit
    if (head == null || head.next == null) return head;
    
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode fast = dummy;
    ListNode slow = dummy;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    ListNode mid = slow.next;
    slow.next = null;

    return merge(sortList(head), sortList(mid));
  }

  private ListNode merge(ListNode head1, ListNode head2) {
    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;
    while (head1 != null && head2 != null) {
      if (head1.val > head2.val) {
        curr.next = head2;
        head2 = head2.next;
      } else {
        curr.next = head1;
        head1 = head1.next;
      }
      curr = curr.next;
    }
    if (head1 != null) curr.next = head1;
    if (head2 != null) curr.next = head2;

    return dummy.next;
  }
}
// @lc code=end

// class Test {
//   public static void main(String[] args) {
//     int[] valArray = {4,2,1,3};
//     ListNode dummy = new ListNode(-1);
//     ListNode curr = dummy;
//     for (int val : valArray) {
//       curr.next = new ListNode(val);
//       curr = curr.next;
//     }
//     curr.next = null;
//     Solution sltn = new Solution();
//     ListNode node = sltn.sortList(dummy.next);
//     return;
//   }
// }