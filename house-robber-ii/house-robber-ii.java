class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n ==1) return nums[0];
        return Math.max(robs(nums , 0 , n-2), robs(nums , 1 , n-1));
    }
    
    public int robs(int nums[] , int l , int h){
        int old = 0;
        int older = 0;
        for(int i = l ; i <= h ; i++){
            int temp = old;
            old = Math.max(nums[i]+older , old);
            older = temp;
        }
        return old;
    }
}