class Solution {
    public int rob(int[] nums) {
        int[] res = new int[nums.length+1];
        res[0] = 0;
        res[1] = nums[0];
        for(int i =1 ;i < nums.length ;i++){
            int v = nums[i];
            res[i+1] = Math.max(v+res[i-1] , res[i]); 
        }
        return res[nums.length];
    }
}