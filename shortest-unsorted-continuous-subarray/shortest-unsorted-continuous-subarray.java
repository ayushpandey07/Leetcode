class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l = 0;
        int r = nums.length -1;
        while(l < r && nums[l] <= nums[l+1]){
           
                l++;
            
            
        }
        if(l == r) return 0;
        while(r >  0 && nums[r] >= nums[r-1]){
             r--;
        }
        if(r == 0 ) return nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = l ; i <= r ; i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
           
        }
        while(l >=0 && nums[l] > min){
            l--;
        }
        while(r < nums.length && nums[r] < max){
            r++;
        }
        return r-l-1;
    }
}