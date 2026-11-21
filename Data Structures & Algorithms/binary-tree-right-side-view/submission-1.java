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
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            TreeNode curr;

            for (int i = 0; i < levelSize; i++) {
                curr = queue.remove();

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

                if (i == levelSize - 1) {
                    list.add(curr.val);
                }
                else {
                    continue;
                }
            }
        }

        return list;
    }
}
