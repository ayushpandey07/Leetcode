class Solution {
    public int maxSubArray(int[] nums) {
        if(null == nums || nums.length ==0){
            return 0;
        }
        int maxHere = nums[0];
        int maxSoFar = maxHere;
        for(int i =1;i<nums.length;i++){
            maxHere = maxHere+nums[i] > nums[i] ? maxHere+nums[i] : nums[i] ;
            maxSoFar = Math.max(maxHere , maxSoFar);
        }
        return maxSoFar;
    }
}