class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        helper(nums , res , new ArrayList<>() , new boolean[nums.length]);
        return res;
    }
    
    private void helper(int[] nums , List<List<Integer>> res ,List<Integer> temp ,boolean[] b ){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            if(b[i]) continue;
            
            temp.add(nums[i]);
            b[i] = true ;
            helper(nums , res , temp , b);
            b[i] = false;
            temp.remove(temp.size()-1);

        }
        
    }
}