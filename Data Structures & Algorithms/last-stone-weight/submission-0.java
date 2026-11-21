class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone: stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int a = queue.remove();
            int b = queue.remove();

            if (a == b) {
                continue;
            }
            else if (a < b) {
                b = b - a;
                queue.add(b);
            }
            else {
                a = a - b;
                queue.add(a);
            }
        }

        if (queue.isEmpty()) {
            return 0;
        }

        return queue.peek();
    }
}
