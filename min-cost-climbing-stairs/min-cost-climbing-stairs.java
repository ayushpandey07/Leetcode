class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int twoStepBefore = cost[0];
        int oneStepBeforee = cost[1];
        int curr = 0;
        for(int i = 2 ; i < cost.length ;i++){
            curr = Math.min(twoStepBefore ,oneStepBeforee) + cost[i];
            twoStepBefore = oneStepBeforee;
            oneStepBeforee = curr;
        }
        return Math.min(twoStepBefore ,oneStepBeforee);
    }
}