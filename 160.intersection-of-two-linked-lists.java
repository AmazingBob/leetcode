/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // Corner case
    if (headA == null || headB == null) return null;
    // Double ptr
    // Time: O(n)
    // Space: O(1)
    ListNode ptrA = headA;
    ListNode ptrB = headB;
    while (ptrA != ptrB) {
      ptrA = ptrA == null? headB : ptrA.next;
      ptrB = ptrB == null? headA : ptrB.next;
    }
    return ptrA; // or ptrB
  }
}
// @lc code=end
