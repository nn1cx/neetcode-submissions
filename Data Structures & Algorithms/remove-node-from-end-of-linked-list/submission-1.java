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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head;
        int length = 0;

        while (currNode != null) {
            length++;
            currNode = currNode.next;
        }

        int indexToRemove = length - n;

        if (indexToRemove == 0) {
            return head.next;
        }

        ListNode prevNode = null;
        currNode = head;
        int currNodeIndex = 0;

        while (currNodeIndex < indexToRemove) {
            prevNode = currNode;
            currNode = currNode.next;
            currNodeIndex++;
        }

        prevNode.next = currNode.next;
        currNode.next = null;

        return head;
    }
}
