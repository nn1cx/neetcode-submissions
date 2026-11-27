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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list: lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode currentNode = dummy;

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.remove();
            currentNode.next = node;
            currentNode = currentNode.next;

            node = node.next;
            if (node != null) {
                minHeap.add(node);
            }
        }

        return dummy.next;
    }
}
