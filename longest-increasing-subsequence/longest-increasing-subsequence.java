class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length <=1) return nums.length;
        int m =nums.length;
        int[] dp = new int[m];
        int len = 0;
        dp[0] = nums[0];
        for(int i=1;i< m;i++){
            if(dp[len] < nums[i]){
                dp[++len] = nums[i];
            }else{
                dp[bSearch(dp,len,nums[i])] = nums[i];
            }
        }
        return len+1;
    }
    
    private int bSearch(int[] dp , int e , int k){
        int s = 0;
        
        while(s<e){
            int m = s+(e-s)/2;
            if(dp[m] >= k){
                e = m;
            }else{
                s = m+1;
            }
        }
        return e;
    }
}