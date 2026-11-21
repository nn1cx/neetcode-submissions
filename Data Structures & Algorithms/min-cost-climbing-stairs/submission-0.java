class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int[] minCost = new int[cost.length];
        minCost[0] = cost[0];
        minCost[1] = cost[1];

        int currentMin = Math.min(minCost[0], minCost[1]);

        for (int i = 2; i < minCost.length; i++) {
            minCost[i] = cost[i] + Math.min(minCost[i - 1], minCost[i - 2]);
            currentMin = Math.min(minCost[i - 1], minCost[i]);
        }
        
        return currentMin;
    }
}
