class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> temp = new Stack<>();

        for (String token: tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                if (token.equals("+")) {
                    temp.push(temp.pop() + temp.pop());
                }
                else if (token.equals("-")) {
                    int b = temp.pop();
                    int a = temp.pop();
                    temp.push(a - b);
                }
                else if (token.equals("*")) {
                    temp.push(temp.pop() * temp.pop());
                }
                else {
                    int b = temp.pop();
                    int a = temp.pop();
                    temp.push(a / b);
                }
            }
            else {
                int val = Integer.parseInt(token);
                temp.push(val);
            }
        }
        return temp.peek();
    }
}
