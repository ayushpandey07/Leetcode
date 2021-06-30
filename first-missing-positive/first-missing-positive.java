class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int n = nums.length;
        for(int i = 0 ;i < nums.length ;i++){
            if(nums[i] <=0 || nums[i] >n){
                nums[i] = n+1;
            } 
        }
        
        for(int i = 0;i<n;i++){
            int num = Math.abs(nums[i]);
            if(num > n) continue;
            num--;
            if(nums[num]>0){
                nums[num] = -1 * nums[num];
            }
        }
        
        for(int i = 0 ; i < n ;i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return n+1;
    }
}