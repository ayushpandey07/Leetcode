class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        int sum = 0;
        for(int n : nums){
            sum += n;
            
            count[((sum%k)+k)%k]++;
        }
        int res=0;
        
        for(int i =0;i< count.length ;i++){
            if(count[i]>1)res+= count[i]*(count[i]-1)/2;
        }
        res += count[0];
        return res;
    }
}