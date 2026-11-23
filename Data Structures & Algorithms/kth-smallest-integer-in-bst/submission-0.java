/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();

            minHeap.add(currentNode.val);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        int n = minHeap.size();
        int currVal = 0;
        for (int i = 0; i <= n - k; i++) {
            currVal = minHeap.remove();
        }

        return currVal;
    }

    //minHeap (3, 2, 1)
}
