class Solution {
    public boolean isPalindrome(String s) {
        String tempS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))) {
                tempS = tempS + s.charAt(i);
            }
        }
        String newS = tempS.toLowerCase();
        
        boolean palindrome = true;

        for (int i = 0; i < (tempS.length() / 2); i++) {
            if (newS.charAt(i) != newS.charAt(newS.length() - 1 - i) && i != (newS.length() - 1 - i)) {
                palindrome = false;
            }
        }

        return palindrome;
    }
}
