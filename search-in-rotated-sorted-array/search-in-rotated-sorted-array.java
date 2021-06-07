class Solution {
    public int search(int[] nums, int k) {
        if(nums == null || nums.length == 0) return -1;
        int l = 0, r = nums.length-1;
        while(l <= r){
            
            int m = l +(r-l)/2;
            if(nums[m] == k) return m;
            if(nums[m] >= nums[l]){
                if(nums[l] <= k && nums[m] >k){
                    r = m-1;
                }else{
                    l = m+1;
                }
            }else{
                if(nums[m] < k && nums[r] >=k) {
                    l = m+1;
                }else{
                    r = m-1;
                }
            }
        }
        return -1;
    }
}