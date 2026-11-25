/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> cloned = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        cloned.put(node, new Node(node.val));
        queue.add(node);

        while(!queue.isEmpty()) {
            Node currentNode = queue.remove();

            for (Node neighbor: currentNode.neighbors) {
                if (!cloned.containsKey(neighbor)) {
                    cloned.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                cloned.get(currentNode).neighbors.add(cloned.get(neighbor));
            }
        }
        
        return cloned.get(node);
    }
}