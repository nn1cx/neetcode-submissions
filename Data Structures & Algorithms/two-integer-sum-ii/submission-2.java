class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstPoint = 0;
        int secondPoint = numbers.length - 1;
        boolean targetMet = false;
        
        while (!targetMet) {
            int tempNum = numbers[firstPoint] + numbers[secondPoint];
            if (tempNum > target) {
                secondPoint--;
            }
            else if (tempNum < target) {
                firstPoint++;
            }
            else {
                return new int[] {firstPoint + 1, secondPoint + 1};
            }
        }

        return new int[0];
    }
}
