class KthLargest {

    private Queue<Integer> queue;
    private int k;

    //1, 2, 3, 3, 3, 5, 6, 7
    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        this.k = k;
        
        for (int num: nums) {
            queue.add(num);
        }

        while (queue.size() > this.k) {
            queue.remove();
        }


    }
    
    public int add(int val) {
        queue.add(val);
        
        while (queue.size() > this.k) {
            queue.remove();
        }
        
        return queue.peek();
    }
}
