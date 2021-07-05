class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates , new ArrayList<Integer>() , res , 0 , target);
        return res;
    }
    
    void helper(int[] candidates , List<Integer> temp ,List<List<Integer>> res ,int s ,int target){
        if(target < 0) return;
        else if (target ==0) res.add(new ArrayList<>(temp));
        else{
            for(int i =s ;i <candidates.length ;i++){
                if( target-candidates[i] < 0) break;

                temp.add(candidates[i]);
                System.out.println(temp);
                helper(candidates , temp ,res , i  , target-candidates[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
}