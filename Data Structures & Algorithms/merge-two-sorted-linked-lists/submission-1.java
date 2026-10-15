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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        else if (list1 == null) {
            return list2;
        }
        else if (list2 == null){
            return list1;
        }

        ListNode mergedList = null;
        ListNode currListNode = null;
        ListNode currNode1 = list1;
        ListNode currNode2 = list2;

        while (currNode1 != null & currNode2 != null) {
            if (currNode1.val < currNode2.val) {
                if (mergedList == null) {
                    mergedList = currNode1;
                    currListNode = mergedList;
                     currNode1 = currNode1.next;
                }
                else {
                    currListNode.next = currNode1;
                    currListNode = currNode1;
                    currNode1 = currNode1.next;
                }
            }
            else if (currNode2.val < currNode1.val) {
                if (mergedList == null) {
                    mergedList = currNode2;
                    currListNode = mergedList;
                    currNode2 = currNode2.next;
                }
                else {
                    currListNode.next = currNode2;
                    currListNode = currNode2;
                    currNode2 = currNode2.next;
                }
            }
            else {
                if (mergedList == null) {
                    mergedList = currNode1;
                    currListNode = currNode1;
                    currNode1 = currNode1.next;
                    currListNode.next = currNode2;
                    currListNode = currNode2;
                    currNode2 = currNode2.next;
                }
                else {
                    currListNode.next = currNode1;
                    currListNode = currNode1;
                    currNode1 = currNode1.next;
                    currListNode.next = currNode2;
                    currListNode = currNode2;
                    currNode2 = currNode2.next;
                }
            }
        }

        while (currNode1 != null) {
            currListNode.next = currNode1;
            currListNode = currNode1;
            currNode1 = currNode1.next;
        }

        while (currNode2 != null) {
            currListNode.next = currNode2;
            currListNode = currNode2;
            currNode2 = currNode2.next;
        }

        return mergedList;
    }
}