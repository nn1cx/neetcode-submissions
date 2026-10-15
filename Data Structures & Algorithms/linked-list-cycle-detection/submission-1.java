/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        
        HashSet<ListNode> set = new HashSet<>();
        ListNode currNode = head;

        while (currNode.next != null) {
            if (!set.contains(currNode.next)) {
                set.add(currNode);
                currNode = currNode.next;
            }
            else {
                return true;
            }
        }
        
        return false;
    }
}
