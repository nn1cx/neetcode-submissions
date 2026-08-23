class MinStack {

    Stack<Integer> main;
    Stack<Integer> min;

    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        main.push(val);
        if (min.isEmpty()) {
            min.push(val);
            //System.out.println("Current Min: " + min.peek());
        }
        else if (val <= min.peek()) {
            min.push(val);
            //System.out.println("Current Min: " + min.peek());
        }
    }

    public void pop() {
        if (main.peek().equals(min.peek())) {
            min.pop();
            //System.out.println("Current Min: " + min.peek());
        }
        main.pop();
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
