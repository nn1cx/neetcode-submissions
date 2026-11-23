class Solution {
    List<String> validParenthesis;

    public List<String> generateParenthesis(int n) {
        validParenthesis = new ArrayList<>();

        backtrack("", n, 0, 0);
        return validParenthesis;
    }

    private void backtrack(String string, int n, int startParenCount, int closeParenCount) {
        if (startParenCount == closeParenCount && startParenCount == n) {
            validParenthesis.add(string);
            return;
        }
        
        /*
        string += "()";
        backtrack(string, n, startParenCount + 1, closeParenCount + 1);

        string = string.substring(0, string.length());
        backtrack(string, n, startParenCount + 1, closeParenCount);
        */

        if (startParenCount < n) {
            string += "(";
            backtrack(string, n, startParenCount + 1, closeParenCount);
            string = string.substring(0, string.length() - 1);
        }
        if (closeParenCount < startParenCount) {
            string += ")";
            backtrack(string, n, startParenCount, closeParenCount + 1);
        }
    }
}
