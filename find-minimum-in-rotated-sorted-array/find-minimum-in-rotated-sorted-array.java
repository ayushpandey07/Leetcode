class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int l=0 ,r =nums.length-1;
        if(nums[l] < nums[r]) return nums[l];

        
        while(l <= r){
            int m = l + (r-l)/2;
            if(m == nums.length-1) return nums[m];
            if(nums[m] > nums[m+1]) return nums[m+1];
            if(nums[m] < nums[m-1]) return nums[m];
            
            if(nums[m] > nums[0]){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return -1;
    }
}