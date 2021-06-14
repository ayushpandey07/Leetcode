class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for(int i = 0 ; i< nums.length;i++){
            if(s.isEmpty() || nums[s.peek()] > nums[i]){
                s.add(i);
            }
        }
        for(int i = nums.length-1 ; i >res ;--i){
            
            while(!s.isEmpty() && nums[s.peek()] <= nums[i]){
            res = Math.max(res ,i - s.pop() );
            }
        }
        return res;
    }
}