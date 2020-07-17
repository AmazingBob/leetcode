import java.util.*;

/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  public Node copyRandomList(Node head) {
    // Corner case
    if (head == null) return null;

    HashMap<Node, Node> map = new HashMap<>();
    Node curr = head;
    while (curr != null) {
      map.put(curr, new Node(curr.val, null, null));
      curr = curr.next;
    }
    curr = head;
    while (curr != null) {
      map.get(curr).next = map.get(curr.next);
      map.get(curr).random = map.get(curr.random);
      curr = curr.next;
    }

    return map.get(head);
  }
}
// @lc code=end
