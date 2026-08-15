class Solution {
    public int maxArea(int[] heights) {
        int currMax = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int min = Math.min(heights[l], heights[r]);
            int area = r - l;
            int tempVal = min * area;

            if (tempVal > currMax) {
                currMax = tempVal;
            }
            if (min == heights[l]) {
                l++;
            }
            else if (min == heights[r]){
                r--;
            }
        }


        return currMax;
    }
}
