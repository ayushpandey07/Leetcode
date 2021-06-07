class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int l =0;
        int r =0;
        int n = nums.length-1;
        for(int i =0;i<=n;i++){
            
            l = (l == 0 ? 1 : l) * nums[i];
            r = (r == 0 ? 1 : r) * nums[n-i];
            res = Math.max(res , Math.max(l,r));
        }
        return res;
    }
}