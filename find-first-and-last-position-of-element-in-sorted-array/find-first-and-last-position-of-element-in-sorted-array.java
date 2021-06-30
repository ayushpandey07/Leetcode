class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        int[] res = new int[2];
        double left = target -0.5;
        double right = target +0.5;
        int l = bs(nums , left);
        int r = bs(nums , right);
        if(l ==r) return new int[]{-1,-1};
        
        return new int[]{l,r-1};
    }
    private int bs(int[] nums , double t){
        int l = 0 , r = nums.length -1;
        while(l<=r ){
            int m = l+(r-l)/2;
            if(nums[m] > t){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return l;
    }
}