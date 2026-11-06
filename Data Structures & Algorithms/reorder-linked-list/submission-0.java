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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        int n = 0;
        ListNode currNode = head;
        while (currNode != null) {
            stack.push(currNode);
            n++;
            currNode = currNode.next;
        }
        
        int index = 0;
        currNode = head;
        while (index < (n / 2)) {
            ListNode poppedNode = stack.pop();
            poppedNode.next = currNode.next;
            currNode.next = poppedNode;
            currNode = poppedNode.next;
            index++;
        }

        currNode.next = null;
    }

    private void printLinkedList(ListNode head) {
        ListNode currNode = head;

        while (currNode != null) {
            System.out.print(currNode.val + " ");
        }
        System.out.println()
;    }
}
