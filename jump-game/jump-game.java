class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length <= 1) return true;
        int steps = nums[0];
        int maxReach = steps;
        for(int i = 1 ; i < nums.length ;i++){
            if(maxReach < i) return false;
            maxReach = Math.max(maxReach , i+nums[i]);
            steps--;
            if(steps ==0){
                steps = maxReach - i;
            }
        }
        return true;
    }
}