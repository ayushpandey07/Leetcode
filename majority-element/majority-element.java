class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer c = null;
        for(int n : nums){
            if(count ==0){
                c = n;
                count++;
            }else{
                count += (c == n)?+1 :-1;
            }
        }
        return c;
    }
}