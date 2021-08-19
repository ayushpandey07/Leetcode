class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
       int res = 0;
        int max =0;
        for(int i =0;i <nums.length;i++){
            if(nums[i]==0){
                max =0;
                continue;
            }
            max++;
            res = Math.max(res,max);
            
        }
        return res;
    }
}