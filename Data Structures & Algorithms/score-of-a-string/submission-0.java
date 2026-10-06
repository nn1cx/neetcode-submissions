class Solution {
    public int scoreOfString(String s) {
        int totalDifference = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            //a = (int) a;

            char b = s.charAt(i + 1);
            //b = (int)b;

            int tempDifference = (Math.max(a, b) - Math.min(a,b));
            totalDifference += tempDifference;
            // 1.2 syntac(the thing)-class#2499
        }

        return totalDifference;
    }
}