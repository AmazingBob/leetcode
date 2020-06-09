/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 */
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      if (head == null || head.next == null) return head;
      ListNode currNode = head, nextNode = head.next;
      while(nextNode != null){
        if(nextNode.val == currNode.val){
          // Remove duplicates
          nextNode = nextNode.next;
        } else {
          // Update Node
          currNode.next = nextNode;
          currNode = nextNode;
          nextNode = nextNode.next;
        }
        // Add null tail to the node list
        if(nextNode == null) currNode.next = null;
      }
      return head;
    }
}
// @lc code=end

// class Test{
//   public static void main(String[] args) {
//     ListNode head = new ListNode();
//     int[] array = {1, 1, 2, 3, 3};
//     listBuilder(head, array);
//     Solution s = new Solution();
//     ListNode res = s.deleteDuplicates(head);
//     return;
//   }
//   private static void listBuilder(ListNode head, int[] array){
//     ListNode ptr = head;
//     for (int i = 0; i < array.length; i++) {
//       ptr.val = array[i];
//       ptr.next = i + 1 == array.length ? null : new ListNode();
//       ptr = ptr.next; 
//     }
//   }
// }